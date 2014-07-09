package cn.ddd.core.service.impl;

import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ddd.core.dao.AccountRepository;
import cn.ddd.core.security.domain.UserAccount;
import cn.ddd.core.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private AccountRepository userAccountDao;
	@Autowired
	private PasswordService passwordService;

	@Transactional
	public void register(UserAccount userAccount) {

		Object password = userAccount.getCredentials();

		Object encrypted = passwordService.encryptPassword(password);

		userAccount.setPassword(encrypted.toString());

		userAccountDao.save(userAccount);
	}
}