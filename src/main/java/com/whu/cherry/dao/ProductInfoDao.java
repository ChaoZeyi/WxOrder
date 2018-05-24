package com.whu.cherry.dao;

import com.whu.cherry.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/20 16:26
 */
@Repository
public interface ProductInfoDao {

    boolean add(ProductInfo productInfo);

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByCategoryType(Integer categoryType);


}
