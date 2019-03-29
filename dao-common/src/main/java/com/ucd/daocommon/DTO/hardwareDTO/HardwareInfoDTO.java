package com.ucd.daocommon.DTO.hardwareDTO;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class HardwareInfoDTO {

    private HardwareCpuDTO cpu;

    private HardwareMemDTO mem;

    private HardwareDiskDTO disk;

    private String nip;

    private String intime;

    private String starttime;

    private String host;

    private List<HardwareThreadDTO> pid;

    private List<HardwareNicDTO> nic;

    private String thread;

    private Date creattime;

    private String startTimems;

    private String endTimems;

}
