package com.class3;

public class Recap {

	public static void main(String[] args) {
		
		
		int num=23;
		num=90;
		num-=200; //-110=90-200
		num-=110;
		num+=220;
		
		if (num>0) {
			
			System.out.println(num+" is a positive number ");
		}else if (num==0){
			System.out.println("Value of num is "+num);
			
		}else {
			System.out.println(num+" is a negative number");
		}

	}

}
