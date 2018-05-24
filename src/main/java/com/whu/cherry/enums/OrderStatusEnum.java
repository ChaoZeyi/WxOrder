package com.whu.cherry.enums;

/**
 * 订单状态枚举类，默认新下单
 *
 * @author cherry
 * @date 2018/5/24 20:16
 */
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISHED(1, "已完成"),
    CANCELED(2,"已取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
