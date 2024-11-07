package com.score.stereotype2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	@Value("mahek")
	private String pname;
	@Value("2334")
	private int pid;
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
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, int pid) {
		super();
		this.pname = pname;
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + "]";
	}
	

}
