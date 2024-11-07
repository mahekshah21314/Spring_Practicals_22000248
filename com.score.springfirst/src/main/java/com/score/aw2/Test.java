package com.score.aw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/aw2/config.xml");
		Question qq = (Question)context.getBean("q2");
		System.out.println(qq);
	}

}
