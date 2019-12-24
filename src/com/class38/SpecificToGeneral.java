package com.class38;

public class SpecificToGeneral {

	public static void main(String[] args) {
		
		int num1=10; int num2=0;
		int result;
		try {
			result = num1 / num2;//arithmetic exception
			System.out.println(result);
			Thread.sleep(2000);//new interrupted exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//System.out.println("Please do not pass 0 as a second number");
		}catch(InterruptedException e){
			//System.out.println("some interrupted program sleep");
			System.out.println(e);
		}catch(Exception e){
			System.out.println("catchign all types of exception");
		}
		
		//always go from most spefic one to general one

	}

}
