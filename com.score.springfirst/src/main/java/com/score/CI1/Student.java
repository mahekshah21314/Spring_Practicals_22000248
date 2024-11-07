package com.score.CI1;

public class Student {
	private String sname;
	private int sid;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + "]";
	}
	
}
