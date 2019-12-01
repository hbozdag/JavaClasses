package com.class27;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	


}
class Monkey extends Animal{
	
	// we cannot override a static method
	
	//this is called method hiding. method signature should be the same
	
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}