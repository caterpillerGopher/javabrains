package com.one;

public class Triangle implements Shape {
	
	private String type;
	private int hieght;
	
	public Triangle(String type){
		this.type=type;
	}
	
	public Triangle(int hieght){
		this.hieght=hieght;
	}
	public Triangle(String type, int hieght){
		this.type=type;
		this.hieght=hieght;
	}
	
	public int getHieght() {
		return hieght;
	}

public String getType() {
		return type;
	}
/*

	public void setType(String type) {
		this.type = type;
	}*/

	public void draw() {
		System.out.println("drew "+getType() +" Triangle & height "+getHieght());
	}

}
