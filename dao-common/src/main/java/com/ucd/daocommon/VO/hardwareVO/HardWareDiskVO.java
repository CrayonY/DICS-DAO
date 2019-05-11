package com.ucd.daocommon.VO.hardwareVO;

import lombok.Data;

import java.util.Date;

/**
 * Created by crayon on 2019/4/2.
 */

@Data
public class HardWareDiskVO {
    private String id;

    private String host;

    private Double diskcount;

    private Double diskusedper;

    private String diskstatus;

    private Date creattime;

    private String checktime;

    private String prepare;

    private String checktimeStart;

    private String checktimeEnd;

}
