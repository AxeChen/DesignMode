package com.axe.oberver;

/**
 * ��ϣ�۲���
 * @author 11373
 *
 */
public class AichObserverlmpl implements Observer{

	@Override
	public void hit(String name) {
		System.out.println("���ǰ�ϣ��"+name+"�����ˣ������");
	}

}
