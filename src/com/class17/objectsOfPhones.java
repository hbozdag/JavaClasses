package com.class17;

public class objectsOfPhones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone phn1=new Phone();
		
		phn1.name="iPhone7";
		phn1.brand="Apple";
		phn1.color="Black";
		phn1.memory=250;
		phn1.price=1000; 
		
		
		phn1.makeCalls();
		
		System.out.println(" My "+phn1.name+ " is "+phn1.color+ " and it has "+phn1.memory+ " memory ");

	}

}
