package com.axe.state;

/**
 * ״̬ģʽ �������Ե�Դ�ر�֮��Ĳ���
 * @author 11373
 *
 */
public class PowerOffState implements IComputerActivity{

	@Override
	public void playGame() {
		System.out.println("�뿪������Ϸ");
	}

	@Override
	public void watchMovie() {
		System.out.println("�뿪������Ӱ");
	}

}
