package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Optional;


/**
 * @author mqliu
 * @date 2018/10/29 10:22:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory category = new ProductCategory();
        category.setCategoryId(1);
        Example<ProductCategory> example = Example.of(category);
        Optional<ProductCategory> one = repository.findOne(example);
        System.out.println(one.toString());

        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional//执行完成后不侵染数据库
    public void saveTest() {
        ProductCategory category = new ProductCategory("你最爱", 4);
        ProductCategory result = repository.save(category);
//        Assert.assertNotNull(result);
        Assert.assertNotEquals(null, result);//不希望是null，实际是result
    }

    @Test
    public void updateTest() {
        ProductCategory category = new ProductCategory();
        category.setCategoryId(2);
        category.setCategoryName("男生最爱");
        category.setCategoryType(3);
        repository.save(category);
    }

    @Test
    public void update2Test() {
        Optional<ProductCategory> optional = repository.findById(2);
        ProductCategory category = optional.get();
        category.setCategoryType(5);
        repository.save(category);
    }
}