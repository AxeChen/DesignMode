package com.axe.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		Power power = new Power();
		System.out.println("��Դ��ѹ��"+power.get220v());
		PhoneAdapter adapter = new PhoneAdapter(power);
		System.out.println("ͨ������������֮��ĵ�ѹ��"+adapter.getVolt5());
		
		Adapter adapter2 =new PhoneAdapter2();
		adapter2.getVolt5();
	}
}
