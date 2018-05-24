package com.whu.cherry.enums;

import lombok.Getter;

/**
 * 商品状态枚举类，默认为0
 * @author cherry
 * @date 2018/5/20 17:03
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer status;
    private String message;

    ProductStatusEnum(Integer status, String message){
        this.status = status;
        this.message = message;
    }
}
