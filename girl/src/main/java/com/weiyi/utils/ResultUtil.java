package com.weiyi.utils;

import com.weiyi.domain.Result;

/**
 * Created by weiyi on 2017/8/4/004.
 */
public class ResultUtil {

    public static Result success(Object o){
        return new Result(0,"成功",o);
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg) {
        return new Result(code,msg);
    }
}
