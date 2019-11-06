package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * check age, if age is less than 16 -->you are too young to drive
		 * otherwise --> you are eleigible to drive. if you are older than -->you can get driver permit
		 * if you are older than 18 -->
		 * you can get driver license and if not you cna get driver permit
		 */

		
		int age=17;
		
		if (age<16) {
			
			System.out.println("You are too young to drive");
		}else if (age>81) {
			System.out.println("purchase a spot in cemetery");
		}
		
		else {
			System.out.println("you are eligible to drive");
			
			
			if (age>=18) {
				System.out.println("you can drive alone");
			}else {
				System.out.println("you need your parents to drive");
			}
			
			
			
			
		}
		
		
		
		System.out.println("_______");
		
		/*
		 * 
		 * we need to check if student completed the quiz
		 * if yes-->good job, if not not good
		 * if it is compelte we will check grade
		 * if more than 90-->you got an A
		 *if motre than 80->you got a B
		 *ANYTHING BELOW you should study more
		 */
		
		boolean quiz=true;
		int score =67;
		
		
		
		if (quiz) {
			System.out.println("gOOD job!!!");
			
			if (score>=90) {
				System.out.println("You got an A");
			}else if (score>80){
				System.out.println("You got a B");
			}else {
				System.out.println("You should studfy more");
			}
			
			
		}else {
			System.out.println("not good");
		}
		
		
		
		
		
		
		
	}

}
