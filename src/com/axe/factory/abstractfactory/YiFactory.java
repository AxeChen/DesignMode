package com.axe.factory.abstractfactory;

import com.axe.factory.IHero;

public class YiFactory implements IHeroFactory{

	@Override
	public IHero createHero() {
		return new YiHero();
	}

}
