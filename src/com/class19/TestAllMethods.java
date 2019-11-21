package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// find the largest from 300 and 500
		//then identify 
		
		AllMethods obj=new AllMethods();
		
		int large=obj.findLargest(87, 44);
		
		String day=obj.weekDayName(5);
		
		if (day.equals("Tuesday") || day.equals("Wednesday") || 
				day.equals("Thursday") || day.equals("Saturday")){
			
			System.out.println("I am learning java");
		}else {
			System.out.println("I am practicing java");
		}

	}

}
