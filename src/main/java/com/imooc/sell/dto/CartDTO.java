package com.imooc.sell.dto;

import lombok.Data;

/**
 * @description
 * @author mqliu
 * @date 2018/10/30 9:52
 */
@Data
public class CartDTO {
    /**商品id*/
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
