package com.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.six.Triangle;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bean6_List.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		
	} 

}
