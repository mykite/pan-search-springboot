package com.kite.search.factory;

import com.kite.search.BingSearch;
import com.kite.search.Search;
import com.kite.search.common.enums.ErrorEnum;
import com.kite.search.common.enums.SearchTypeEnum;
import com.kite.search.common.exceptions.PanException;

/**
 * 搜索工厂
 * @author hasee
 *
 */
public class SearchFactory {

	/**
	 * 根据给定的类型返回对应的搜索类
	 * @param type			给定的类型
	 * @return				搜索类
	 */
	public static Search getSearch(String type) {
		if (SearchTypeEnum.BING.getType().equals(type)) {
			return new BingSearch();
		} else {
			throw new PanException(ErrorEnum.NOT_SUPPORT_SEARCH_TYPE.getCode(),
					ErrorEnum.NOT_SUPPORT_SEARCH_TYPE.getMsg());
		}
	}
}
