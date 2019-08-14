package com.axe.factory.factory;

import com.axe.factory.IHero;

/**
 * 通过反射的方式去创建Hero类
 * 
 * @author 11373
 *
 */
public class ReflectHeroFactory {
	@SuppressWarnings("unchecked")
	public static <T extends IHero> T createHero(Class<T> clz) {
		IHero hero = null;
		try {
			hero = (IHero) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return (T) hero;
	}
}
