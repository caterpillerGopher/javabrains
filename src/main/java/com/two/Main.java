package com.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bean2_OuterBean.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		
	} 
	
	

}
