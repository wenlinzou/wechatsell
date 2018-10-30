package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description
 * @author mqliu
 * @date 2018/10/30 9:18
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)//属性为null的不展示
public class OrderDTO {
    /**订单id*/
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**买家手机*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信openid*/
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单状态，默认0新下单*/
    private Integer orderStatus;

    /**支付状态，默认0未支付*/
    private Integer payStatus;

    /**创建时间 - 将毫秒转换到秒*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**更新时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
