package com.kite.search;

import com.kite.search.model.Request;
import com.kite.search.model.Response;

/**
 * 搜索顶层借口
 * @author hasee
 *
 */
public interface Search {
	
	/**
	 * 根据关键字搜索结果
	 * @param keyword		关键字
	 * @return				根据关键字搜索到的返回结果
	 */
	Response searchByKeyword(Request request);
}
