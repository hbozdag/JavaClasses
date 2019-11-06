package com.class10;

public class ArrayStringWithLoop {

	public static void main(String[] args) {

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };

		int size = animals.length;

		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");
		}

		
		
		double[] myValues= {12.90, 21.21, 33.33, 21.23, 55.67};
		double sizeM=myValues.length;
		
		for (int i=0; i<sizeM; i++) {
			System.out.print( myValues[i]+ " ");
		}
	}

}
