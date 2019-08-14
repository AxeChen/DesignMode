package com.axe.prototype.user;

public class LoginSession {
	private static LoginSession instance;

	private LoginSession() {
	}

	public static LoginSession getInstatnce() {
		if (instance == null) {
			synchronized (LoginSession.class) {
				if (instance == null) {
					instance = new LoginSession();
				}
			}
		}
		return instance;
	}

	private User userSession;

	void setLoginUser(User user) {
		this.userSession = user;
	}

	public User getLoginUser() {
		try {
			return (User) userSession.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
