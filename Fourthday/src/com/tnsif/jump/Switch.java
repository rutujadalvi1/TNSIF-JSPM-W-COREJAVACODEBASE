package com.tnsif.jump;

public class Switch {

	public static void main(String[] args) {
		
		int userInputs=1;
		switch (userInputs) {
		case 1: 
			 System.out.println(userInputs + " : current plan details");
			 break;
	    
		case 2: 
			 System.out.println(userInputs + " : new offers");
			 break;
			
		case 3: 
			 System.out.println(userInputs + " : customer support ");
			 break;
			
		case 4: 
			 System.out.println(userInputs + " : new plans for u");
			 break;
		
			 default  : System.out.println("ur input is invalid! \n EXIT....");
			
		}
	}

}
