/** 
 * Copyright (C), 2014.
 * All right reserved.
 */
package cn.ddd.core.domain;

import java.io.Serializable;

/**
 * 模块：值对象<br>
 * 描述：
 * 
 * @author 李乐 lile@ecode.net.cn
 * @version 1.0 2014-1-2<br>
 *          Copyright 2014
 */
public abstract class ValueObject<T extends Serializable> implements Serializable {
	private T id;

	protected T getId() {
		return id;
	}

	protected void setId(T id) {
		this.id = id;
	}
}