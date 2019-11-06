package com.class10;

public class ArrayWithSwitch {

	public static void main(String[] args) {
		
String [] countries= { "Afghanistan", "Columbia", "USA", "Russia"};
		
for (int i=0; i<countries.length; i++) {
	
switch (countries[i]) {
		
		case "Afghanistan":
			System.out.println("Kabul");
			break;
			
		case "Columbia":
			System.out.println("bogota");
			break;
			
		case "USA":
		System.out.println("washington DC");
		break;
		case "Russia":
		System.out.println("moskow");
		break;
		
}
		
		
}	
		
		
		
		
		
		
		
		
		

	}

}
