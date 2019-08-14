package com.axe.state;

public class ComputerController implements PowerController{

	private IComputerActivity state;
	
	public void setComputerState(IComputerActivity state) {
		this.state = state;
	}
	
	@Override
	public void powerOn() {
		setComputerState(new PowerNoState());
	}

	@Override
	public void powerOff() {
		setComputerState(new PowerOffState());
	}
	
	public void playGame() {
		state.playGame();
	}

	public void watchMovie() {
		state.watchMovie();
	}

}
