package com.class26;

public class FullTime extends Employee {

	int bonus;

	public void getPaid() {//overriding method
		System.out.println("Full time employees get paid " + salary + " and bonus" + bonus);
	}

}
