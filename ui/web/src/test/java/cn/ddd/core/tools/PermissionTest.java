package cn.ddd.core.tools;

import java.util.List;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import cn.ddd.core.security.domain.Module;
import cn.ddd.core.security.domain.ResourcePermission;

import com.google.common.collect.Sets;

public class PermissionTest extends BaseHibernateTest {

	@Test
	@Transactional
	public void testInsert() {
		Session session = factory.getCurrentSession();

		List<Module> modules = session.createQuery("from Module").list();

		for (Module module : modules) {
			ResourcePermission permission = new ResourcePermission();
			permission.setResource(module);
			permission.setActions(Sets.newHashSet("create", "update", "delete"));
			session.save(permission);
		}
	}
}