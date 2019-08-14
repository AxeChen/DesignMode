package com.axe.factory.herofactory;

import com.axe.factory.IHero;
import com.axe.factory.simple.Yi;

/**
 * Ò×´óÊ¦
 * 
 * @author 11373
 *
 */
public class YiFactory implements HeroFactory {

	@Override
	public IHero createHero() {
		return new Yi();
	}

}
