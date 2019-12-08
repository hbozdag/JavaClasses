package com.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		   
		   System.out.println("Enter the name of the instructor.");
		   
		   String instructor;
		   
		   instructor=scan.nextLine();
		   
		  
		  String courseName;
		  
		  
		  switch (instructor){
		  
			  
		    case "Shiva":
		      courseName="Java Assignment";
		      break;
		      
		      case "Sandish": 
		        courseName="SDLC Assignment";
		      break;
		      case "Weqas":
		        courseName="Selenium Assignment";
		      break;
		    case "Asel":
		      courseName="every Assignment";
		      break;
		      
		      default:
		      courseName="Unknown";
		     
		  }
		  
		  System.out.println("Will take care of "+ courseName);
	    
	    
	    
	  }


	}


