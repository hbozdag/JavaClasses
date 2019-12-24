package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bestbuy {

	public static void main(String[] args) {

		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc )
		 * 
		 * Retrieve all keys and values from a Best Buy map using EntrySet.
		 */

		Map<Integer, String> product = new HashMap<>();

		product.put(82829109, "LG TV");
		product.put(76788976, "HEADPHONES");
		product.put(67875785, "Computer");
		product.put(56565, "ipad");
		product.put(4465, "fridge");

		
		Set<Entry<Integer, String>> entrySet = product.entrySet();
		
		for(Entry<Integer, String> set:entrySet) {
			System.out.println(set.getKey()+" = "+set.getValue());
			
		}
		
		System.out.println("=====retriving key and value using iterator======");
		
		Iterator<Entry<Integer, String>> entryIt=product.entrySet().iterator();
		while(entryIt.hasNext()) {
			Entry<Integer, String> singleEntry=entryIt.next();
			int key=singleEntry.getKey();
			String value=singleEntry.getValue();
			System.out.println(key+"--- "+value);
		}
		
		
		
		
		
		
	}

}
