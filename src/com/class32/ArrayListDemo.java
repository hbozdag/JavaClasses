package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		// to store values inside your collection

		arrayList.add("John");
		arrayList.add("Jake");
		arrayList.add("Jack");

		// to retrive the value from array lsit

		System.out.println(arrayList.get(1));

		// add more values

		arrayList.add("JAMES");
		arrayList.add("John");
		arrayList.add("JaNe");

		System.out.println(arrayList.get(5));

		// howe many elements inside the array list

		int size = arrayList.size();
		System.out.println(size);

		// creating an object of array list that hold numeric values
		ArrayList<Integer> numArrList = new ArrayList<>();

		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		//we can do adding and removing 
		
		//update the value
		
		numArrList.set(0, 1000);
		

		// retrive values
		System.out.println(numArrList.get(2));

		for (int num = 0; num < numArrList.size(); num++) {
			//System.out.println(numArrList.get(num));
			
			Integer myInteger=numArrList.get(num);
		}

		for (Integer number : numArrList) {
			System.out.println(number);
		}

	}

}
