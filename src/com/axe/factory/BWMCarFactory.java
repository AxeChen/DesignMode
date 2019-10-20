package com.axe.factory;

public class BWMCarFactory implements Factory {
	@Override
	public Car createCar() {
		return new BWMCar();
	}
}
