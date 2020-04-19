package com.hellospring.domain;

import lombok.Data;

/**
 * データ
 * @author parkh
 */
@Data
public class Todo {

	/**
	 * ID
	 * @param 取得ID
	 * @return IDを返す
	 */
	private int id;
	/** タイトル */
	private String title;
	private String content;
}
