package com.class37;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Repl211 {

	public static void main(String[] args) {
		/*
		 * Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
		 * 
		 * Step 2: Create appleMap<String, Object> and add below pairs into it. "Items",
		 * "Apple" "Price", 20.00 "Quantity", 10
		 * 
		 * Step 3: Add appleMap to dataList.
		 * 
		 * Step 4: Create orangeMap<String, Object> and add below pairs into it.
		 * "Items", "Orange" "Price", 21.99 "Quantity", 10
		 * 
		 * Step 5: Add orangeMap to dataList.
		 * 
		 * Step 6: Create a loop from dataList.
		 * 
		 * Step 7: Retrieve each Key and store is in a variable.
		 * 
		 * Step 8: calculate the subtotal of each object.
		 * 
		 * Step 9: Print the values of each Iteration same as shown below in Output
		 * example.
		 * 
		 * 
		 * Step 10:Calculate the Sum of subtotal. and store is in variable called
		 * totalPurchase.
		 * 
		 * Step 11: After Loop Print the value of Total Purchase.
		 */

		// declare a list in which we store collection of maps
		List<Map<String, Object>> dataList = new ArrayList<>();

		// inside list i CAN HAVE MAP

		// c reate a map that will store string as key and object as value
		Map<String, Object> appleMap = new TreeMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.0);
		appleMap.put("Quantity", 10.0);

		dataList.add(appleMap);

		// create a map that will store string as key and object as value
		Map<String, Object> orangeMap = new TreeMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 20.0);
		orangeMap.put("Quantity", 10.0);

		dataList.add(orangeMap);

		System.out.println(dataList);
	}

}
