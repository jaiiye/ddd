package cn.ddd.core.security.domain;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * 组织<br>
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月18日 Copyright 2014 XXX有限公司.
 */
public class Group extends Entity {
	private Group parent;
	private String name;
	private Set<Group> children = Sets.newHashSet();
	/**
	 * 是否为管理组织
	 */
	private boolean admin;

	public boolean isRoot() {
		return parent == null;
	}

	public boolean isLeaf() {
		return children == null || children.isEmpty();
	}

	public void addChild(Group child) {
		children.add(child);
	}

	public void removeChild(Group child) {
		children.remove(child);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Group getParent() {
		return parent;
	}

	public void setParent(Group parent) {
		this.parent = parent;
	}

	public Set<Group> getChildren() {
		return children;
	}

	public void setChildren(Set<Group> children) {
		this.children = children;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}