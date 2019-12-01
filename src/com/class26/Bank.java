package com.class26;

public class Bank {

	double money;

	public double chargeFee() {

		double fee = 0;

		if (money < 1000) {
			fee = money * 0.1;
			System.out.println();

		} else {
			fee = 0;
		}
		return fee;
	}

}

class PNC extends Bank {
	
	//when you override your method signature and your return type must be the same

	//@override
	public double chargeFee() {

		double fee = 0;

		if (money < 1000) {
			fee = money * 0.05;
			System.out.println();

		} else {
			fee = 0;
		}
		return fee;
	}

}