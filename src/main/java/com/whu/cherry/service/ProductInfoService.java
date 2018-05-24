package com.whu.cherry.service;

import com.whu.cherry.entity.ProductInfo;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/20 16:53
 */
public interface ProductInfoService {

    List<ProductInfo> findUpAll();

    List<ProductInfo> findByCategoryType(Integer categoryType);



    //加库存 减库存
}
