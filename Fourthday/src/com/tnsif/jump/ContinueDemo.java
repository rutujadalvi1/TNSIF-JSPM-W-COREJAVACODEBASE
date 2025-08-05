package com.tnsif.jump;

public class ContinueDemo {

	public static void main(String[] args) {
		 
		for(int k=5; k<15; k++)
		{
			if (k % 2 == 0) {
				
				 System.out.println("Value of k: " + k + " is Even");
	                continue;
	            }
			
	            System.out.println("Value of k: " + k + " is Odd");
	        }

	}

}
