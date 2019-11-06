package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
	
	
	
	public static void main(String[] args) {
		
		String[] actualNames= { "Jhon", "Smith", "Alex", "Tanaz"};
				
		
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon", "Alex", "Tanaz"};
        	
        	
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
		
		String firstName="Zom";
		String firstName2="Ali";
		
		String firstName3="Zom";
		String firstName4="Ali";
		
		String actl=firstName+firstName2;
		String expt=firstName3+firstName4;
		System.out.println();
		
		
		
		int [] numbers= {123,34,55,66,99};
		
		
		
		for (int i:numbers) {
			System.out.println(i);
		}
		System.out.println("&&&&&&&&&");
		Arrays.sort(numbers);
		for (int i:numbers) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
	}

}
