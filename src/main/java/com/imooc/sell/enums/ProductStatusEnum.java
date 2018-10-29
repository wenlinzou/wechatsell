package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author mqliu
 * @date 2018/10/29 14:50:10
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
