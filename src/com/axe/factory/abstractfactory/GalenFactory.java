package com.axe.factory.abstractfactory;

import com.axe.factory.IHero;

public class GalenFactory implements IHeroFactory {

	@Override
	public IHero createHero() {
		return new GalenHero();
	}

}
