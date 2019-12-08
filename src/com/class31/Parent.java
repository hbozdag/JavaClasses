package com.class31;

public class Parent {

	static void hello() {
		System.out.println("hello from parent class");
	}

}

class Child extends Parent{
	
	static void hello() {
	System.out.println("hello from child class");
	}
}