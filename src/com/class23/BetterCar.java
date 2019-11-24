package com.class23;

public class BetterCar {
	
	static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}
	
	

	public static void main (String []args) {
		make="BMW";
		
		//comppiler will give error. we need to pass vlaues
		//BetterCar bcar1=new BetterCar();
		
		BetterCar bcar1=new BetterCar("X5", "bLUE",400,2);
		bcar1.getDetails();
	}
	
	

	public void getDetails() {
		System.out.println("I build "+color+" "+make+" "+model);
		System.out.println("My car has "+doors+ " doors and  can have speed up to "+speed);
	}

}
