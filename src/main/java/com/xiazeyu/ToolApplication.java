package com.xiazeyu;

import java.io.*;
import java.util.*;

public class ToolApplication {

    static String inputPath;

    static String outputPath;

    static List<String> contextList;

    static String PLACEHOLDER = "$";

    /**
     * 解析步骤
     * 1、读取java文件
     * 2、java -> proto
     * 3、输出proto文件
     *
     * @param args
     */
    public static void main(String[] args) {
        init(args);
        inputJavaFile();
        transform();
        outputProtoFile();
    }

    public static void init(String[] args) {
        contextList = new ArrayList<>();
        Map<String, String> argMap = new HashMap<>();
        for (String arg : args) {
            if (arg.startsWith("--") && arg.contains(":")) {
                String[] split = arg.split(":");
                argMap.put(split[0].substring(2), split[1]);
            }
        }
        inputPath = argMap.get("in");
        outputPath = argMap.get("out");
        if (inputPath == null || outputPath == null) {
            throw new RuntimeException("输入参数有误");
        }
        //inputPath = "E:\\workspace_idea\\java2protobuf\\demo\\BondInfo.java";
        //outputPath = "E:\\workspace_idea\\java2protobuf\\demo\\temp.proto";
    }


    public static void transform() {
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

        Map<Integer, List<String>> commentMap = new HashMap<>();
        commentMap.put(0, new ArrayList<>());
        List<String> comments = new ArrayList<>();
        for (int i = 0; i < contextList.size(); i++) {
            String trim = contextList.get(i).trim();
            if (trim.startsWith("//") || trim.startsWith("/*") || trim.startsWith("*") || trim.startsWith("*/")) {
                comments.add(contextList.get(i));
            } else {
                commentMap.put(i, comments);
                comments = new ArrayList<>();
            }
        }

        Map<Integer, String> contextMap = new TreeMap<>();
        for (Integer num : commentMap.keySet()) {
            contextMap.put(num, contextList.get(num)
                    .replace("public class", "message")
                    .replace("private ", "")
                    .replace("int ", "int32 ")
                    .replace("Integer ", "int32 ")
                    .replace("Integer,", "int32,")
                    .replace("Integer>", "int32 ")
                    .replace("long ", "int64 ")
                    .replace("Long ", "int64 ")
                    .replace("Long,", "int64,")
                    .replace("Long>", "int64 ")
                    .replace("Double ", "double ")
                    .replace("Double>", "double ")
                    .replace("boolean ", "bool ")
                    .replace("Boolean ", "bool ")
                    .replace("Boolean>", "bool ")
                    .replace("Date ", "int64 ")
                    .replace("Date,", "int64,")
                    .replace("Date>", "int64 ")
                    .replace("String ", "string ")
                    .replace("String,", "string,")
                    .replace("String>", "string ")
                    //.replace(">", " ")
                    .replace("Map<", "map<")
                    .replace("List<", "repeated ")
                    .replace(">>", "s" + PLACEHOLDER)
                    .replace(">", "")
                    .replace(PLACEHOLDER, ">")
                    .replaceAll("[,]\\s*repeated", ", ")
                    .replace("  ", " ")
                    .replaceAll("\\t", "    ")
            );
        }

        int index = 1;
        contextList = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : contextMap.entrySet()) {
            List<String> strings = commentMap.get(entry.getKey());
            if (strings != null) {
                contextList.addAll(strings);
            }
            String value = entry.getValue();
            if (value.contains(";")) {
                value = value.replace(";", " = " + index + ";");
                index++;
            }
            if (value.contains("@")) {
                continue;
            }
            if (value.trim().equals("")) {
                continue;
            }
            contextList.add(value);
        }
        contextList.add("}");
    }


    public static void inputJavaFile() {
        BufferedReader read = null;
        try {
            read = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath), "UTF8"));
            String readLine;
            while ((readLine = read.readLine()) != null) {
                contextList.add(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void outputProtoFile() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath), "UTF8"));
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

}
