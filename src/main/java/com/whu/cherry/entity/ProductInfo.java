package com.whu.cherry.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author cherry
 * @date 2018/5/19 15:46
 */
@Data
public class ProductInfo {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

//    状态，0正常（默认），1下架

    private Integer productStatus;

    private Integer categoryType;



}
