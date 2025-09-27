package com.tnsif.dayten.abstractkeyword;

public  abstract class Shape {
	protected float area;
	
	//abstract method
	public abstract void calArea();
	
	public void show()
	{
		System.out.println("Area of shape is :"+ area);
	}
	

}
