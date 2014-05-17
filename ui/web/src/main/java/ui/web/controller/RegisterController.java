package ui.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ddd.core.security.domain.UserAccount;
import cn.ddd.core.service.UserService;

@Controller
@RequestMapping("register")
public class RegisterController {
	@Autowired
	private UserService userService;

	@RequestMapping("index")
	public String toIndex() {
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(UserAccount userAccount) {
		userService.register(userAccount);
		return "success";
	}
}