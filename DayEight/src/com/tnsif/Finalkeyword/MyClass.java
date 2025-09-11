package com.tnsif.Finalkeyword;

public class MyClass {
	private int section;
	private static int srNo;

	static {
		System.out.println("within static block");
		srNo=1000;

	}
	MyClass(){
		System.out.println("within the default constructor");
		srNo++;
		section++;
		
	}
	public String toString() {
		return"MyClass serial No"+srNo+",section=" +section+"]";
	}
	static void display() {
		System.out.println("serial No :"+ srNo);
	}
	
}
