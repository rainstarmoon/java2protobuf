package com.xiazeyu.util;

import java.util.HashMap;
import java.util.Map;

public class MainArgsUtil {

    public static Map<String, String> argMap = new HashMap<>();

    public static void analysis(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("--") && arg.contains(":")) {
                String[] split = arg.split(":");
                argMap.put(split[0].substring(2), split[1]);
            }
        }
    }

}
