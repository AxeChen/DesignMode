package com.axe.factory;

public class CarFactory implements Factory2 {
	@Override
	public Car createCar(String name) {
		if ("benzi".equals(name)) {
			return new BenziCar();
		} else if ("bwm".equals(name)) {
			return new BWMCar();
		}
		return null;
	}
}
