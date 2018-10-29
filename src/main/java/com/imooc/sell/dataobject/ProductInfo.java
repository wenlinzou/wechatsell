package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 商品
 * @description
 * @author mqliu
 * @date 2018/10/29 14:11
 */
@Table(name = "product_info")
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    /**商品名称*/
    private String productName;

    /**商品单价*/
    private BigDecimal productPrice;

    /**库存*/
    private Integer productStock;

    /**描述*/
    private String productDescription;

    /**小图*/
    private String productIcon;

    /**状态0正常1下架*/
    private Integer productStatus;

    /**类目编号*/
    private Integer categoryType;

}
