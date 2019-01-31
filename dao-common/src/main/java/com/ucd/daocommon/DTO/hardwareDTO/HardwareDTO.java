package com.ucd.daocommon.DTO.hardwareDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class HardwareDTO {

    private Double cpu;

    private Double vcpu;

    private Double memused;

    private Double memtotal;

    private Double memusedper;

    private List<Double> diskstatus;
    @JsonProperty("Nip")
    private String Nip;

    private String intime;

    private String host;

    private Date creattime;

    private String startTimems;

    private String endTimems;

}
