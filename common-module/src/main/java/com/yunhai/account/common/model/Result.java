package com.yunhai.account.common.model;

import java.io.Serializable;

/**
 * 统一返回格式
 * @author fuzl
 * @version v 0.1 2018/7/27 14:07 fuzl
 * @description
 */
public class Result<D> implements Serializable {

    private static final long serialVersionUID = -1L;
    private static final int SUCCESS_CODE = 0;
    private D data;
    private boolean success;
    private int code;
    private String message;

    public Result() {
    }

    public static <D> Result<D> wrapSuccessfulResult(D data) {
        Result<D> result = new Result();
        result.data = data;
        result.success = true;
        result.code = 0;
        return result;
    }

    public static <T> Result<T> wrapSuccessfulResult(String message, T data) {
        Result<T> result = new Result();
        result.data = data;
        result.success = true;
        result.code = 0;
        result.message = message;
        return result;
    }

    public static <D> Result<D> wrapErrorResult(int code, String message) {
        Result<D> result = new Result();
        result.success = false;
        result.code = code;
        result.message = message;
        return result;
    }

    public D getData() {
        return this.data;
    }

    public Result<D> setData(D data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public Result<D> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public int getCode() {
        return this.code;
    }

    public Result<D> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Result<D> setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("success=");
        sb.append(this.success);
        sb.append(",");
        sb.append("code=");
        sb.append(this.code);
        sb.append(",");
        sb.append("message=");
        sb.append(this.message);
        sb.append(",");
        sb.append("data=");
        sb.append(this.data);
        sb.append("}");
        return sb.toString();
    }
}
