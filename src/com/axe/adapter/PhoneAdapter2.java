package com.axe.adapter;

public class PhoneAdapter2 extends Power implements Adapter {

	@Override
	public int getVolt5() {
		System.out.println("电源电压："+get220v());
		System.out.println("经过适配器适配后的电压："+5);
		return 5;
	}

}
