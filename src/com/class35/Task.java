package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> building = new HashMap<>();

		building.put(4, "Google");
		building.put(12, "Syntax");
		building.put(13, "Facebook");
		building.put(14, "Twitter");
		building.put(7, "school");
		building.put(16, "coolsis");
		building.put(17, "cisco");

		System.out.println(building.size());

		building.replace(4, "Google");
		building.remove(7, "school");

		System.out.println(building);

	}

}
