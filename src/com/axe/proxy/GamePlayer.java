package com.axe.proxy;

/**
 * ��Ϸ����࣬ʵ��ҪӮ����Ϸ�����
 * @author 11373
 *
 */
public class GamePlayer implements IPlay{

	@Override
	public void loginGame() {
		System.out.println("��Ϸ��ҵ�¼��Ϸ");
	}

	@Override
	public void play() {
		System.out.println("��Ϸ��ҿ�ʼ����Ϸ");
	}

	@Override
	public void winGame() {
		System.out.println("��Ϸ���Ӯ���˱���");
	}

}
