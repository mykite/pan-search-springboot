package com.kite.search.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import com.kite.search.common.enums.SearchTypeEnum;

/**
 * 搜索请求对象
 * 
 * @author hasee
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Request implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6571381055211146546L;

	/**
	 * 搜索类型,默认为bing
	 */
	private String searchType = SearchTypeEnum.BING.getType();

	/**
	 * 搜索关键字
	 */
	private String keyword;

	/**
	 * 当前页数
	 */
	private int currentPage = 1;
	
	/**
	 * 每页数量
	 */
	private int pageSize = 10;
}
