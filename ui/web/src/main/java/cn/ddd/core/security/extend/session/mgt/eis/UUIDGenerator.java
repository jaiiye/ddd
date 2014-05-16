package cn.ddd.core.security.extend.session.mgt.eis;

import java.io.Serializable;
import java.util.UUID;

import cn.ddd.core.tools.IdGenerator;

public class UUIDGenerator implements IdGenerator {

	@Override
	public Serializable generateId(Object target) {
		return UUID.randomUUID().toString();
	}

}
