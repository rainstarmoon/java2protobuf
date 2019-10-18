package com.xiazeyu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ToolApplication {

    /**
     * 解析步骤
     * 1、读取java文件
     * 2、加载转换规则
     * 3、java -> proto
     * 4、输出proto文件
     *
     * @param args
     */
    public static void main(String[] args) {
        String path = "D:\\Github_Workspace\\java2protobuf\\demo\\BondInfo.java";
        List<String> contextList = loadJavaFile(path);
        List<String> transform = transform(contextList, null);
        print(transform, "D:\\Github_Workspace\\java2protobuf\\demo\\temp.proto");
    }

    public static void print(List<String> contextList, String path) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "GBK"));
            for (String context : contextList) {
                out.write(context);
                out.newLine();
            }
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<String> transform(List<String> contextList, Map<String, String> ruleMap) {
        List<String> tempList = new ArrayList<>();
        for (String context : contextList) {
            context = context.replace("public class", "message");
            context = context.replace("private ", "");
            context = context.replace("private ", "");
            context = context.replace("String ", "string ");
            context = context.replace("int ", "int32 ");
            context = context.replace("Integer ", "int32 ");
            context = context.replace("long ", "int64 ");
            context = context.replace("Long ", "int64 ");
            context = context.replace("boolean ", "bool ");
            context = context.replace("Boolean ", "bool ");
            context = context.replace("Double ", "double ");
            context = context.replace("Date ", "int64 ");
            context = context.replace("List<", "repeated ");
            context = context.replace("Map<", "map<");
            tempList.add(context);
        }
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < tempList.size(); i++) {
            String temp = tempList.get(i);
            if (beginIndex == 0 && temp.startsWith("message")) {
                beginIndex = i;
                continue;
            }
            if (beginIndex > 0 && temp.contains("{")) {
                endIndex = i;
                break;
            }
        }

        List<String> resultList = new ArrayList<>();

        int index = 1;
        for (int i = beginIndex; i < endIndex; i++) {
            String temp = tempList.get(i);
            if (temp.contains(";")) {
                temp = temp.replace(";", "=" + index + ";");
                index++;
            }
            if (temp.contains("@")) {
                continue;
            }
            if (temp.trim().equals("")) {
                continue;
            }
            resultList.add(temp);
        }
        resultList.add("}");
        return resultList;
    }

    public static Map<String, String> ruleMaking() {
        return null;
    }

    public static List<String> loadJavaFile(String path) {
        List<String> contextList = new ArrayList<>();
        File file = new File(path);
        InputStreamReader reader = null;
        BufferedReader br = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file));
            br = new BufferedReader(reader);
            String readLine = null;
            while (true) {
                if ((readLine = br.readLine()) == null) break;
                contextList.add(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return contextList;
    }

}
