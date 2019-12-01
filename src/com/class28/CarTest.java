package com.class28;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tesla tesla=new Tesla();
		Tesla tesla1=new Tesla("Tesla", "S4" , true);
		tesla1.displayInfo();
		Tesla tesla2=new Tesla("Tesla", "cybertruck" , false);
		tesla2.displayInfo();
	}

}
