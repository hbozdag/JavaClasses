package com.class2;

public class PerimeterAndArea {

	public static void main(String[] args) {

		double dec1 = 2.5;
		double dec2 = 4.5;

		double sum = dec1 + dec2;
		double sub = dec1 - dec2;
		double mult = dec1 * dec2;
		double div = dec1 / dec2;
		sum = dec1 + dec2;

		double sq1 = 3.9;

		System.out.println("The square of the " + sq1 + " is " + sq1 * sq1);

		System.out.println("The addition of 2 numbers " + dec1 + " and " + dec2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + dec1 + " and " + dec2 + " is equal to " + sub);

		System.out.println("The multiplicatipn of 2 numbers " + dec1 + " and " + dec2 + " is equal to " + mult);
		System.out.println("The divison of 2 numbers " + dec1 + " and " + dec2 + " is equal to  " + div);

		int width = 5;
		int height = 8;

		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("The perimeter of rectangle with width " + " and height " + height + " is equal to  "
				+ perimeter + " and the area is " + area);

		String message = "The perimeter of rectangle with width " + " and height " + height + " is equal to  "
				+ perimeter + " and the area is " + area;

		System.out.println(message);

	}

}
