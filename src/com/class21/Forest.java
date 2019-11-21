package com.class21;

public class Forest {

	public String animalName;
	public int animalID;
	public static int numberOfAnimals;

	public static void main(String[] args) {

		Forest animal0 = new Forest();

		animal0.animalID = 01;
		animal0.animalName = "wolfe";
		Forest.numberOfAnimals++;

		Forest animal1 = new Forest();

		animal1.animalID = 02;
		animal1.animalName = "fox";
		Forest.numberOfAnimals++;

		Forest animal2 = new Forest();

		animal2.animalID = 03;
		animal2.animalName = "bear";
		Forest.numberOfAnimals++;

		System.out.println(" Number of animals in the forest is " + Forest.numberOfAnimals++);

	}

}
