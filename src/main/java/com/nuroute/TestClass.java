package com.nuroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		NuRoute nuroute = (NuRoute) context.getBean("nuroute");
		nuroute.welcome();
		
	}

}
