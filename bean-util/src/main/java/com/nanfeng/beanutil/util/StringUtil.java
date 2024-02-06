package com.nanfeng.beanutil.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

public class StringUtil{

    public static boolean hasLength(String str){
        if(str == null || str.equals("")){
            return false;
        }
        return true;
    }

    public static boolean noLength(String str){
        return ! hasLength(str);
    }
    /**
     *
     * @param str 明文
     * @param algorithm 摘要算法(SHA256)
     * @return
     */
    public static String getMessageDigest(String str, String algorithm){
        try {
            MessageDigest instance = MessageDigest.getInstance(algorithm);
            byte[] hash = instance.digest(str.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static final char[] number = {'0','1','2','3','4','5','6','7','8','9'
            ,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
            ,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static String randomStr(int len){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(number[random.nextInt(number.length)]);
        }
        return stringBuilder.toString();
    }

}
