package com.nanfeng.beanutil.util;


import com.alibaba.fastjson.JSON;
import com.nanfeng.beanutil.result.ResponseResult;
import com.nanfeng.beanutil.result.ResponseResultCode;

public abstract class JSONUtil extends JSON {

    public static ResponseResult toResponseResult(String json){
        return parseObject(json, ResponseResult.class);
    }

    public static ResponseResultCode toResponseResultCode(String json){
        return parseObject(json, ResponseResultCode.class);
    }


}
