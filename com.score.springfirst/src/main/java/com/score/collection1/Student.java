package com.score.collection1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String sname;
	private List<String> phone;
	private Set<String> address;
	private Map<String,String> courses;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.sname = sname;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	
	

}
