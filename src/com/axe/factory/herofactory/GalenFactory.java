package com.axe.factory.herofactory;

import com.axe.factory.IHero;
import com.axe.factory.simple.Galen;

/**
 * ���׹���
 * 
 * @author 11373
 *
 */
public class GalenFactory implements HeroFactory {

	@Override
	public IHero createHero() {
		return new Galen();
	}

}
