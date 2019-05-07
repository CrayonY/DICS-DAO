package com.ucd.common.utils;


import com.ucd.common.enums.ResultEnum;
import com.ucd.common.VO.ResultVO;

public class ResultVOUtil {

    public  static ResultVO setResult(String code , String msg, Object data){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setSuccess(ResultEnum.RESULT_SUCCESS.getCode().equals(code));
        resultVO.setMsg(msg);
        resultVO.setData(data);
        return  resultVO;
    }


    public static ResultVO error(Exception e){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultEnum.RESULT_FAIL.getCode());
        resultVO.setSuccess(false);
        resultVO.setMsg(ResultEnum.RESULT_FAIL.getMessage());
        resultVO.setData(e);
        return  resultVO;
    }
}
