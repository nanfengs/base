package com.nanfeng.beanutil.result;

import java.io.Serializable;

public class ResponseResultCode<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int DEFAULT_RESULT_CODE = 200;

    private Integer code;
    private String msg;
    private T data;

    public ResponseResultCode(){};
    public ResponseResultCode(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResultCode<T> result(String msg){
        return result(DEFAULT_RESULT_CODE, msg, null);
    }
    public static <T> ResponseResultCode<T> result(String msg, T data){
        return new ResponseResultCode<T>(DEFAULT_RESULT_CODE, msg, data);
    }
    public static <T> ResponseResultCode<T> result(Integer code, String msg){
        return result(code, msg, null);
    }
    public static <T> ResponseResultCode<T> result(Integer code, String msg, T data){
        return new ResponseResultCode<T>(code, msg, data);
    }



    public Integer getCode() {
        return code;
    }
    public ResponseResultCode setCode(Integer code) {
        this.code = code;
        return this;
    }
    public String getMsg() {
        return msg;
    }
    public ResponseResultCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public T getData() {
        return data;
    }
    public ResponseResultCode setData(T data) {
        this.data = data;
        return this;
    }

    public String toString() {
        return "ResponseResultCode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
