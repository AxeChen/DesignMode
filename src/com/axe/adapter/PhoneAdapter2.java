package com.axe.adapter;

public class PhoneAdapter2 extends Power implements Adapter {

	@Override
	public int getVolt5() {
		System.out.println("��Դ��ѹ��"+get220v());
		System.out.println("���������������ĵ�ѹ��"+5);
		return 5;
	}

}
