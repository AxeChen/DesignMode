package com.axe.factory.herofactory;

import com.axe.factory.IHero;
import com.axe.factory.simple.Aich;

/**
 * ��ϣ����
 * 
 * @author 11373
 *
 */
public class AichFactory implements HeroFactory{

	@Override
	public IHero createHero() {
		return new Aich();
	}
}
