package com.ucd.common.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ucd.common.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable {
    /**
     * 错误码 0成功 非0具体错误原因
     */
    private  String code;

    /**
     * 状态
     */
    private  Boolean success;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

    @JsonIgnore
    private String messageKey;

    public static class Builder {
        public static <T> ResultVO<T> SUCC() {
            ResultVO<T> vo = new ResultVO<T>();
            vo.setCode("000000");
            return vo;
        }

        public static <T> ResultVO<T> FAIL() {
            ResultVO<T> vo = new ResultVO<T>();
            return vo;
        }
    }

    public static <T> ResultVO<T> SUCC() {
        return Builder.SUCC();
    }

    public static <T> ResultVO<T> SUCC(T data) {
        ResultVO<T> result = new ResultVO<T>();
        result.setCode("000000");
        result.setData(data);
        return result;
    }

    public static <T> ResultVO<T> FAIL() {
        return Builder.FAIL();
    }

    public static <T> ResultVO<T> FAIL(T data) {

        ResultVO<T> result = new ResultVO<T>();
        result.setData(data);
        return result;
    }

    public ResultVO<T> initSuccMsgKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }

    public ResultVO<T> initErrCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public ResultVO<T> initErrCodeAndMessageKey(String code, String messageKey) {
        this.code = code;
        this.messageKey = messageKey;
        return this;
    }

    public ResultVO<T> initErrCodeAndMsg(int code, String msg) {
        this.code = Integer.toString(code);
        this.msg = msg;
        return this;
    }

    public ResultVO<T> initSuccCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public ResultVO<T> initSuccData(T data) {
        this.data = data;
        return this;
    }

    public static <T> ResultVO<T> FAIL(String code, String msg) {
        return ResultVO.FAIL(code, msg, null);
    }

    public static <T> ResultVO<T> FAIL(String code, String msg, T data) {
        ResultVO<T> result = ResultVO.Builder.FAIL();
        result.initErrCodeAndMsg(code, msg);
        result.setSuccess(Boolean.valueOf(ResultEnum.RESULT_SUCCESS.getCode().equals(code)));
        result.setData(data);
        return result;
    }

    public static <T> ResultVO<T> SUCC(String code, String msg) {
        return ResultVO.SUCC(code, msg, null);
    }

    public static <T> ResultVO<T> SUCC(String code, String msg, T data) {
        ResultVO<T> result = ResultVO.Builder.SUCC();
        result.setSuccess(ResultEnum.RESULT_SUCCESS.getCode().equals(code));
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
