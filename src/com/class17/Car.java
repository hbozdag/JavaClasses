package com.class17;

public class Car {

	// define attributes/features

	String make, model, color;
	int year, wheels, windows, speed;

	// adding behavior/action -->methods

	void drive() {
		System.out.println("I am drive method");
		System.out.println("Car "+make+" can drive");
	}

	void start() {
		System.out.println(" car "+make+ " can start");
	}

	void accelerate() {
		System.out.println(" car "+make+ " can accelarate");
	}

}
