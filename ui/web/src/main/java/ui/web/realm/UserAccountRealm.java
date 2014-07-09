/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package ui.web.realm;

import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.springframework.context.ApplicationListener;

import cn.ddd.core.dao.AccountRepository;
import cn.ddd.core.events.UserAccountEvent;
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
public class UserAccountRealm extends BaseSecurityRealm implements ApplicationListener<UserAccountEvent> {
	private AccountRepository userAccountDao;

	public void setUserAccountDao(AccountRepository userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	@Override
	protected Collection<Permission> findPermissionsByRoleName(String roleName) {
		return null;
	}

	@Override
	protected UserAccount findUserAccountByUsername(String username) {
		return userAccountDao.findUserAccountByUsername(username);
	}

	@Override
	public void onApplicationEvent(UserAccountEvent event) {
		clearCache(event.getUserAccount().getPrincipals());
	}
}