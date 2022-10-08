package com.costco;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homepage;

	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/driver/geckodriver");
		
		//WebDriverManager.chromedriver().driverVersion().setup();
		WebDriverManager.chromedriver().driverVersion("105.0.5195.125").setup();
		// .driverVersion("105.0.5195.125")
		//driver = new FirefoxDriver();
		driver=new ChromeDriver();
		// navigating the URL
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		//driver.get("https://portal.cms.gov/portal");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homepage = new HomePage(driver);

	}

	//@AfterTest
	public void tearup() {
		driver.quit();
	}

}
