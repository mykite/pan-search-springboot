package com.kite.search.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SearchTypeEnum {
	
	BING("BING", "必应")
	
	;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 描述
	 */
	private String desc;
	
	/**
	 * 判断是否you这个类型
	 * @param type
	 * @return
	 */
	public static boolean hasType(String type) {
		for(SearchTypeEnum temp : SearchTypeEnum.values()) {
			if(temp.getType().equals(type)) {
				return true;
			}
		}
		return false;
	}
}
