package com.axe.duty;

public class CEO extends Leader{

	@Override
	public int limit() {
		return 100000;
	}

	@Override
	public void handle(int money) {
		System.out.println("CEO���ڴ��������:"+money);
	}

}
