package com.score.stereotype1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/stereotype1/config.xml");
		Student ss = (Student)context.getBean("student",Student.class);
		System.out.println(ss);
		System.out.println(ss.hashCode());
		
		Student s1 = (Student)context.getBean("student",Student.class);
		System.out.println(s1.hashCode());
		
		
	}

}
