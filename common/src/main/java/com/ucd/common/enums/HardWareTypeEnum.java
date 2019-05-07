package com.ucd.common.enums;

import lombok.Getter;

/**
 * Created by crayon on 2019/5/5.
 */
@Getter
public enum HardWareTypeEnum {


    CPU("cpu", "CPU"),
    DISK("disk", "DISK"),
    MEM("mem", "MEM"),
    NIC("nic", "网络"),
    THREAD("thread", "进程"),
    ;
    public String value;
    public String description;

    private HardWareTypeEnum(String value, String description){
        this.value = value;
        this.description = description;
    }

}
