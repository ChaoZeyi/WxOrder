package com.whu.cherry.dao;

import com.whu.cherry.entity.ProductCategory;
import org.assertj.core.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author cherry
 * @date 2018/5/19 20:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Test
    public void findById() throws Exception {
        ProductCategory productCategory = productCategoryDao.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByTypeList() throws Exception {
        List<Integer> typeList = new ArrayList<>();
        typeList.add(9);
        typeList.add(11);
        List<ProductCategory> productCategoryList = productCategoryDao.findByTypeList(typeList);
        System.out.println(productCategoryList.get(0).toString());
        System.out.println(productCategoryList.get(1).toString());
        Assert.assertEquals(2, productCategoryList.size());

    }

    @Test
    public void findAll(){
        List<ProductCategory> productCategoryList = productCategoryDao.findAll();
        for (ProductCategory productCategory:productCategoryList) {
            System.out.println(productCategory.toString());
        }
    }



    @Test
    public void add() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("最热榜");
        productCategory.setCategoryType(9);
        productCategoryDao.add(productCategory);

    }

    @Test
    public void updateById() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(1);
        productCategory.setCategoryType(11);
        productCategoryDao.updateById(productCategory);
    }



}