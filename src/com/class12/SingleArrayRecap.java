package com.class12;

import java.util.Scanner;

public class SingleArrayRecap {
	
	public static void main(String[] args) {
		
		
		int [] array1=new int [4];
		
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		System.out.println(array1[1]);
		
		for (int s=0; s<4; s++) {
			System.out.println(array1[s]);
		}
System.out.println("%%%%%%%%%%%%%%%");
		
		for (int i:array1) {
			System.out.println(i);
		}
		
		System.out.println("%%%%%%%%%%%");	
		int [] array2= {2,5,4,7};
		
		for(int i:array2) {
			System.out.println(i);
		}
		System.out.println("%%%%%%%%%%%");	
		int [] arr=new int [3];
		Scanner scan=new Scanner(System.in);
		
		  for(int i=0;i<arr.length;i++) {
	            arr[i]=scan.nextInt();
	        }
	        
	        for(int i=0; i<arr.length;i++) {
	            System.out.println(arr[i]+" ");
	        }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
