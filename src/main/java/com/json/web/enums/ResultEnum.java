package com.json.web.enums;

public enum ResultEnum {

	TELNUM_IS_NULL(100,"Telnum IS NULL"),
	ENGINENO_IS_NULL(101,"Engineno IS NULL"),
	appCode_is_null(102,"appCode is null"),
	;
	
	
	ResultEnum(Integer code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	private Integer code;
	private String msg;
	
	public Integer getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	
	
	
	
}
