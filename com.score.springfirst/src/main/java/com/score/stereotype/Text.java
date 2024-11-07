package com.score.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/score/stereotype/config.xml");
		Employee emp = (Employee)context.getBean("employee",Employee.class);
		System.out.println(emp);
		
		System.out.println(emp.hashCode());
		Employee emp1 = (Employee)context.getBean("employee",Employee.class);
		System.out.println(emp1.hashCode());
		
	}

}
