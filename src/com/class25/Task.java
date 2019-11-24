package com.class25;

public class Task {
	
	
	public void calculateArea (int width, int length) {
		int areaOfRectangle= width*length;
		
		System.out.println("Area of given rectangle is "+ areaOfRectangle);
		
	}
	
	public void calculateArea (int a) {
		int areaOfSquare= a*a;
		
		System.out.println("Area of given square is "+ areaOfSquare);
		
	}
	
	public void calculateArea (int width, int length, int height) {
		int areaOfBox= width*length*height;
		
		System.out.println("Area of given box is "+ areaOfBox);
		
	}
}
