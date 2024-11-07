package com.score.aw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/aw1/config.xml");
		Question q1 = (Question)context.getBean("q1");
		System.out.println(q1);
	}

}
