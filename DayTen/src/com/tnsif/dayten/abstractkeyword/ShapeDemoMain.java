package com.tnsif.dayten.abstractkeyword;

import java.io.Serializable;

@SuppressWarnings("unused")
public class ShapeDemoMain {

	public static void main(String[] args) {
		Shape s;
		
		s=new Square(5.0f);
		s.calArea();
		s.show();
		
		s=new Rectangle(5,4);
		s.calArea();
		s.show();

	}

}

