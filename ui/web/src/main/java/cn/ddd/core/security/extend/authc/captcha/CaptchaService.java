/** 
 * Copyright (C), 2014
 * All right reserved.
 */
package cn.ddd.core.security.extend.authc.captcha;

/**
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月13日<br>
 *          Copyright 2014 XXX有限公司.
 */
public interface CaptchaService {
	/**
	 * 随机生成验证码
	 * 
	 * @param target
	 * @return
	 */
	String generateCaptcha(Object target);

	/**
	 * 是否匹配已生产过的验证码
	 * 
	 * @param submitted
	 * @return
	 */
	boolean captchaMatch(Object submitted);
}
