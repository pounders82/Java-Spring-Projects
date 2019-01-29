package com.pounders82.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgsApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoke the company slogan vie the bean
		org.corporateSlogan();
		
		//Print organization details
		System.out.println(org);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
