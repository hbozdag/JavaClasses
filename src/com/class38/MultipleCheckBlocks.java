package com.class38;

public class MultipleCheckBlocks {

	public static void main(String[] args) {

//		int num1 = 12;
//		int num2 = 13;

		division(12, 0);
		division(12, 2);

	}

	public static void division(int num1, int num2) {

		int result;
		try {
			result = num1 / num2;//arithmetic exception
			System.out.println(result);
			Thread.sleep(2000);//new interrupted exception
		} catch (ArithmeticException e) {
			System.out.println("Please do not pass 0 as a second number");
		}catch(InterruptedException e){
			System.out.println("some interrupted program sleep");
			
		}catch(Exception e){
			System.out.println("catchign all types of exception");
		}
		System.out.println("end of my code");
	}
	
}
