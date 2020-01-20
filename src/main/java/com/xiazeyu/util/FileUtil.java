package com.xiazeyu.util;

import java.io.*;
import java.util.List;

public class FileUtil {

    public static void inputJavaFile(String inputPath, List<String> contextList) {
        BufferedReader read = null;
        try {
            read = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath), "UTF-8"));
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

    public static void outputProtoFile(String outputPath, List<String> contextList) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath), "UTF-8"));
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
