package com.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.seven.Triangle;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bean7_Autowiring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		
	} 

}
