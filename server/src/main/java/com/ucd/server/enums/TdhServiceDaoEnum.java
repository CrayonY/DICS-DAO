package com.ucd.server.enums;

import lombok.Getter;

/**
 * 异常枚举类
 * <p>Title: ExceptionEnum</p>  
 * @author  lx  
 * @date    
 */
@Getter
public enum TdhServiceDaoEnum {
    SUCCESS("000000","成功"),
    PARAM_ERROR("100001","传入参数格式错误"),
    TDH_SERVICE_DAO_FAIL("100002","服务指标入库失败"),
    PARAM_SERVICE_TABLE_NULL("100003","传入参数表名为空"),
    ERROR("500","内部错误");

    private String code;

    private String message;

    TdhServiceDaoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
