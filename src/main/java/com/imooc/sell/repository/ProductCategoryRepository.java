package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description
 * @author mqliu
 * @date 2018/10/29 10:21
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
