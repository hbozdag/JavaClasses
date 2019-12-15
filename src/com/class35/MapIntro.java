package com.class35;

import java.util.*;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

// to store key+value pair into map
		
		map.put(101, "John");
		map.put(102, "jack");
		map.put(103, "jane");
		map.put(104, "jill");
		
		System.out.println(map);
   //how to verify if there are any elements inside the map
		
		boolean flag=map.isEmpty();
		
		if (!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
		//i want to add more entry objects
		
		//map.put("105", "John");--> ce: keys and values types do not match
		
		//adding duplicate values
		map.put(105, "John");
		System.out.println(map);
		
		//adding duplicate keys-->override, we cannot have duplicate keys
		map.put(102, "hasan");
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		
		map.replace(103, "zeynep");
		System.out.println(map);
		
		
		//how to remove an object from a map
		
		map.remove(101);
		System.out.println(map);
		
		
		//how to verify if certain key exists
		
		boolean flag1 =map.containsKey(103);
		
		if (flag1){
			map.replace(103, "Seval");
			
		}else {
			map.put(103, "seval");
			
		}
		
		
		//how to verify if certain value exists
		
		boolean contains=map.containsValue("Seval");
		System.out.println(contains);
		
		
		
		
	}
	
}
