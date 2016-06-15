package com.one;

public class Drawing {
	
	private Shape shape;



	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShapw(){
		this.shape.draw();
	}
	
}
