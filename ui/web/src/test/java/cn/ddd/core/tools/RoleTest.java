package cn.ddd.core.tools;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import cn.ddd.core.security.domain.Role;

public class RoleTest extends BaseHibernateTest {

	@Test
	@Transactional
	public void testInsert() {
		Role role = new Role();
		role.setName("admin");
		Session session = factory.getCurrentSession();
		session.save(role);
	}
}
