package com.ucd.common.exception;


import com.ucd.common.enums.ResultExceptEnum;

public class BaseException extends RuntimeException {

    private String code;

    private String message;

    public BaseException(String code, String message){
        super(message);
        this.code = code;
    }

    public BaseException(ResultExceptEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();

    }

    public BaseException(ResultExceptEnum resultEnum, String message){
        super(resultEnum.getMessage()+","+message);
        this.code = resultEnum.getCode();

    }
}
