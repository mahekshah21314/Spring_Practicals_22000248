package com.score.CI1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main() {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/score/CI1/config.xml");
		Student ss =(Student)context.getBean("s2");
		System.out.println(ss);
	}

}
