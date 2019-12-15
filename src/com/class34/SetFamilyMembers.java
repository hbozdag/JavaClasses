package com.class34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamilyMembers {

	public static void main(String[] args) {

		// create a collection that wont allow dupicates
		// and preserve the insertion order

		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Pear");
		fruitSet.add("Berry");
		fruitSet.add("Banana");
		fruitSet.add("Apple");

		System.out.println(fruitSet.size());
		System.out.println(fruitSet);

		// it is supposed to be 6 but set does nto allow the duplicates so it will give
		// you 4

		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(999);
		tset.add(23);
		tset.add(45);
		tset.add(0);
		tset.add(999);
		
		//it removes the duplicates and set them in order

		System.out.println(tset.size());
		System.out.println(tset);
		
		
		//adding collection into another collection
		
		List<String> list=new ArrayList<>();
		
		list.add("java");
		list.add("selenium");
		Set<String> linkedSet=new HashSet<>();
		
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		
		Set<String> linkedSet1=new LinkedHashSet<>();
		linkedSet1.addAll(fruitSet);
		System.out.println(linkedSet1);
	}

}
