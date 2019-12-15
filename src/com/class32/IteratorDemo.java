package com.class32;

import java.util.ArrayList;
import java.util.Iterator;





public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>nameList=new ArrayList<>();
		nameList.add("Lili");
		nameList.add("Lolo");
		nameList.add("Lale");
		nameList.add("Loki");
		nameList.add("Lane");
		
		//retrive values from array list
		
		//1-for loop
		
		for (int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		//2-enhanced for loop
		
		for (String name:nameList) {
			System.out.println(name);
		}
		
		System.out.println("&&&&&&&&");
		//3-iterator
		
		Iterator<String>it=nameList.iterator();
		

	}

}
