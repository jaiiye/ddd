package cn.ddd.core.tools;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.ddd.core.dao.SystemDao;
import cn.ddd.core.security.domain.System;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = false)
@ContextConfiguration(locations = { "classpath:spring-data.xml", "classpath:spring-base.xml" })
public class SystemTest {
	@Autowired
	private SystemDao systemDao;

	@Test
	@Transactional
	public void testInsert() {
		System system = new System("XXX系统（测试）");
		system.setCode("0001");
		systemDao.persist(system);
	}

}
