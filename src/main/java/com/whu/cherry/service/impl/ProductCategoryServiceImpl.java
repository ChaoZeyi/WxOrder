package com.whu.cherry.service.impl;

import com.whu.cherry.dao.ProductCategoryDao;
import com.whu.cherry.entity.ProductCategory;
import com.whu.cherry.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/19 21:35
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategory findById(Integer categoryId) {
        return productCategoryDao.findById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByTypeList(List<Integer> categoryTypeList) {
        return productCategoryDao.findByTypeList(categoryTypeList);
    }

    @Override
    public boolean add(ProductCategory productCategory) {
        return productCategoryDao.add(productCategory);
    }
}
