package com.class26;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FireFoxDriver firefox=new FireFoxDriver();
		firefox.refresh();
		firefox.open();
		
		//creating object of child class
		//and giving reference to parent class
		
		WebDriver driver=new ChromeDriver();
		driver.open();
		driver.refresh();
		//driver.getTitle();-->you will not have access to this method 
		//as it is only in the chid class
		
		
		
	}
	
	

}
