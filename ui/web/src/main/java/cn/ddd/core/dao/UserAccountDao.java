package cn.ddd.core.dao;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.authz.Permission;

import cn.ddd.core.security.domain.UserAccount;

public interface UserAccountDao {

	void persist(UserAccount userAccount);

	Collection<Permission> findPermissionsByRoleName(String roleName);

	UserAccount findUserAccountByUsername(String username);

	UserAccount find(Serializable id);
}
