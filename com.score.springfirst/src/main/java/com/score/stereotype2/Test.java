package com.score.stereotype2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/stereotype2/config.xml");
		Person pp = (Person)context.getBean("person",Person.class);
		System.out.println(pp);
		System.out.println(pp.hashCode());
		
		Person p2 = (Person)context.getBean("person",Person.class);
		System.out.println(p2.hashCode());
	}

}
