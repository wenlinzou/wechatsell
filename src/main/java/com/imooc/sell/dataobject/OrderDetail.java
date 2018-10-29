package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 订单详情
 * @description
 * @author mqliu
 * @date 2018/10/29 18:35
 */
@Table(name="order_detail")
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    /***订单id*/
    private String orderId;

    /**商品id*/
    private String productId;

    /**商品名称*/
    private String productName;

    /**商品单价*/
    private BigDecimal productPrice;

    /**商品数量*/
    private Integer productQuantity;

    /**商品小图*/
    private String productIcon;
}
