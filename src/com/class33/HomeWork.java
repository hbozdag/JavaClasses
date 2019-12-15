package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		//create an array list of cars and retrive all theh values
		//using 3 different ways
		
		ArrayList<String> car =new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("honda");
		car.add("BMW");
		
		System.out.println("%%%%%%%");
		
		for (String cars:car) {
			System.out.println(cars);
		}
	
		System.out.println("**********");
		
		for(int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("$$$$$$$$$");
		
		Iterator it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
