package com.class35;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.*;


public class RetrievingAll {

	public static void main(String[] args) {
		// let's create a map of classroom in which we will store objects
		// and its quantities

		Map<String, Integer> classRoom = new HashMap<>();

		classRoom.put("Instructor", 3);
		classRoom.put("Stdudent", 80);
		classRoom.put("tables", 20);
		classRoom.put("chairs", 80);

		System.out.println(classRoom);

		Set<Entry<String, Integer>> entrySet = classRoom.entrySet();
		
		System.out.println("++++++++using for each loop to get all entry objects=====");
		
		for (Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+" "+":"+entry.getValue());
			
		}
		System.out.println("++++++++using iterator to get all entry objects=====");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
//			entryIterator.next().getKey();
//			entryIterator.next().getValue(); 
			
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+" "+ent.getValue();
			System.out.println(entry);
		
		}

	}

}
