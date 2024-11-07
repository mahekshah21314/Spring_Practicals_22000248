package com.springcore.CI1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main() {
		ApplicationContext c=new ClassPathXmlApplicationContext("com/springcore/CI1/config.xml");
		Student ss=(Student)c.getBean("s1");
		System.out.println(ss);
		
		
	}

}
