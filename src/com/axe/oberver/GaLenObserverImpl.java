package com.axe.oberver;

/**
 * �۲���ʵ����
 * @author 11373
 *
 */
public class GaLenObserverImpl implements Observer{

	@Override
	public void hit(String name) {
		System.out.println("���Ǹ��ף�"+name+"�����ˣ������");
	}

}
