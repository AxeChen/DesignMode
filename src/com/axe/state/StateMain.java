package com.axe.state;

/**
 * ״̬ģʽ
 * @author 11373
 *
 */
public class StateMain {
	public static void main(String[] args) {
		ComputerController controller = new ComputerController();
		controller.powerOn();
		controller.playGame();
		controller.watchMovie();
		controller.powerOff();
		controller.playGame();
	}
}
