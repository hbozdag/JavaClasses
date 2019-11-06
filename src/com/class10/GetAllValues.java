package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };

		
		
	for (int i=0; i<animals.length; i++) {
		
		if (animals[i].equals("Dog")) {
			System.out.println("I love dogs");
		}else {
			System.out.println(animals[i]);
		}
		
		
	}
	
	
	//Create an array of countries.
	//While retrieving all values from an array print capital for each country.
	
	
	String [] countries= { "Russia", "USA", "England"};
	
	
	for (int i=0; i<countries.length; i++) {
	if (countries[i].equals("Russia")) {
		System.out.println("Capital of Russia is Moskow");
	}else if (countries[i].equals("USA")) {
		System.out.println("Capital of USA is Washington DC");
	}else if (countries[i].equals("England")) {
		System.out.println("Capital of England is London ");
	}else {
		System.out.println("Invalid");
	}
			
	}

	}

}
