package com.tnsif.DayEleven.Interface;

public class BankDemo {

	public static void main(String[] args) {
		
        Savingaccount s1=new Savingaccount("Shweta", "Pune", 12345, 37000f);
		
		s1.deposit(26000);
		System.out.println(s1);
		
		s1.withdraw(25000);
		System.out.println(s1);
		
		s1.withdraw(9000);
		System.out.println(s1);
		
		s1.withdraw(5000);
		System.out.println(s1);
		

	}

}
