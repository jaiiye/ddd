/** 
 * Copyright (C), 2014.
 * All right reserved.
 */
package cn.ddd.core.security.domain;

/**
 * 模块：值对象<br>
 * 描述：
 * 
 * @author 李乐 lile@ecode.net.cn
 * @version 1.0 2014-1-2<br>
 *          Copyright 2014
 */
public abstract class ValueObject {
	private long id;

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}
}