package cn.ddd.core.security.domain;

/**
 * 系统枚举类<br>
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月18日 Copyright 2014 XXX有限公司.
 */
public class System extends Entity{
	public static final String ATTR_NAME = "name";
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}