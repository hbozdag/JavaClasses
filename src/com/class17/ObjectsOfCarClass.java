package com.class17;

public class ObjectsOfCarClass {

	public static void main(String[] args) {
		// to create an object syntax is 
		// Class variable=new Class();
		//Scanner scan=new Scanner(Systme.in);
		//String variable=new String ();
		
		
		Car car1=new Car();
		
		car1.color="black";
		car1.make="Tesla";
		car1.model="S3";
		car1.year=2020;
		car1.wheels=4;
		car1.speed=200;
		
		
		Car car2=new Car();
		
		car2.make="BMW";
		car2.color="Red";
		car2.model="i78";
		car2.speed=340;
		car2.wheels=4;
		car2.year= 1982;
		
		car2.drive();//calling method starts from car class
		car2.accelerate();
		car2.start();
		
		
		//i have a black tesla
		
		System.out.println(" I have a "+ car1.color + " "+car1.make);
		

	}

}
