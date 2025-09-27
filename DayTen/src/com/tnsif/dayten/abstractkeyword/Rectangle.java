package com.tnsif.dayten.abstractkeyword;

public class Rectangle  extends Shape{
	
	float width;
	float height;

	//default constructpor
	public Rectangle() {
		width=3.2f;
		height=3.2f;
		
	}



	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	public void calArea() {
		this.area=width*height;
		
	}

}
