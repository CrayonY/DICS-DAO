package com.ucd.daocommon.DTO.tdhServicesDTO;

import lombok.Data;


import java.util.Date;

@Data

public class TdhServicesHealthckDTO {

    private String healthChecksId;
    private String type;
    private String result;
    private String detail;
    private String lastCheck;
    private Date creattime;
}
