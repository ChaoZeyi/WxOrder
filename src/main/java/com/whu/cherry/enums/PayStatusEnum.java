package com.whu.cherry.enums;

/**
 * 支付状态枚举类，默认未支付
 *
 * @author cherry
 * @date 2018/5/24 20:20
 */
public enum PayStatusEnum {

    UNPAID(0, "未支付"),
    PAID(1, "已支付");


    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

}
