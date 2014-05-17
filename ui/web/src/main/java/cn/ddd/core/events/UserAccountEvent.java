package cn.ddd.core.events;

import org.springframework.context.ApplicationEvent;

import cn.ddd.core.security.domain.UserAccount;

public class UserAccountEvent extends ApplicationEvent {
	private UserAccount userAccount;

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public UserAccountEvent(Object source) {
		super(source);
	}

	public UserAccountEvent(Object source, UserAccount userAccount) {
		super(source);
		this.userAccount = userAccount;
	}
}