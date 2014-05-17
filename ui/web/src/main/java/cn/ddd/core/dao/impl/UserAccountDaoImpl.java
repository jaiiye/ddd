package cn.ddd.core.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.ddd.core.dao.UserAccountDao;
import cn.ddd.core.security.domain.UserAccount;
import cn.ddd.core.security.extend.realm.BaseSecurityRealm;

@Repository
public class UserAccountDaoImpl extends BaseSecurityRealm implements UserAccountDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persist(UserAccount userAccount) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(userAccount);
	}

	@Override
	public UserAccount find(Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		return (UserAccount) session.get(UserAccount.class, id);
	}

	@Override
	protected Collection<Permission> findPermissionsByRoleName(String roleName) {
		return null;
	}

	@Override
	protected UserAccount findUserAccountByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from UserAcount where username=:username");
		query.setParameter("username", username);
		return (UserAccount) query.uniqueResult();
	}
}
