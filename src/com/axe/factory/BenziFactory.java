package com.axe.factory;

public class BenziFactory implements Factory{
	@Override
	public Car createCar() {
		return new BenziCar();
	}
}
