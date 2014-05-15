/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package ui.web.shiro;

import static org.junit.Assert.*;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.junit.Test;

import ui.web.realm.PermissionFactory;

/**
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月10日<br>
 *          Copyright 2014 XXX有限公司.
 */
public class PermissionTest {
	@Test
	public void testWildcatPermission() {
		WildcardPermission permission = new WildcardPermission("*");

		WildcardPermission theOtherPermission = new WildcardPermission(
				"printer:print");
		assertTrue(permission.implies(theOtherPermission));
	}

	@Test
	public void testLevles() {
		Permission firstPermission = PermissionFactory
				.getWildcardPermission("printer:*");
		Permission secondPermission = PermissionFactory
				.getWildcardPermission("printer");

		assertTrue(firstPermission.implies(secondPermission));
	}
}