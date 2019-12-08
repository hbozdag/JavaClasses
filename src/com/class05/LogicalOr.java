package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
	
//7 days a week
		//if day is 2 or 4 -->SDLC
		//IF day is 6 or 7 -->Java
		//if day 1 or 5 -->no class
		//if day is 3 -->review
		
		int day=4;
		
		//false or false->false
		
		if(day==2|| day==4) {
			System.out.println("SDLC Clas");
			//true or false->true
		}else if (day==6 || day==7) {
			System.out.println("java Class");
		}else if (day==1 || day==5) {
			System.out.println("no class");
		}else if (day==3) {
			System.out.println("review");
		}else {
			System.out.println("not a valid day");
		}

		
		//7 days a week
				//if day tuesday or thursday  -->SDLC
				//IF day saturday or sunday  -->Java
				//if day monday or friday   -->no class
				//if day wednesday  -->review
		
		
		String weekDay="Sunday";
		
		if (weekDay.equals("tuesday") || weekDay.equals("thursday")){
			System.out.println("SDLC Clas");		
		}else if (weekDay.equals("saturday") || weekDay.equals("Sunday")) {
			System.out.println("java Class");
		}else if (weekDay.equals("monday")|| weekDay.equals("Friday")) {
			System.out.println("no class");
		}else if (weekDay.equals("wednesday")) {
			System.out.println("review");
		}else {
			System.out.println("not a valid day");
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
