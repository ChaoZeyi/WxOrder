package com.whu.cherry.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author cherry
 * @date 2018/5/20 20:52
 */

/**
 * 返回给前端的JSON
 */
@Data
public class ResultVo {
    private Integer code;
    private String msg;
    @JsonProperty("data")
    private List<DataVo> dataVoList;
}
