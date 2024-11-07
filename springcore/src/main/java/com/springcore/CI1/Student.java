package com.springcore.CI1;

public class Student {
	private int sid;
	private String sname;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}
