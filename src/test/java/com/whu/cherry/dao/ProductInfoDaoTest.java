package com.whu.cherry.dao;

import com.whu.cherry.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author cherry
 * @date 2018/5/20 16:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void add() throws Exception {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好喝");
        productInfo.setProductIcon("http://chke");
        productInfo.setCategoryType(11);

        productInfoDao.add(productInfo);

    }

    @Test
    public void findByProductStatus() throws Exception {

        List<ProductInfo> productInfos = productInfoDao.findByProductStatus(0);
        for (ProductInfo product: productInfos
             ) {
            System.out.println(product.toString());
        }

    }

    @Test
    public void findByCategoryType() throws Exception {

        List<ProductInfo> productInfos = productInfoDao.findByCategoryType(11);
        for (ProductInfo product: productInfos
                ) {
            System.out.println("........");
            System.out.println(product.toString());
        }
    }

}