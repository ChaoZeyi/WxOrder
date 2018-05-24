package com.whu.cherry.service.impl;

import com.whu.cherry.dao.ProductInfoDao;
import com.whu.cherry.entity.ProductInfo;
import com.whu.cherry.enums.ProductStatusEnum;
import com.whu.cherry.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/20 16:53
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getStatus());
    }

    @Override
    public List<ProductInfo> findByCategoryType(Integer categoryType) {
        return productInfoDao.findByCategoryType(categoryType);
    }
}
