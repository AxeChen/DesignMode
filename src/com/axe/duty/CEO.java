package com.axe.duty;

public class CEO extends Leader{

	@Override
	public int limit() {
		return 100000;
	}

	@Override
	public void handle(int money) {
		System.out.println("CEO正在处理报销金额:"+money);
	}

}
