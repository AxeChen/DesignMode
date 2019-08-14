package com.axe.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		Power power = new Power();
		System.out.println("电源电压："+power.get220v());
		PhoneAdapter adapter = new PhoneAdapter(power);
		System.out.println("通过是配置适配之后的电压："+adapter.getVolt5());
		
		Adapter adapter2 =new PhoneAdapter2();
		adapter2.getVolt5();
	}
}
