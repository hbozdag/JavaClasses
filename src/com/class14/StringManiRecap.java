package com.class14;

public class StringManiRecap {

	public static void main(String[] args) {
		
		
		// .replace
		
		String str=" your Syntax Technologies";
		
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("!!!!!!!!!");
		
		System.out.println(str.replace("your", "My"));//target and replacement
		
		System.out.println("@@@@@@@@@@");
		
		//.replaceAll
		//regular expression this one follows a pattern
		
		String str1= "Sophie Amundsen &*%$ is fourteen years old when the book begins, "
				+ "living in Norway. She begins a strange correspondence course "
				+ "in philosophy 5. Every day, a letter comes to her mailbox that "
				+ "contains a few questions and then later in the day a package "
				+ "comes with some typed pages describing the ideas of a philosopher "
				+ "who dealt with the issues raised by the questions. "
				+ "Although at first she does not know, later on Sophie learns that"
				+ " Alberto Knox is the name 2 of the philosopher who is teaching her."
				+ " He sends her packages via his dog Hermes."
				+ " Alberto first tells Sophie that philosophy is extremely "
				+ "relevant to life and that if we do not question and ponder our very …";
		
//		System.out.println(str1.replaceAll(regex, replacement));
		
		System.out.println(str1.replaceAll("fourteen(.*)", ""));//remove all starting from fourteen
		
		String str2= "3833838Hell93939o";
		
		System.out.println(str2.replaceAll("[0-9]", ""));//remove numbers
		
		System.out.println(str2.replaceAll("[^0-9]", ""));//only leave numbers
		System.out.println(str2.replaceAll("[^A-z]", ""));//only leave letters regardless of case
		
		System.out.println("##########");
		
		System.out.println(str1.replaceFirst(" " , ""));//it will only replace the first space
		System.out.println(str1.replace('r', 'z'));
		System.out.println(str1.replace("Sophie Amundsen", "Harun Bozdag"));
		System.out.println(str1.replaceAll("[^0-9]", ""));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toLowerCase().replaceAll("amundsen", "bozdag"));
		System.out.println(str1.replaceAll("\\w", ""));//lowecase w only leaves special characters
		System.out.println(str1.replaceAll("\\W", ""));//leaves only letters

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
