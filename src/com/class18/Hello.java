package com.class18;

public class Hello {

	
	
	// I wanrt to write with parameters since there will be changes all the time
	void sayHello(String name) {// this is method with parameters
		System.out.println("hello " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Aaron");
		obj.sayHello("Sakir");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		// obj.sayHelloDifferentLanguage(123); this cannot work because you need to put
		// string
		obj.sayHelloDifferentLanguage("Paraguay");
		obj.sayNameAndAge("ahmo", 23);
		obj.isSnowing(false);
	}

	/*
	 * create a method that will say hello in different language based on the value
	 * that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguage(String country) {

		switch (country.toLowerCase()) {

		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("hola");
			break;
		default:
			System.out.println("I do not know how to say hello in your language");

		}
	}
	
	//method to say name and age
	
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	
	//create a method that will check if it snowing
	
	//if snow-->stay home, otherwise go for a walk
	
	
	
	void isSnowing(boolean isSnowing) {//method header
		
	
		
		if (isSnowing) {
			System.out.println("Stay home.");
		}else {
			System.out.println("go for a walk");
		}
	}
}