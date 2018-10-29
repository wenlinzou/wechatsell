package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 支付状态
 * @author mqliu
 * @date 2018/10/29 17:31:35
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
