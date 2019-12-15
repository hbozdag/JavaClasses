package com.class32;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<String>nameList=new ArrayList<>();
	nameList.add("Lili");
	nameList.add("Lolo");
	nameList.add("Lale");
	nameList.add("Loki");
	nameList.add("Lane");
	
	if (!nameList.isEmpty()) {
		System.out.println("Array list is not empty");
		if (nameList.contains("Loki")) {
			System.out.println("Loki is in the list");
		}
	}else {
		System.out.println("Array list is empty");
	}
	
	for (String names:nameList) {
		System.out.println(names);
	}
	
	
	//non-generic array list. this can hold any type of object
	ArrayList alist=new ArrayList();
	alist.add("hello");
	alist.add(100);
	alist.add(true);
	alist.add('f');
	alist.add(10.22);
	
	
	
	System.out.println(alist);
	
	
	
	

}
}