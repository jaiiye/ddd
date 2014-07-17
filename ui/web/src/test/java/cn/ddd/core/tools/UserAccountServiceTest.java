package cn.ddd.core.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ddd.core.security.application.UserService;
import cn.ddd.core.security.domain.UserAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-base.xml", "/spring-data.xml"})
public class UserAccountServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void testUserAccount() {
		UserAccount userAccount = new UserAccount();
		userAccount.setUsername("lile");
		userAccount.setPassword("1");
		userAccount.setCredentialsExpired(false);
		userAccount.setLocked(false);
		userService.register(userAccount);
	}
}
