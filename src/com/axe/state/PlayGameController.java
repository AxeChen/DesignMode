package com.axe.state;

public class PlayGameController implements IComputerActivity {

	/**
	 * ��ʾ�ػ�״̬
	 */
	private static final int OFF = 0;

	/**
	 * ��ʾ����״̬
	 */
	private static final int NO = 1;

	private int state = 0;

	public void setSate(int state) {
		this.state = state;
	}

	@Override
	public void playGame() {
		if (state == OFF) {
			System.out.println("���ȿ����ٴ���Ϸ");
		} else {
			System.out.println("���ڴ���Ϸ");
		}

	}

	@Override
	public void watchMovie() {
		if (state == OFF) {
			System.out.println("���ȿ����ٿ���Ӱ");
		} else {
			System.out.println("���ڿ���Ӱ");
		}

	}
}
