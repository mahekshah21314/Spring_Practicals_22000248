package com.score.CI3;

public class Person {
	private String pname;
	private int pid;
	private Address address;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, int pid, Address address) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person name=" + this.pname + ",Person id=" + this.pid + ",pin=" + this.address.pin + ",area=" + this.address.area;
	}
	
	

}
