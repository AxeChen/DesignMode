package com.axe.duty;

public class CTO extends Leader{

	@Override
	public int limit() {
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.println("CTO���ڴ����������:"+money);
	}

}