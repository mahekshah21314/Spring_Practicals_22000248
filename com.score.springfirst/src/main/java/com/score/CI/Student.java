package com.score.CI;

public class Student {
	private String sname;
	private int sid;
	private Marks add;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, int sid, Marks add) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student name=" + this.sname + ",Student id=" + this.sid + ",Subject is=" + this.add.sub + ",marks is"+ this.add.marks;
	}
	
	
}
