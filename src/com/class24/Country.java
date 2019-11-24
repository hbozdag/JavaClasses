package com.class24;

public class Country {
	
	//constructors

	public String capital, name;
	public int population;
	
	
	Country(){
		System.out.println("I am non-argument constructor");
	}

	Country(String name, String capital, int population) {
		this.name = name;//this keyword always points out to current instance variable
		this.capital = capital;//use this kwyword to avoid many diffeent local variable names
		this.population=population;
	}
	
	public void displayInfo() {
		System.out.println(name+" "+capital+" "+population);
	}

	public static void main(String[] args) {

		Country country1 = new Country("USA", "Washnington DC", 400);
		Country country2 = new Country("Kazakhstan", "Astana", 500);
		
		Country country3 = new Country();
		country1.displayInfo();
		
		System.out.println(country1.name);
		System.out.println(country2.name);
		
		

	}
}
