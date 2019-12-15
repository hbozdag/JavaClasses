package com.class35;

import java.util.*;


public class Recap {
	public static void main(String[] args) {
		
		Set<Double> set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(99.09);
		set.add(49.99);
		set.add(39.99);
		set.add(94.19);
		
		Iterator<Double> iterator=set.iterator();
		while(iterator.hasNext()) {
			
			double d=iterator.next();
			if (d<50) {
				iterator.remove();
			}
		}
		
		for(Double d1:set) {
			System.out.println(d1);
		}
		
		////////////////////////////////////////////
		
		//How to remove duplicates
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("hane");
		aList.add("hames");
		aList.add("james");
		aList.add("John");
		aList.add("jale");
		
		Set<String> hset=new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		
		//how can i access just 1 values from the Set collection
		Set<String> lset=new LinkedHashSet<>(); //keeps the insertion order
		
		lset.add("moRNING");
		lset.add("NOON");
		lset.add("EVENING");
		lset.add("NIGHT");
		
		//CONVER TO ARAY LIST
		
		List<String> myList= new ArrayList<>();
		myList.addAll(lset);
		String element=myList.get(2);
		System.out.println(element);
		
		//another way to create an object of array list by passign values
		//to constructor
		List<String> myList1=new ArrayList<>(lset);
		
		
		
	}

}
