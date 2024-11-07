package com.score.standalone3;

import java.util.List;

public class Student {
	private List<String> ename;

	public List<String> getEname() {
		return ename;
	}

	public void setEname(List<String> ename) {
		this.ename = ename;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(List<String> ename) {
		super();
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Student [ename=" + ename + "]";
	}
	

}
