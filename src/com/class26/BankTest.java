package com.class26;

public class BankTest {
	
	public static void main(String[] args) {
		
		
		Bank bank=new Bank();
		bank.money=900;
		bank.chargeFee();
		
		double fee=bank.chargeFee();
		
		System.out.println("Bnak fee ="+fee);
		
		
		PNC pnc=new PNC();
		pnc.money=900;
		double pncFee=pnc.chargeFee();
		
		System.out.println("PNC fee ="+pncFee);
		
		
				
	}

}
