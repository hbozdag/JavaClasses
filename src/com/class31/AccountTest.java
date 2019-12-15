package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		
		
		Account acc=new Account ();
//		acc.accountNumber=94949490;
//		acc.balance=939;   you cannot directly assign values
		
		acc.getAccountNumber();
		acc.getBalance();
//		
		acc.setAccountNumber(889336939);
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		
		
		acc.setBalance(200);
		double myBalance=acc.getBalance();
		System.out.println(myBalance);
		
		int num=123;
		String.valueOf(num);//converts given value to string
	}

}
