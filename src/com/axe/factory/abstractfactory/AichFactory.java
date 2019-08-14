package com.axe.factory.abstractfactory;

import com.axe.factory.IHero;

public class AichFactory implements IHeroFactory{

	@Override
	public IHero createHero() {
		return new AichHero();
	}

}
