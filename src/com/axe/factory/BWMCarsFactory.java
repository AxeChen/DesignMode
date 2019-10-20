package com.axe.factory;

public class BWMCarsFactory implements Factory3{

	@Override
	public Wheel createWheel() {
		return new M416Wheel();
	}

	@Override
	public Engine createEngine() {
		return new AWMEngine();
	}

}
