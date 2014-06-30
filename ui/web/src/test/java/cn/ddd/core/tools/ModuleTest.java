package cn.ddd.core.tools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.ddd.core.security.domain.Module;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-base.xml", "/spring-data.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class ModuleTest {
	@Autowired
	private SessionFactory factory;

	@Test
	@Transactional
	public void testInsert() {

		Module internal = new Module();
		internal.setTitle("用户管理");
		internal.setName("user");
		internal.setLink("user/index");
		internal.addAction("view");
		internal.addAction("create");
		internal.addAction("update");
		internal.addAction("delete");

		Session session = factory.getCurrentSession();
		session.save(internal);
	}
}
