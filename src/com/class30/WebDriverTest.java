package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.closeBrowser();
		driver.openBrowser();
		driver.findElement();
		driver.takeScreen();
		driver.takePictures();
		
		
		TakeScreenshot screen=new ChromeDriver();
		screen.takeScreen();
		screen.takePictures();
		//screen.findElement(); ce: it will not give access since we refer it to takescreen 

	}

}
