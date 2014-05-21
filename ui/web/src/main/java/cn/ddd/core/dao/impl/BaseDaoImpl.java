package cn.ddd.core.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ddd.core.dao.BaseDao;
import cn.ddd.core.security.domain.Entity;

public class BaseDaoImpl<T extends Entity> implements BaseDao<T> {
	@Autowired
	private SessionFactory factory;

	@Override
	public void persist(T entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
	}

	@Override
	public void update(T entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public void delete(T entity) {
		Session session = factory.getCurrentSession();
		session.delete(entity);
	}
}
