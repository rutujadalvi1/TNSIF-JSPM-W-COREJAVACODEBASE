package com.tnsif.UsingFinalkeyword;

public class Finalvar {
	final int x=100;
	final static int y;
	final static int z=10;
	
	void change () {
		//x=300;
		//z=100;
		//y=23;
	}

	@Override
	public String toString() {
		return "Finalvar [x=" + x + ",y=" + y +"]";
	}
	
	static
	{
		//z=878;
		y=567;
		System.out.println("Value of y :"+ y);
	}

}
