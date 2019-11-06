package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int a;
		a = 10;
		int a1 = 10;

		int[] b; // declare an array -->preferrered way
		int c[];// second way

		b = new int[4];

		// all in one line
		int[] array = new int[4];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;

		//access value of an array
		
		System.out.println(array[0]);
		
		
		String []classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="GIT";
		classes[3]="Manuel Testing";
		
		System.out.println(classes[3]);
		
		
		
		
		
		
	}

}
