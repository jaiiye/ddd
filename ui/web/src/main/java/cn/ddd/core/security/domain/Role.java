package cn.ddd.core.security.domain;

import java.util.Set;

import org.apache.shiro.authz.Permission;

import com.google.common.collect.Sets;

/**
 * 用户角色<br>
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月18日 Copyright 2014 XXX有限公司.
 */
public class Role extends Entity {
	private String name;
	private Set<Permission> permissions = Sets.newHashSet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void addPermission(Permission permission) {
		permissions.add(permission);
	}

	private void removePermission(String permission) {
		permissions.remove(permission);
	}
}