package com.kite.search;

import com.kite.search.model.Request;
import com.kite.search.model.Response;

/**
 * 使用bing搜索引擎
 * @author hasee
 *
 */
public class BingSearch extends SimpleSearch {

	/**
	 * 默认搜索前缀
	 */
	String prefixUrl = "http://cn.bing.com/search?q=site:pan.baidu.com+";

	@Override
	public Response searchByKeyword(Request request) {
		super.setPrefixUrl(prefixUrl);
		return super.searchByKeyword(request);
	}

}
