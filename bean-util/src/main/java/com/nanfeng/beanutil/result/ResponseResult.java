package com.nanfeng.beanutil.result;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean success;
    private String message;
    private T data;

    public ResponseResult(){}
    public ResponseResult(boolean success, String message, T data){
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static ResponseResult success(String message){
        return new ResponseResult(true,message,null);
    }
    public static <T> ResponseResult success(String message,T data){
        return new ResponseResult(true, message, data);
    }
    public static ResponseResult error(String message){
        return new ResponseResult(false,message,null);
    }
    public static <T> ResponseResult error(String message,T data){
        return new ResponseResult(false, message, data);
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

