package com.class35;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Bestbuy {

	public static void main(String[] args) {

		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc )
		 * 
		 * Retrieve all keys and values from a Best Buy map using EntrySet.
		 */

		Map<Integer, String> product = new HashMap<>();

		product.put(82829109, "TV 40");
		product.put(76788976, "HEADPHONES");
		product.put(67875785, "Computer");
		product.put(56565, "ipad");
		product.put(4465, "fridge");

		
		Set<Entry<Integer, String>> entrySet = product.entrySet();
		
		for(Entry<Integer, String> set:entrySet) {
			System.out.println(set.getKey()+" = "+set.getValue());
			
		}
	}

}
