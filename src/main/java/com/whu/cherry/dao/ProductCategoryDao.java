package com.whu.cherry.dao;

import com.whu.cherry.entity.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/19 19:12
 */
@Repository
public interface ProductCategoryDao {
    ProductCategory findById(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByTypeList(List<Integer> categoryTypeList);
    boolean add(ProductCategory productCategory);
    boolean updateById(ProductCategory productCategory);
}
