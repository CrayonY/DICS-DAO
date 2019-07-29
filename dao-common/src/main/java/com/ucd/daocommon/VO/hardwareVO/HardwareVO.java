package com.ucd.daocommon.VO.hardwareVO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class HardwareVO {

    private Double cpu;

    private Double vcpu;

    private Double memused;

    private Double memtotal;

    private Double memusedper;

    private List<Double> diskstatus;

    private String Nip;

    private String intime;

    private String host;

    private Date creattime;

    private String startdownTimems;

    private String startupTimems;

    private Double cputemp;

}
