package com.ucd.common.enums;

import lombok.Getter;

/**
 * 返回枚举类
 * <p>Title: ExceptionEnum</p>
 *
 * @author lx
 * @date
 */
@Getter
public enum ResultEnum {

    RESULT_SUCCESS("000000", "成功"),
    RESULT_FAIL("111111", "失败"),
    RESULT_PARAMETER("222222", "参数有误");

    private String code;

    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
