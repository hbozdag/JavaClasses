package com.class17;

public class Dog {
	
	String name, type, origin;
	
	int weight, height, speed, hourOfDailySleep;
	

	
	
	
	void talks() {
		System.out.println(" My dog "+ name+" cannot talk");
	}
	
	void sleeps() {
		
		System.out.println(" My dog "+ name+" sleeps for "+ hourOfDailySleep+" hours");
	}
	
	public static void main (String [] args) {
		
		
		Dog myDog=new Dog();
		
		myDog.type="Husky";
		myDog.name=" Lucy";
		myDog.origin=" Siberia";
		myDog.hourOfDailySleep= 17;
		
		myDog.sleeps();
		myDog.talks();
		
	}
	

}
