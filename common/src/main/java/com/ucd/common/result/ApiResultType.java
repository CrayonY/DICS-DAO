package com.ucd.common.result;


import lombok.Getter;

/**
 * Created by crayon on 2019/4/29.
 */

@Getter
public enum ApiResultType {
    SUCCESS("000000", "成功"),
    // 系统错误码
    SYS_ERROR("100001", "系统异常"),
    SYS_UPDATE("100002","系统升级"),
    PARAMETER_ILLEGAL("100003","请求参数不合法"),
    ;
    public String code;

    /**国际化语言（暂不需要）*/
    public String languageKey;

    public String message;

    ApiResultType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private ApiResultType(String code, String languageKey, String message) {
        this.code = code;
        this.languageKey = languageKey;
        this.message = message;
    }

    public static String getLanuageKeyByCode(String code){
        for (ApiResultType result :ApiResultType.values()){
            if(code.equals(result.getCode())){
                return result.getLanguageKey();
            }
        }
        return null;
    }
}
