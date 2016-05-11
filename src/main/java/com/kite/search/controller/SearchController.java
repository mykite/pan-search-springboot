package com.kite.search.controller;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kite.search.common.enums.SearchTypeEnum;
import com.kite.search.factory.SearchFactory;
import com.kite.search.model.Request;
import com.kite.search.model.Response;

@RestController
@Slf4j
public class SearchController {

	@CrossOrigin(origins = "http://www.test.com", maxAge = 3600)
	@RequestMapping("/search")
	public Response search(Request request,HttpServletResponse servletResponse) {
		Response response = new Response();
		log.info("收到请求");
		if(StringUtils.isBlank(request.getKeyword())) {
			response.setMessage("请输入要搜索的关键字");
			return response;
		}
		if(!SearchTypeEnum.hasType(request.getSearchType())) {
			response.setMessage("搜索类型不存在");
			return response;
		}
		
		return SearchFactory.getSearch(request.getSearchType()).searchByKeyword(request);
	}
}
