package com.tnsif.UsingFinalkeyword;

final class Finalclass {
	void show() {
		System.out.println("final class cannot be inherited");
	}
}
//class demo extends Finalclassdemo {
//
//}
public class Finalclassdemo {

	public static void main(String[] args) {
		Finalclass f1=new Finalclass();
		f1.show();
	}

}
