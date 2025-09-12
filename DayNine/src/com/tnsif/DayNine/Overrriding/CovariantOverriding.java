package com.tnsif.DayNine.Overrriding;

class Colour{
	protected Colour getColour() {
		Colour s=new Colour();
		return s;
		}
}


class Red{
	protected Red getColour() {
		Red s=new Red();
		return s;
		}
}
public class CovariantOverriding {

	public static void main(String[] args) {
		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Red y=new Red();
		System.out.println(y);

	}

}
