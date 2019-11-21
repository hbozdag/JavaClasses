package com.class17;

public class ObjectsOfComputerClass {

	public static void main(String[] args) {
		// to create an object syntax is 
				// Class variable=new Class();
				//Scanner scan=new Scanner(Systme.in);
				//String variable=new String ();
		
		Computer computer1=new Computer();
		
		computer1.brand="apple";
		computer1.memory=8;
		computer1.monitor=17;
		computer1.name="Macbook pRO";
		
		computer1.javaCoding();
		computer1.playGames();
		computer1.watchMovie();
		
		
		
		
		Computer computer2=new Computer();
		
		computer2.brand="asus";
		computer2.memory=9;
		computer2.monitor=23;
		computer2.mouse="asusian";
		computer2.ram=78;
		computer2.name="asusdeluxe";
		
		computer2.javaCoding();
		computer2.playGames();
		computer2.watchMovie();
		
		
		
		
		System.out.println(" i have an "+computer1.brand +" "+computer1.name);
		
		System.out.println(" I have one crazy computer called "+ computer2.name+ " and it has "+computer2.memory+" memory with "+computer2.ram+" ram");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
