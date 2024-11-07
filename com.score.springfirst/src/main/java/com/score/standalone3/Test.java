package com.score.standalone3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/standalone3/config.xml");
		Student ss = (Student)context.getBean("student");
		System.out.println(ss.getEname());
	}

}
