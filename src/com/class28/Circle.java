package com.class28;

public class Circle extends Shape{

	 Circle(int radius) {
		super(radius);
		double area=3.14*(radius*radius);
		 
		 System.out.println(area);
		
		
	}
	 
	 public static void main(String[] args) {
		Circle obj=new Circle(9);
		
	}
}
