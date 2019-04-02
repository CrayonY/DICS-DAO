package com.ucd.daocommon.VO.hardwareVO;

import lombok.Data;

import java.util.Date;

/**
 * Created by crayon on 2019/4/2.
 */
@Data
public class HardWareCpuVO {

    private String id;

    private String host;

    private Double cpucount;

    private Double cpuusedper;

    private String cpustatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String nip;

    private String checktimeStart;

    private String checktimeEnd;


}
