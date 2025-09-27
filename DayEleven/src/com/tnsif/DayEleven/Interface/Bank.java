package com.tnsif.DayEleven.Interface;

public interface Bank {
	final static float MINBAL=5000;
	final static float Deposit_limit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
}
