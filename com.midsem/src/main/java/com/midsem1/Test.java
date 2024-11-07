package com.midsem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/midsem1/config.xml");
		Customer cc=(Customer)context.getBean("c1");
		System.out.println(cc);
	}

}
