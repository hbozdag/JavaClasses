package com.class31;

public class Account {

	// getters
	private long accountNumber;

	private double balance;

	// we can make tightly encapsulated class by having private access modifier

	
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	
	//setters
	public void setBalance(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}

	public void setAccountNumber(long accountNumber) {
		if (String.valueOf(accountNumber).length() == 9) {
			this.accountNumber = accountNumber;
		}

	}

//	to create a tightly encapsulated class we need to
//	create a private data members
//	create public methods to a access those variables (getters and setters)

	
	//this is hiding data by simply making it proivate
}
