package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		

		BMW bmw=new BMW("38393939", "Sedan", "BMW", "x6");
		bmw.breaking();//come from car class
		bmw.display();//comes from bmw
		//all below come from vehicle class
		bmw.speed();
		bmw.start();
		bmw.drive();
		bmw.stop();
		System.out.println("*******");
		
		
		BMW.displayTotal();
		BMW.displayTotal();
		Car car=new BMW("85845043", "SUV", "BMW", "Y6");
		car.stop();
		car.start();
		car.speed();
		car.drive();
		car.breaking();
		
		//car.display(); wont be available. only available in bmw
		Vehicle  vehicle=new BMW("98309830", "TRUCK", "BMW", "HY4");
		vehicle.start();
		vehicle.stop();
		Vehicle.displayTotal();
		BMW.displayTotal();
		BMW.displayTotal();
		
	}

}
