package com.kite.search.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorEnum {

	NOT_SUPPORT_PROTOCAL("NOT_SUPPORT_PROTOCAL", "不支持的协议"),
	
	
	IO_EXCEPTION("IO_EXCEPTION", "io异常"),
	
	
	INVALID_PARAMETER("INVALID_PARAMETER", "没有验证的参数"),
	
	NOT_SUPPORT_SEARCH_TYPE("NOT_SUPPORT_SEARCH_TYPE", "不支持的搜索类型")
	
	;
	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 错误消息
	 */
	private String msg;
}
