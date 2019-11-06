package com.class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		
String [][] names= {
		
		{"Khan", "Yousef", "Alex", "Zynab"},
		{"Haci", "Ann", "Nesli", "Weqasian"},
		{"Diego", "Asif", "Zubair", "Shogofa"},
		
		
		
	
};
	int lengthOfRows=names.length;	
		
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[0].length;
		
		for (String getArrays[]:names) {
			for( String getName:getArrays) {
				
				System.out.print(getName+ " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
