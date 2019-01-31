package com.ucd.server.exception;


import com.ucd.common.enums.ResultExceptEnum;
import com.ucd.common.exception.BaseException;


public class DaoException extends BaseException {


    public DaoException(String code, String message) {
        super(code, message);
    }

    public DaoException(ResultExceptEnum resultEnum) {
        super(resultEnum);
    }

    public DaoException(ResultExceptEnum resultEnum, String message) {
        super(resultEnum, message);
    }
}
