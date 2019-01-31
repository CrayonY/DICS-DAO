package com.ucd.server.enums;

import lombok.Getter;

@Getter
public enum UserServiceEnum {


    SUCCESS("000000","成功"),
    PARAM_ERROR("100001","传入参数格式错误"),
    NO_USER("100002","用户不存在"),
    USER_VALIDATE_FAILED("100003","用户身份验证失败"),
    ERROR("500","内部错误");

    private String code;

    private String message;

    UserServiceEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
