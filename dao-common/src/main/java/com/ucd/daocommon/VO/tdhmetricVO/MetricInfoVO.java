package com.ucd.daocommon.VO.tdhmetricVO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MetricInfoVO {


    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ename")
    private String enname;
    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("creattime")
    private Date creattime;
}
