/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package ui.web.shiro;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月8日<br>
 *          Copyright 2014 XXX有限公司.
 */
public class IniTest {

	@Test
	public void test() {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory();
		SecurityUtils.setSecurityManager(factory.getInstance());

		Subject subject = SecurityUtils.getSubject();

		subject.isRemembered();

		subject.hasRoles(Arrays.asList(""));

	}

}
