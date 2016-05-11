package com.kite.search.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author hasee
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Resource {

	/**
	 * id:现在不使用，后期可能用db存储
	 */
	private String id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 资源url地址
	 */
	private String url;

	/**
	 * 资源描述
	 */
	private String desc;

}
