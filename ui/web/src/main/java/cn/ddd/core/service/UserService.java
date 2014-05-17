package cn.ddd.core.service;

import cn.ddd.core.security.domain.UserAccount;

/**
 * 不知道为什么不写这个接口，使用@Autowired的话会报错<br>
 * TODO:留着以后找原因<br>
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月17日 Copyright 2014 XXX有限公司.
 */
public interface UserService {
	void register(UserAccount userAccount);
}