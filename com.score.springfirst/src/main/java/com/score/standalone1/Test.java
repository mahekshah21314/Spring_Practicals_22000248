package com.score.standalone1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/standalone1/config.xml");
		Employee ee = (Employee)context.getBean("emp");
		System.out.println(ee.getEname());
	}

}
