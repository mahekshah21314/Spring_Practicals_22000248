package com.score.CI3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/CI3/config.xml");
		Person pp = (Person)context.getBean("p1");
		System.out.println(pp);
	}

}
