package cn.ddd.core.tools;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;
import org.junit.Test;

public class PasswordServiceTest {
	PasswordService passwordService = new DefaultPasswordService();

	@Test
	public void testEncrypted() {
		String encrypted = passwordService.encryptPassword("123456");
		System.out.println(encrypted);
	}

	@Test
	public void testDecryped() {
		String password = "123456";
		boolean result = passwordService.passwordsMatch(password, "$shiro1$SHA-256$500000$4zu0eaQK/SCl7ktrL4K9XQ==$oUBAxyqrW9PGr8aC+8FRUB7ma99Y83XEtrzcXL4zgwo=");

		System.out.println(result);
	}
}
