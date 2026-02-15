package com.daxtech.springboot.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private T data;
    private Integer code;
    private String msg;

    public static <T> Result<T> success(T data,Integer code) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(code);
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> error(String msg,Integer code) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}


