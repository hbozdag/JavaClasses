package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		
		
		int y=10;
		
		while (y<=30) {
			System.out.print(y+ " ");
			y++;
		}
			
		System.out.println(" @@@");
			//how to print values 10 to 1
			
			int a =10;
			
			while (a>=1) {
				System.out.println(a);
				a--;
				
			}
			
			//how to print values from 50 to 20
			
			int b=50;
			
			while (b>=20) {
				System.out.println(b+ " ");
				b--;
			}
			
			
		

		
		System.out.println("________________");
		
		//I want to print only even numbers
		//1 way
		
		
		int z=2;
		
		while (z<=20) {
			
			System.out.println(z);
			z+=2;
		}
		
		//2nd way
		
		int q=1;
		
		while (q<=20) {
			
			if (q%2==0) {
				System.out.println(q);
				
			}
			q++;
		}
		System.out.println("**************");

		
		// print only odd numbers 50 to 100
		//print only even numbers to 100 to 1
		
		int c=51;
		
		while (c<=100) {
			System.out.println(c);
			c+=2;
		}
		System.out.println("********");
		
		int g=100;
		
		while (g>1) {
		if (g%2==0) {
			System.out.println(g);
		}
			g--;
		}
	}

}
