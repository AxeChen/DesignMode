package com.axe.adapter;

/**
 * µçÔ´ÊÊÅäÆ÷
 * 
 * @author 11373
 *
 */
public class PhoneAdapter implements Adapter {

	private Power power;

	public PhoneAdapter(Power power) {
		this.power = power;
	}

	@Override
	public int getVolt5() {
		return 5;
	}

}
