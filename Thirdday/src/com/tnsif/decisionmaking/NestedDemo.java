package com.tnsif.decisionmaking;

public class NestedDemo {

	public static void main(String[] args) {
		String correctUsername = "rutuja";
        String correctPassword = "12345";

        
        String username = "rutuja";
        String password = "12345";
        
        if (username == correctUsername) {
           
            if (password == correctPassword) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }

	}

}
