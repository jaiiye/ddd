package cn.ddd.core.service;

import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ddd.core.dao.UserAccountDao;
import cn.ddd.core.security.domain.UserAccount;

@Service
public class UserService {
	@Autowired
	private UserAccountDao userAccountDao;
	@Autowired
	private PasswordService passwordService;

	public void register(UserAccount userAccount) {

		Object password = userAccount.getCredentials();

		Object encrypted = passwordService.encryptPassword(password);

		userAccount.setPassword(encrypted.toString());

		userAccountDao.persist(userAccount);
	}
}