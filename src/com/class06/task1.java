package com.class06;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		  System.out.println("Please enter two strings");

		   Scanner scan=new Scanner(System.in);

		    String noun1=scan.nextLine();

		    String noun2=scan.nextLine();

		   

		  System.out.println("Please enter two numbers");

		   



		//here it doesn’t let me use int.why?   

		  int num1=scan.nextInt();

		  int  num2=scan.nextInt();

		   

		  if (noun1.equals(noun2)&&num1==num2){

		    System.out.println("AND");

		  }else if (noun1.equals(noun2)||num1==num2){

		    System.out.println("OR");

		  }else if (!(noun1.equals(noun2)&&num1==num2)){

		    System.out.println("NONE");

		  }

	}

}
