package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/braidenjake/eclipse-workspace/Costco/driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.close();
	}
}
