package cn.ddd.core.tools;

import org.hibernate.SessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-base.xml", "/spring-data.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class BaseHibernateTest {
	@Autowired
	protected SessionFactory factory;
}
