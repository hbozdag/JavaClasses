package com.class27;

public class Car {
	
	String make, model;
	int year;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	
	
	public void display() {
		System.out.println("we build "+year+" "+make+" "+model);
	}
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.display();
		
//		int num;  local variables must be initialized
//		System.out.println(num);
		
		System.out.println("oBJECT IF THE CHILD CLASS");
		
		Tesla tesla=new Tesla();
	}

}
class Tesla extends Car{
	
	boolean autoPilot;
	
	Tesla(){
		super(); //this is added by default. it is not visible
		System.out.println("I am non argument constructor of the child class");
	}
	
}