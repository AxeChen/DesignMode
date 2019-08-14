package com.axe.state;

public class PlayGameController implements IComputerActivity {

	/**
	 * 表示关机状态
	 */
	private static final int OFF = 0;

	/**
	 * 表示开机状态
	 */
	private static final int NO = 1;

	private int state = 0;

	public void setSate(int state) {
		this.state = state;
	}

	@Override
	public void playGame() {
		if (state == OFF) {
			System.out.println("请先开机再打游戏");
		} else {
			System.out.println("正在打游戏");
		}

	}

	@Override
	public void watchMovie() {
		if (state == OFF) {
			System.out.println("请先开机再看电影");
		} else {
			System.out.println("正在看电影");
		}

	}
}
