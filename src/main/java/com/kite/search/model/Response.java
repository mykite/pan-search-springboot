package com.kite.search.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 响应结果类
 * 
 * @author hasee
 *
 */
@Getter
@Setter
@ToString
public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4025749323070224006L;

	private boolean success = false;
	private String message;

	/**
	 * 当前页
	 */
	private long currentPage;

	/**
	 * 共多少页
	 */
	private long totalPage;

	/**
	 * 共多少条
	 */
	private long totalSize;

	/**
	 * 开始页数
	 */
	private long startPage;

	/**
	 * 结束页数
	 */
	private long endPage;

	/**
	 * 分页返回数据模型
	 */
	private List<Resource> results;

	private int pageSize = 10;

	/**
	 * 设置总条数的同时计算总页数
	 * 
	 * @param totalSize
	 */
	public void setTotalSize(long totalSize) {
		// 更新为正确
		this.success = true;
		this.totalSize = totalSize;
		if (totalSize % pageSize == 0) {
			this.totalPage = totalSize / pageSize;
		} else {
			this.totalPage = totalSize / pageSize + 1;
		}
		//currentPage:10 10 - 5 > 1  5
		//12 -    
		this.startPage = currentPage - (pageSize / 2) > 1 ? currentPage - (pageSize / 2) : 1;
		this.endPage = startPage + pageSize - 1 < totalPage ? startPage + pageSize - 1 : totalPage;
	}   
}
