package com.tnsif.DayNine.MethodOverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("Constructor Overloading");
		
		Point p = new Point(2.3f,34.56f);
		System.out.println(p);
		
		
		System.out.println("Method Overloading");
		System.out.println("Addition of 2 integer"+ MethodOverloadingDemo.addition(6,9));
		System.out.println("Addition of 3 integer"+ MethodOverloadingDemo.addition(2,2,2));
	}

}
