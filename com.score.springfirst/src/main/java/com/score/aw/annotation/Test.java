package com.score.aw.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/aw/annotation/config.xml");
		Question q1 = (Question)context.getBean("q2");
		System.out.println(q1);
	}

}
