package com.ucd.daocommon.VO.hardwareVO;

import lombok.Data;

import java.util.Date;

/**
 * Created by crayon on 2019/4/2.
 */
@Data
public class HardWareMemVO {

    private String id;

    private String host;

    private Double memcount;

    private Double memusedper;

    private String memstatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String nip;

    private String checktimeStart;

    private String checktimeEnd;

}
