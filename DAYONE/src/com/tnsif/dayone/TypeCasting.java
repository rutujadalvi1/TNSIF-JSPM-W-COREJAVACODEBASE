package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		System.out.println(i);
		
		//narrowing
		double f1=10.52f;
		long ll=(long) f1;
		System.out.println(ll);
		
		int i2=130;
		byte b1=(byte) i2;
		System.out.println(b1);
		
		

	}

}
