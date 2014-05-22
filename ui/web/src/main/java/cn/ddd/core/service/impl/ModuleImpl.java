package cn.ddd.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ddd.core.dao.ModuleDao;
import cn.ddd.core.security.domain.Module;
import cn.ddd.core.service.ModuleService;

/**
 * 
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月21日<br>
 *          Copyright 2014 XXX有限公司.
 */
@Service
public class ModuleImpl implements ModuleService {
	@Autowired
	private ModuleDao moduleDao;

	@Override
	public void addNewModule(Module module) {
		moduleDao.persist(module);
	}
}