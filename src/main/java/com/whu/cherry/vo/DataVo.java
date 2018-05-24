package com.whu.cherry.vo;

/**
 * @author cherry
 * @date 2018/5/20 21:00
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 返回给前端的Data类型
 */
@Data
public class DataVo {

    //保证返回给前端的属性名是name

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductVo> productVoList;

//    public DataVo(String categoryName, Integer categoryType, List<ProductVo> productVoList){
//        this.categoryName = categoryName;
//        this.categoryType = categoryType;
//        this.productVoList = productVoList;
//    }
}
