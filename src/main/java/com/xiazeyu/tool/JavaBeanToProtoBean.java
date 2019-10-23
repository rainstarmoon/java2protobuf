package com.xiazeyu.tool;

import com.xiazeyu.util.FileUtil;
import com.xiazeyu.util.MainArgsUtil;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class JavaBeanToProtoBean {

    static String inputPath;

    static String outputPath;

    static List<String> contextList;

    static List<String> resultList;

    static String sourceObjName = "value";

    static String targetObjName = "builder";

    static String pbBeanName;

    static String javaBeanName;

    public static void init(String[] args) {
        contextList = new ArrayList<>();
        resultList = new ArrayList<>();
        MainArgsUtil.analysis(args);
//        inputPath = MainArgsUtil.argMap.get("in");
//        outputPath = MainArgsUtil.argMap.get("out");
        pbBeanName = MainArgsUtil.argMap.get("name");
        javaBeanName = pbBeanName.split("[.]")[1];
//        if (inputPath == null || outputPath == null) {
//            throw new RuntimeException("输入参数有误");
//        }
        inputPath = "D:\\Github_Workspace\\java2protobuf\\demo\\JavaBeanToProtoBean\\javaBean.txt";
        outputPath = "D:\\Github_Workspace\\java2protobuf\\demo\\JavaBeanToProtoBean\\protoBean.txt";
    }

    public static void transform() {
        FileUtil.inputJavaFile(inputPath, contextList);

        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < contextList.size(); i++) {
            String temp = contextList.get(i);
            if (beginIndex == 0 && temp.startsWith("public class")) {
                beginIndex = i;
                continue;
            }
            if (beginIndex > 0 && temp.contains("{")) {
                endIndex = i;
                break;
            }
        }
        contextList = contextList.subList(beginIndex, endIndex);

        List<String> fields = new ArrayList<>();
        for (int i = 1; i < contextList.size(); i++) {
            String trim = contextList.get(i).trim();
            if (trim.startsWith("//")
                    || trim.startsWith("/*")
                    || trim.startsWith("*")
                    || trim.startsWith("*/")
                    || trim.startsWith("@")
                    || trim.equals("")
            ) {
                continue;
            }
            fields.add(trim.replace("private ", "").replace(";", "").replace(", ", ","));
        }

        resultList.add("\tpublic " + pbBeanName + " convertPbBean() {");
        resultList.add("\t\t" + javaBeanName + " " + sourceObjName + " = this;");
        resultList.add("\t\t" + pbBeanName + ".Builder builder = " + pbBeanName + ".newBuilder();");

        for (String context : fields) {
            DataModel analysis = analysis(context);

            if (!analysis.fieldType.equals("boolean")
                    && !analysis.fieldType.equals("int")
                    && !analysis.fieldType.equals("double")) {
                resultList.add("\t\tif (" + sourceObjName + "." + analysis.getFieldGetMethod(null) + "() != null) {");
            }

            String fieldGetMethod = "";
            if (analysis.fieldType.equals("Date")) {
                fieldGetMethod = analysis.getFieldGetMethod("Date");
            } else {
                fieldGetMethod = analysis.getFieldGetMethod(null);
            }
            resultList.add("\t\t\t" + targetObjName + "." + analysis.getFieldSetMethod() + "(" + sourceObjName + "." + fieldGetMethod + "()" + ");");

            if (!analysis.fieldType.equals("boolean")
                    && !analysis.fieldType.equals("int")
                    && !analysis.fieldType.equals("double")) {
                resultList.add("\t\t}");
            }
        }
        resultList.add("\t\treturn builder.build();");
        resultList.add("\t}");

        FileUtil.outputProtoFile(outputPath, resultList);
    }

    public static DataModel analysis(String context) {
        DataModel model = new DataModel();
        String[] split = context.split("[ ]");
        model.fieldType = split[0];
        String temp = split[1];
        model.fieldName = split[1];
        return model;
    }

    static class DataModel {
        String fieldType;
        String fieldName;

        public String getFieldSetMethod() {
            String value = null;
            if (fieldType.contains("List")) {
                value = "addAll";
            } else if (fieldType.contains("Set")) {
                value = "addAll";
            } else if (fieldType.contains("Map")) {
                value = "putAll";
            } else {
                value = "set";
            }
            return value + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        }

        public String getFieldGetMethod(String mode) {
            String value = null;
            if (fieldType.contains("boolean")) {
                return fieldName;
            } else {
                if ("Date".equals(mode)) {
                    return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + "().getTime";
                }
                return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            }
        }
    }

}
