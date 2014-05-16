/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package ui.web.realm;

import java.util.Collection;

import org.apache.shiro.authz.Permission;

import cn.ddd.core.security.domain.UserAccount;
import cn.ddd.core.security.extend.realm.BaseSecurityRealm;

/**
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月9日<br>
 *          Copyright 2014 XXX有限公司.
 */
public class UserAccountRealm extends BaseSecurityRealm {
	@Override
	protected Collection<Permission> findPermissionsByRoleName(String roleName) {
		return null;
	}

	@Override
	protected UserAccount findUserAccountByUsername(String username) {
		UserAccount account = new UserAccount();

		account.setUsername(username);

		return account;
	}
}