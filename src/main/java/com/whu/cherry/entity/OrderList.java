package com.whu.cherry.entity;

import lombok.Data;

/**
 * @author cherry
 * @date 2018/5/19 19:05
 */
@Data
public class OrderList {

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private Double orderAmount;
    private Integer orderStatus;
    private Integer payStatus;

}
