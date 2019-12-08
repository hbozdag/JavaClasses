package com.class30;

public interface Drivable {
	
	//we can only have unimplemented methods
	//only abstract methods
	
	//public static final variables by default. 
	
	
	boolean DRIVE_FAST=true;//variable name needs to be upper case
	
	//public abstract void drive() ;          // by default compiler will add public abstract
		
	void drive() ;

	
	
}
class Cars{
	public void stop() {
		System.out.println("car stops by pressing breaks");
	}
}
class Toyota extends Cars implements Drivable{

	
	// implements is the keyword connecting class to interface
	
	@Override
	public void drive() {
		System.out.println("toyota can drive");
		
	}
	
}