package com.axe.duty;

/**
 * ��������౨��1000
 * 
 * @author 11373
 *
 */
public class Manager extends Leader {

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("�������ڴ��������:"+money);
	}

}
