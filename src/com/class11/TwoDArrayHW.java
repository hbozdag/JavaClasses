package com.class11;

public class TwoDArrayHW {

	public static void main(String[] args) {
//		Create a 2D array where you will store the following values:
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//		After storing values print the following:
//		Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		
		
		String [][] names= new String [4][4];
				
//				{"Mr", "Mrs", "Ms","Miss"},
//				{"Smith", "Jordan", "Jackson","Obama"},
//				};
		
		names[0][0]="Mr" ;
		names [0][1]="Mrs";
		names [0][2]="Ms";
		names [0][3]="Miss";
		names[1][0]="Smith" ;
		names [1][1]="Jordan";
		names [1][2]="Jackson";
		names [1][3]="Obama";
		
		System.out.println(names[0][1]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+names [1][3]);
		System.out.println(names[0][2]+" "+names [1][2]);
		System.out.println(names[0][3]+" "+names [1][1]);
		
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		
//		Create a 2D array that first row will contain 4 names and second row will contain grades. 
//		Then you program should print name of the students that has as an A and B grade
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		
//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array
		
		String [] cars= {"American", "German", "Korean", "Italian"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		for (String a:cars) {
			System.out.println(a);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		
		//Create an array of countries: 
		//north america countries, south america countries, 
		//europe countries, asian countries, african countries.
		//Then print all values from that array.
		
		
String [] countries= {"north American", "South American", "European", "Asian", "African"};
		
		for (int i=0; i<countries.length; i++) {
			System.out.println(countries[i]);
		}
		
		System.out.println("************");
		for (String b:countries) {
			System.out.println(b);
		}
		
	}

}
