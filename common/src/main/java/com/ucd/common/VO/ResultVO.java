package com.ucd.common.VO;

import lombok.Data;

@Data
public class ResultVO<T> {
    /**
     * 错误码
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
}
