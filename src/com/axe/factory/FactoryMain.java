package com.axe.factory;

import com.axe.factory.factory.ReflectHeroFactory;
import com.axe.factory.herofactory.AichFactory;
import com.axe.factory.herofactory.GalenFactory;
import com.axe.factory.herofactory.YiFactory;
import com.axe.factory.simple.Aich;
import com.axe.factory.simple.Galen;
import com.axe.factory.simple.Yi;

public class FactoryMain {
	public static void main(String[] args) {
		// �򵥹���ģʽ
		System.out.println("-----------------�򵥹���ģʽ-----------------------");
		IHero aich = new Aich();
		aich.weaPon();
		IHero galen = new Galen();
		galen.weaPon();
		IHero yi = new Yi();
		yi.weaPon();
		
		// ��������ģʽ
		System.out.println("-----------------��������ģʽ-----------------------");
		// ͨ�����乤������������
		IHero aich2 = ReflectHeroFactory.createHero(Aich.class);
		aich2.weaPon();
		IHero galen2 = ReflectHeroFactory.createHero(Galen.class);
		galen2.weaPon();
		IHero yi2 = ReflectHeroFactory.createHero(Yi.class);
		yi2.weaPon();
		
		// �����Ĺ�������ģʽ
		
		IHero aich3 = new AichFactory().createHero();
		aich3.weaPon();
		IHero galen3 = new GalenFactory().createHero();
		galen3.weaPon();
		IHero yi3 = new YiFactory().createHero();
		yi3.weaPon();
		
		System.out.println("-----------------���󹤳�����ģʽ-----------------------");
		new com.axe.factory.abstractfactory.AichFactory().createHero().weaPon();
		new com.axe.factory.abstractfactory.GalenFactory().createHero().weaPon();
		new com.axe.factory.abstractfactory.YiFactory().createHero().weaPon();
		
				
	}
}
