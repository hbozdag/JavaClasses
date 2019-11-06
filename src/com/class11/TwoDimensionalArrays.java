package com.class11;

public class TwoDimensionalArrays {
	
	public static void main(String[] args) {
		
		
		
		//declare 2D array
		
		
		int [][] array=new int [3][4];
		
		
		//1st row
		
		array[0][0]=44;
		array [0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		
		//2nd row
		
		array[1][0]=10;
		array [1][1]=5;
		array[1][2]=7;
		array [1][3]=8;
		
		
		System.out.println(array[1][2]);
		
				
		
		
		//task; create 2d array of string with 2 rows and 3 columns
		
		String [][] names= new String [2][3];
		
		names[0][0]= "Ali";
		names [0][1]="Veli";
		names [0][2]= "Omer";
		names [1][0]="Haci";
		names [1][1]= "Dayi";
		names [1][2]="Hoca";
		
		System.out.println(names [1][2]);
		
		
		int [][] numbers= {
				
				{8,7,5,3,8},
				{1,5,6,4,9,8},
				{3,6,8,0,7}	
				
		};
	
		
		
		System.out.println(numbers[1][4]);
		
		//to identify number of rows
		
		System.out.println("the number of rows are: "+numbers.length);
		//to identify number of columns in that row
		
		System.out.println("the number of columns in second are: "+numbers[1].length);
		
		System.out.println("the number of columns in first are: "+numbers[0].length);
		
		System.out.println(numbers [0][4]);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers [i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
