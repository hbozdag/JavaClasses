package com.class10;

import java.util.Scanner;

public class ReplQ80 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int num=scan.nextInt();
		for ( int i=1; i<=num; i*=10){
		  for (int j=10; j<=50; j+=10){
		    
		    System.out.println(j);
		  }
		}

	}

}
