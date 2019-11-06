package com.class10;

public class EveruthingAboutArray {

	public static void main(String[] args) {

		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "GIT";
		classes[3] = "Manuel Testing";

		System.out.println("Today we have " + classes[0] + " class");

		System.out.println("%%%%%%%%%%%%");

		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;

		// how can i change 1 to 100

		nums[0] = 100;

		System.out.println(nums[0]);

		System.out.println(nums[0] + nums[2]);

		System.out.println("@@@@@@@@@@@@@@");

		String[] names = new String[3];
		names[0] = "Diana";
		names[1] = "Seda";
		names[2] = "Jaime";
		// names[3]="olga"; during runtime we will get exception
		// ArrayIndexOutOfBoundsException

		System.out.println(names[0]);

		System.out.println("%%%%%%%%%%%%");

		int[] numbers = new int[4];

		numbers[1] = 100;
		numbers[3] = 200;

		// java will assign 0 as a default value to undeclared numbers

		System.out.println(numbers[2]);
		System.out.println("%%%%%%%%%%%%");

		double[] number = new double[4];

		number[1] = 100;
		number[3] = 200;
		System.out.println(number[2]);

		/*
		 * array can hold values of same type if we store more values than the actual
		 * size on array--> we will get runtime exception the first element of array
		 * STARTS with 0
		 * 
		 */

	}

}
