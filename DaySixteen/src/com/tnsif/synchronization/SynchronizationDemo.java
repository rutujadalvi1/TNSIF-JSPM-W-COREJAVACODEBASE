package com.tnsif.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		
Account a1=new Account(1256, "Rahul", 50000);
		
		System.out.println(a1);
		//a1.withdraw(0);

		AccountThread t[]= new AccountThread[10];
		for(int i=0; i<10; i++)
		{
			t[i] =new AccountThread(a1, 1000 * (i+1));
		}
		try {
			for(int i=0; i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("-----------------------");
		System.out.println(a1);
		
		

	}

}
