package com.class6;

public class RecapLogical {

	public static void main(String[] args) {
		
		
		/*
		 * declare the time (1-24)
		 * based on the time identify whether it is morning, afternoon, eveening or night
		 * if 1-11-->morning
		 * if 12-15-->noon
		 * if 16-20-->eveing
		 * if >20 night
		 * 
		 */

		
		int time=50;
		String timeOfDay;
		
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
			
		}else if (time>=12&&time<=15) {
			timeOfDay="noon";
		}else if (time>=16&&time<=20) {
			timeOfDay="evening";
		}else if (time>20&&time<=24) {
			timeOfDay="night";
		}else {
			timeOfDay="invalid";
		}
		
				System.out.println("time of the day is "+ timeOfDay);
		
		
		
		if (timeOfDay.equals("morning")) {
			System.out.println("Good Morning");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
