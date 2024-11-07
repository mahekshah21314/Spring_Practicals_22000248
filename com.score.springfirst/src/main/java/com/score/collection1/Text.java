package com.score.collection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/collection1/config.xml");
		Student ss = (Student)context.getBean("s1");
		System.out.println(ss.getSname());
		System.out.println(ss.getPhone());
		System.out.println(ss.getAddress());
		System.out.println(ss.getCourses());
	}

}
