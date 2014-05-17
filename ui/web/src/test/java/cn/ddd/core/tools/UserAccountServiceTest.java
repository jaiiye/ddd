package cn.ddd.core.tools;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ddd.core.security.domain.UserAccount;
import cn.ddd.core.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-*.xml" })
public class UserAccountServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void testUserAccount() {
		UserAccount userAccount = new UserAccount();
		userAccount.setUsername("lile");
		userAccount.setCredentialsExpired(false);
		userAccount.setLocked(false);
	}

}
