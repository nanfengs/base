package com.nanfeng.beanutil.util;


public class ThreadLocalUtil {
    private static final ThreadLocal<Object> tl = new ThreadLocal<>();

    public static <T> void set(T t){
        tl.set(t);
    }

    public static <T> T get(){
        return (T) tl.get();
    }

    public static void remove(){
        tl.remove();
    }
}
