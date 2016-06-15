package com.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		/*Shape shape = new Triangle();
		Drawing draw = new Drawing();
		
		 draw.setShape(shape);
		 draw.drawShapw();*/
		ApplicationContext context = new FileSystemXmlApplicationContext("beans_Contructor_And_Property_For_Defining_Values.xml");
		System.out.println(context.getStartupDate());
		Shape triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
