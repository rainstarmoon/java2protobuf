package com.xiazeyu;

import com.xiazeyu.tool.JavaBeanToProtoBean;
import com.xiazeyu.tool.JavaFileToProtoFile;

public class ToolApplication {

    public static void main(String[] args) {
        //String name = "T3Initer.IborFundDiviData";
        javaFileToProtoFile(new String[]{});
        System.out.println("over");
    }

    /**
     * 解析步骤
     * 1、读取java文件
     * 2、java -> proto
     * 3、输出proto文件
     *
     * @param args
     */
    public static void javaFileToProtoFile(String[] args) {
        JavaFileToProtoFile.init(args);
        JavaFileToProtoFile.transform();
    }

    public static void javaBeanToProtoBean(String[] args) {
        JavaBeanToProtoBean.init(args);
        JavaBeanToProtoBean.transform();
    }

}
