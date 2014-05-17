package cn.ddd.core.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ddd.core.security.domain.UserAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-base.xml", "/spring-data.xml", "/spring-shiro.xml" })
public class UserAccountServiceTest {
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testUserAccount() {

		for (String bean : applicationContext.getBeanDefinitionNames()) {
			System.out.println(bean);
		}

		UserAccount userAccount = new UserAccount();
		userAccount.setUsername("lile");
		userAccount.setCredentialsExpired(false);
		userAccount.setLocked(false);
	}

}
