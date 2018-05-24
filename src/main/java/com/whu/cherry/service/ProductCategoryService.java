package com.whu.cherry.service;

import com.whu.cherry.entity.ProductCategory;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/19 21:33
 */
public interface ProductCategoryService {
    ProductCategory findById(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByTypeList(List<Integer> categoryTypeList);
    boolean add(ProductCategory productCategory);
}
