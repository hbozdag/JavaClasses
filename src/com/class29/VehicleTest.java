package com.class29;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Car car=new BMW();
		car.drive();
		car.breaking();
		car.speed();
		car.stop();
		
		System.out.println("%%%%%%%%%%");
		
		Vehicle vehicle=new BMW();
		vehicle.drive();
		vehicle.speed();
		vehicle.start();
		vehicle.stop();
		
	}

}
