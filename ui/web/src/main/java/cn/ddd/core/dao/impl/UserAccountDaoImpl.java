package cn.ddd.core.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Repository;

import cn.ddd.core.dao.UserAccountDao;
import cn.ddd.core.events.UserAccountEvent;
import cn.ddd.core.security.domain.UserAccount;

@Repository("userAccountDao")
public class UserAccountDaoImpl implements UserAccountDao {
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void persist(UserAccount userAccount) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(userAccount);
		eventPublisher.publishEvent(new UserAccountEvent(this, userAccount));
	}

	@Override
	public UserAccount find(Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		return (UserAccount) session.get(UserAccount.class, id);
	}

	@Override
	public Collection<Permission> findPermissionsByRoleName(String roleName) {
		return null;
	}

	@Override
	public UserAccount findUserAccountByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from UserAccount where username=:username");
		query.setParameter("username", username);
		return (UserAccount) query.uniqueResult();
	}
}
