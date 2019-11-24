package com.class23;

public class ConstructorDemo {

	/*
	 * why do we need a constructor 
	 * constrictor initializes object
	 * constructor can initilize instnace variables
	 */

	/* how to create constructor 1. it should have exact same name as your class 2.
	 * it cannot have return type, not even void
	 * 
	 * everytime we create an object we call a constructor and entire code inside
	 * the constructor will be executed first
	 * 
	 * if we do not create any constructor compiler will create one for you
	 */

	ConstructorDemo() {

		System.out.println("I am your constructor");
	}
	
	ConstructorDemo(String str) {

		System.out.println("I am your constructor with 1 parameter. "+str);
	}
	
	ConstructorDemo(int num ) {

		System.out.println("I am your constructor with 1 int parameter. "+num);
	}
	
	ConstructorDemo(int num, String num1) {

		System.out.println("I am your constructor with 2 int parameter. "+num+","+num1);
	}


	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an object");
		obj.hello();
		
		ConstructorDemo obj2 = new ConstructorDemo("My Parameters");
		ConstructorDemo obj3 = new ConstructorDemo(123, "Hello");

	}

	public void hello() {
		System.out.println("hello class");
	}

}
