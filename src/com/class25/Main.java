package com.class25;

public class Main {

	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

//	public Main(String string, String string2, double d) {
//		// TODO Auto-generated constructor stub
//	}

	public  Main(String dogName, String dogBreed, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
		this.dogBreed = dogBreed;
	}

	public void Main(String dogName, double dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;

	}

	public void display() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	}

	public static void main(String[] args) {

		Main dog = new Main("Tarzan", "Mutt", 50.0);
		dog.display();

	}

}
