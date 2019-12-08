package com.class06;
import java.util.Scanner; 

public class Question35 {

	public static void main(String[] args) {
		
		
		  
		 
		    
		    Scanner scan= new Scanner(System.in);
		    
		    System.out.println("Do you need a loan?");
		    
		    boolean loan=scan.nextBoolean();
		  
		    
		    if (loan){
		      
		      System.out.println("What is your credit score?");
		      
		       int creditScore=scan.nextInt();
		       
		      if (creditScore<600){
		        System.out.println("The eligibility is Not eligible");
		      } 
		      else if (creditScore>=600&&creditScore<=700){
		        System.out.println("The eligibility is Maybe eligible");
		      }
		      else if(creditScore>=701&&creditScore<=800){
		        System.out.println("The eligibility is Eligible");
		      }else {
		        System.out.println("The eligibility is Definitely eligible");
		      }
		    }else {
		      System.out.println("The eligibility is unknown");
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  }
		  
		  
		  

	

	}


