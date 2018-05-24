package com.whu.cherry.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whu.cherry.entity.ProductInfo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author cherry
 * @date 2018/5/24 15:58
 */
@Data
public class ProductVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

//    public ProductVo(String productId, String productName, BigDecimal productPrice, String productDescription,
//                     String productIcon){
//        this.productId = productId;
//        this.productName = productName;
//        this.productPrice = productPrice;
//        this.productDescription = productDescription;
//        this.productIcon = productIcon;
//    }
}
