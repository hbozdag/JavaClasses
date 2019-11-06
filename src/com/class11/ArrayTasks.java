package com.class11;

public class ArrayTasks {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		
String[] cars= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
        
        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        
        
        //for each loop way:
        String[] cars2= {"Bmw","Audi","Jaguar","Toyota","Mercedes","Hyundai"};
    
        
        for(String element:cars2) {
            System.out.println(element);
        }
        
String[] object= {"pencil","pen","eraser","notebook","book","binder"};
    
        
        for(String things:object) {
            System.out.println(things);
        }
        
        //Create an array on integers and calculate the sum of all elements in an array.
        int [] nums = {1,4, 6, 9, 35,78,65};
        int sum = 0;
        
        for (int element : nums) {
            
            System.out.println(element);
            sum = sum+element;
        
        }
        System.out.println("The sum is " + sum);
        
        
        
String[] country= {"Germany", "USA", "Canada", "Turkey"};
        
        for(String c:country) {
            switch(c) {
            case "Germany":
                System.out.println("Berlin");
                break;
            case "USA":
                System.out.println("Washington DC");
                break;
            case "Canada":
                System.out.println("Ottowa");
                break;
            case "Turkey":
                System.out.println("Ankara");
                break;
            }
        }
    }

	

}

