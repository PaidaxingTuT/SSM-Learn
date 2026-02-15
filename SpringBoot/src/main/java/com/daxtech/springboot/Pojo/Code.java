package com.daxtech.springboot.Pojo;

public enum Code {

    SUCCESS(200, "操作成功"),
    ERROR(404, "网络错误");

    private final int code;
    private final String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
