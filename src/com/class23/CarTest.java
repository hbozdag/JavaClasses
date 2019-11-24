package com.class23;

public class CarTest {

	public static void main(String[] args) {

		Car.make = "Toyota";

		Car car1 = new Car();

		car1.model = "camry";
		car1.color = "pink";
		car1.getDetails();
		car1.doors = 4;

		Car car2 = new Car();

		car2.model = "corolla";
		car2.color = "blue";
		car2.doors = 2;

		car2.getDetails();

		Car.make = "Toyota";

		Car car3 = new Car();

		car3.model = "prius";
		car3.color = "green";
		car3.getDetails();
		
		System.out.println("-----------");
		
		BetterCar betterCar1=new BetterCar("campy", "White", 180, 5);
		betterCar1.getDetails();

	}

}
