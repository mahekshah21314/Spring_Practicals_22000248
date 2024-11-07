package com.score.standalone;

import java.util.List;

public class Student {
	private List<String> sname;

	public List<String> getSname() {
		return sname;
	}

	public void setSname(List<String> sname) {
		this.sname = sname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(List<String> sname) {
		super();
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	

}
