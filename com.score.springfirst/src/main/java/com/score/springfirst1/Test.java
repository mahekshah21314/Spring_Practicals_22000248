package com.score.springfirst1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/springfirst1/config.xml");
		Student ss = (Student)context.getBean("s1");
		System.out.println(ss);
	}

}
