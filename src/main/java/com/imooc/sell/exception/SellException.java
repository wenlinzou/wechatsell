package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * @description
 * @author mqliu
 * @date 2018/10/30 9:27
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
