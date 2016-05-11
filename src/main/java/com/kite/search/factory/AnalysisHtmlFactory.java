package com.kite.search.factory;

import com.kite.search.analysis.AnalysisBingHtml;
import com.kite.search.analysis.AnalysisHtml;
import com.kite.search.common.enums.ErrorEnum;
import com.kite.search.common.enums.SearchTypeEnum;
import com.kite.search.common.exceptions.PanException;

/**
 * 解析html工厂类
 * @author hasee
 *
 */
public class AnalysisHtmlFactory {
	
	/**
	 * 根据更新的搜索类型返回对应的解析html类
	 * @param searchType			搜索类型
	 * @return						对应的解析类
	 */
	public static AnalysisHtml getAnalysisHtml(String searchType) {
		if(SearchTypeEnum.BING.getType().equals(searchType)) {
			return new AnalysisBingHtml();
		} else {
			throw new PanException(ErrorEnum.NOT_SUPPORT_SEARCH_TYPE.getCode(), ErrorEnum.NOT_SUPPORT_SEARCH_TYPE.getMsg());
		}
	}
}
