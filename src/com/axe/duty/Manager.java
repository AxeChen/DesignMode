package com.axe.duty;

/**
 * 经理级别最多报销1000
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
		System.out.println("经理正在处理报销金额:"+money);
	}

}
