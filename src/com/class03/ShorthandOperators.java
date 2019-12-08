package com.class03;

public class ShorthandOperators {
	
	public static void main (String [] args) {
		
		int num=1000;
		num=num+1000;

		int num3=1000;
		num3+=1000; //num3=num3+1000;
		
		System.out.println(num3);
		int num4=50;
		num4+=20; // num4=num4+20
		
		//shortcut for printing syso+ctrl+s[pace
		
		System.out.println(num4);
		
		num4-=30; //num4=70-30
		System.out.println(num4);
		
		
		num4/=10;//num4=40/10
		System.out.println(num4);
		
		num4%=2; num=4%2;
		System.out.println(num4);
	
		
	num4*=10;
	
	System.out.println(num4);
		
		
	}

}
