package com.kite.search.analysis;


import com.kite.search.common.enums.ErrorEnum;
import com.kite.search.common.exceptions.PanException;
import com.kite.search.model.Response;

/**
 * 解析html
 * @author hasee
 *
 */
public abstract class AnalysisHtml {
	
	protected String decodeEncoding = DEFAULT_DECODE_ENCOING;

	private static final String DEFAULT_DECODE_ENCOING = "UTF-8";
	
	/**
	 * 解析给定的html
	 * @param html				给定的html
	 * @param urlEncoing		返回的url编码
	 * @return					解析后返回对象
	 */
	public abstract Response parseHtml(String html, String urlEncoing);
	
	/**
	 * 解析给定的html
	 * @param html				给定的html
	 * @return					解析后返回对象
	 */
	public Response parseHtml(String html) {
		return this.parseHtml(html, decodeEncoding);
	}
	
	/**
	 * 解析总页数为int
	 * @param str	类似结果为22,200 条结果
	 * @return		22200 
	 */
	public Long parseTotalCount(String str) {
		char[] chArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		if(chArr != null && chArr.length > 0) {
			for(int i = 0; i < chArr.length; i++) {
				if(chArr[i] >= '0' && chArr[i] <= '9') {
					sb.append(chArr[i]);
				}
			}
		} else {
			throw new PanException(ErrorEnum.INVALID_PARAMETER.getCode(), ErrorEnum.INVALID_PARAMETER.getMsg());
		}
		return Long.parseLong(sb.toString());
	}
}
