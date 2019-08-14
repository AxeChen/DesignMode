package com.axe.prototype.user;

public class Address {
	private String city;
	private String district;
	private String street;
	
	public Address(String city, String district, String street) {
		super();
		this.city = city;
		this.district = district;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
