package com.ucd.daocommon.DTO.hardwareDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class HardwareNowDTO {

    private String id;

    private String host;

    private Integer num;

    private String nip;

    private String intime;

    private Date creattime;

    private Double cpucount;

    private Double cpuusedper;

    private String cpustatus;

    private Double diskcount;

    private Double diskusedper;

    private String diskstatus;

    private Double memcount;

    private Double memusedper;

    private String memstatus;

    private String nicinout;

    private String nicstatus;

    private String nicids;

    private String pids;

    private String starttime;

    private String startTimems;

    private String endTimems;

    private Double cputemp;

    private String tablename;

}
