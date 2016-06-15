package com.one;

public class Circle implements Shape {
	
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		type = type;
	}

	public void draw() {
		
		System.out.println("drew "+getType()+ " Circle");
	}

}
