package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @description 订单状态
 * @author mqliu
 * @date 2018/10/29 17:28
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
