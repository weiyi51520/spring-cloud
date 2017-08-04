package com.weiyi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * http请求返回的最外层对象
 * Created by weiyi on 2017/8/4/004.
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
