package com.tnsif.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//scanner class & scanner object to accept user input
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter Person Name:");
		String name=ob.next();
		System.out.println("Enter Age:");
		int age=ob.nextInt();
		System.out.println("Enter Gender:");
		String gender=ob.next();
		System.out.println("Enter Income");
		int income=ob.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
        
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		//display person details using toString() method
		System.out.println(person);
		
		TaxCalculation cal=new TaxCalculation();
		cal.calculateTax(person);
		System.out.println("After calculation of tax:");
		
		System.out.println(person);
	}

}
