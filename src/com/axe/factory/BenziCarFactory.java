package com.axe.factory;

public class BenziCarFactory implements Factory3 {

	@Override
	public Wheel createWheel() {
		return new AKMWheel();
	}

	@Override
	public Engine createEngine() {
		return new M24Engine();
	}

}
