package com.class28;

public class Car {
	
	String make, model;
	int year;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
	

}
class Tesla extends Car{
	
	boolean autoPilot;
	
	Tesla(){
		super(); //this is added by default. it is not visible
		System.out.println("I am non argument constructor of the child class");
	}
	
	Tesla(String make, String model, boolean autoPilot){
		super(make, model);
		this.autoPilot=autoPilot;
	}
	
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autoPilot);
	}
	
}