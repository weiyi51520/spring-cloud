package com.weiyi.exception;

import com.weiyi.enums.ResultEnum;

/**
 * Created by weiyi on 2017/8/4/004.
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
