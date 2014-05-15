/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package cn.ddd.core.security.domain;

/**
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月10日<br>
 *          Copyright 2014 XXX有限公司.
 */
public class Resource {
	private Action[] allowed;

	public Action[] getAllowed() {
		return allowed;
	}

	public void setAllowed(Action[] allowed) {
		this.allowed = allowed;
	}
}
