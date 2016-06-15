package com.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.two.Triangle;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("bean4_Aliases.xml");
		Triangle triangle = (Triangle)context.getBean("triangle-alias");
		triangle.draw();
		
		
	} 


}
