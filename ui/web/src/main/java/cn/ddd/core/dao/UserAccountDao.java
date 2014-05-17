package cn.ddd.core.dao;

import java.io.Serializable;

import cn.ddd.core.security.domain.UserAccount;

public interface UserAccountDao {

	void persist(UserAccount userAccount);

	UserAccount find(Serializable id);
}
