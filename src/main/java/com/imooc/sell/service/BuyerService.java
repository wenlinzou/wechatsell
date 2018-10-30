package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 买家
 * @author mqliu
 * @date 2018/10/30 16:40:43
 */
public interface BuyerService {
    /**查询一个订单*/
    OrderDTO findOrderOne(String openid, String orderId);

    /**取消订单*/
    OrderDTO cancelOrder(String openid, String orderId);
}
