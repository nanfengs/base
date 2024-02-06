package com.nanfeng.beanutil.util;

public class SqlUtil {

    public static boolean hasSqlInject(String str){
        if (str != null && str.contains("'")) {
            return true;
        }
        return false;
    }


}
