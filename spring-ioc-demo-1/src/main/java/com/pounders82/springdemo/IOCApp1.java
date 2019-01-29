package com.pounders82.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoke the company slogan vie the bean
		org.corporateSlogan();
		
		// close the application context (container)
		((FileSystemXmlApplicationContext)ctx).close();

	}

}