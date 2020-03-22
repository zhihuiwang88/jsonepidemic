package com.json.web.exception;

import com.json.web.enums.ResultEnum;

public class JsonException extends RuntimeException{

	/**
	 * json异常处理
	 * 20200202
	 */
	private static final long serialVersionUID = 327338334705493594L;

	public JsonException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
	}
	
	
}
