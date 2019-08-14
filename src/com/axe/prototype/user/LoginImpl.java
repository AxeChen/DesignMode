package com.axe.prototype.user;

public class LoginImpl implements Login{

	@Override
	public void login() {
		// 登录之后回调
		User user = new User();
		user.setAge(10);
		user.setUserName("AxeChen");
		user.setUserPhone("111111");
		user.setAddress(new Address("ddd","ddd","ddd"));
	}

}
