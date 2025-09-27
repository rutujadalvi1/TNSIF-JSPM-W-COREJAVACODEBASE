package com.tnsif.DayEleven.Interface;
 
public class Savingaccount extends Customer implements Bank{
	
	private int accNo;
	private float balence;
	private float balence_MINBAL;
	
	//constructor
		public Savingaccount(String name, String city, int accNo, float balance) {
			super(name, city);
			this.accNo = accNo;
			this.balence = balance;
		}

		//Getter and setter
		public int getAccNo() {
			return accNo;
		}



		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}



		public float getBalance() {
			return balence;
		}



		public void setBalance(float balance) {
			this.balence = balance;
		}



		@Override
		public void deposit(float amount) {
		if(amount <0 || amount > Deposit_limit)
		{
			System.out.println("Please deposit valid amount ");
		}
		else {
			balence +=amount;
			System.out.println("Rs : "+amount +"is deposited succesfullty");
		}
			
		}

		@Override
		public void withdraw(float amount) {
			
			if(amount < balence-MINBAL)
			{
				balence-=amount;
				System.out.println("Rs :"+amount+ "withdrawal is successfully");
			}
			else {
				System.out.println("Insufficient Balance ");
			}
			
		}

		@Override
		public String toString() {
			return "SavingAccount [accNo=" + accNo + ", balance=" + balence + ", getName()=" + getName() + ", getCity()="
					+ getCity() + "]";
		}
		
		

	}	