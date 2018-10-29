package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @description
 * @author mqliu
 * @date 2018/10/29 14:21
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 所有上架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //减库存

    //减库存
}
