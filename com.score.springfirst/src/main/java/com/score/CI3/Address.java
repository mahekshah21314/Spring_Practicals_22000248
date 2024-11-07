package com.score.CI3;

public class Address {
	
	int pin;
	String area;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String area) {
		super();
		this.pin = pin;
		this.area = area;
	}
	@Override
	public String toString() {
		return this.pin + "," + this.area;
	}
	

}
