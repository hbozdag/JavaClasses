package com.class29;

public class PhoneTest {
	
	//abstract
	
	public static void main(String[] args) {
		
		//you cannot cretae an object of an abstract class
		
		//Phone phone =new Phone();ce: cannot instentiate
		
		//we can create it indirctetly
		//we will cretae the object of the child class and refer it to the parent class
		
		Phone phone=new iPhone();
		phone.makeCall();
		phone.playGames();
		phone.takePictures();
		phone.sendText();
	}

}
