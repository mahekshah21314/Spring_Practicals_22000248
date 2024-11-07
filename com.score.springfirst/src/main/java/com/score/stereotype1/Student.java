package com.score.stereotype1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("mahek")
	private String sname;
	@Value("248")
	private int sid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
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
