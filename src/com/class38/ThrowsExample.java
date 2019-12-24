package com.class38;

public class ThrowsExample {
	
	public static void main(String[] args) throws InterruptedException {
		callingMore();
		
	}

	
	static String name="John";
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("student is "+name+" sleeping");
		Thread.sleep(3000);
	}
	
	public static void callingSleepingStudent() throws InterruptedException {
		studentSleeping();
	}
	
	public static void callingMore() throws InterruptedException {
		try {
		callingSleepingStudent();
		}catch(InterruptedException e){
			System.out.println("interrupted exception");
		}
	}
	
	//when it doesn't want to handle it throws
	
}
