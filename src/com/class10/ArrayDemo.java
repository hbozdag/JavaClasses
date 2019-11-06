package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// max size of array--> int [] nums= new int [2147483647];

		int[] nums = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;

		
		//to find number of elements we use .length
		System.out.println(nums.length);
		
		String [] array= { "Winter", "Fall", "Summer" , "Spring"};
				//i WAS BORN IN SUMMER
				System.out.println(" I was born in "+ array[2]);
		
				//array.length will retiurn an integer. i want to to the lenght of this string 
				int arraySize=array.length;
				System.out.println(arraySize);
				
				System.out.println("%%%%%%%%%%%%%%%");
				
				int []score= {80,90,70,100,99};
				score[0]=80;
				
				
				

	}

}
