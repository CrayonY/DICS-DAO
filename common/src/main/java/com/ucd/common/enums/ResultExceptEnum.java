package com.ucd.common.enums;

import lombok.Getter;

/**
 * 异常枚举类
 * <p>Title: ExceptionEnum</p>  
 * @author  lx  
 * @date    
 */
@Getter
public enum ResultExceptEnum {

	ERROR_NOFOUND("10000","无法找到相应的数据"),
	ERROR_NOFOUND_USER("10001","无法找到相应的用户数据"),
	ERROR_INSERT("20000","插入失败"),
	ERROR_PARAMETER("30000","参数有误"),
	ERROR_PARAMETER_SYNCSTATE("30001","参数有误，已是正在处理状态，不需要再次审核！"),
	ERROR_PARAMETER_AUDITSTATEING("30002","参数有误，已是正在审核状态，不需要再次审核！"),
	RROR_PARAMETER_AUDITSTATED("30002","参数有误，已是审核完毕状态，不需要再次审核！"),
	RROR_PARAMETER_AUDITSTATEFAIL("30003","参数有误，审核未通过，不可同步操作！"),
	RROR_PARAMETER_SYNCSTATEING("30004","参数有误，已是正在处理状态，不需要再次同步！"),
	ERROR_SELECT("40000","查询失败"),
	ERROR_UPDATE("50000","修改失败"),
	ERROR_HTTP("60000","接口异常"),
	ERROR_HTTP_COOKIE("60001","接口异常,COOKIE不存在！");

	private String code;

	private String message;

	ResultExceptEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
