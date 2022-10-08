package com.costco.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.costco.BaseClass;

public class TestClass extends BaseClass {

	@Test(enabled = false, priority = 1)
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		homepage.isLogoDisplayed();
		Thread.sleep(3000);
	}

	@Test(enabled = false, priority = 2)
	public void signInButtonClickTest() throws InterruptedException {
		Thread.sleep(3000);
		homepage.signInButton();
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 3)
	public void whileSuppliesClickTest() throws InterruptedException {
		Thread.sleep(3000);
		homepage.whileSupplies();
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 4)
	public void treasureHuntTest() throws InterruptedException {
		Thread.sleep(3000);
		homepage.treasureHuntClicking();
		Thread.sleep(3000);
	}
	@Test(enabled = false) 
	public void sameDayElementTest() throws InterruptedException {
		Thread.sleep(3000);
		homepage.sameDayClicking();
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 5)
	public void warehouseSavingsTest() {
		homepage.warehouseSavings();
	}
	//new
	@Test(enabled =false)
	public void searchFieldTest() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-describedby='search-field-description'][2]")).click();
		Thread.sleep(3000);	
	} 
	@Test(enabled = false)
	public void ordersReturnsTest() {
		driver.findElement(By.id("header_order_and_returns")).click();

	}
	@Test(enabled = false)
	public void passWordClickTest() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.name("ods-input-1")).click();
	}
	@Test(enabled = false)
	public void creditCardsClickTest() {
		driver.get("https://www.capitalone.com/");
		driver.findElement(By.className("at-element-click-tracking")).click();
	}  
	@Test(enabled = false)
	public void termsandConditionsLinkTest() {
		driver.findElement(By.linkText("Terms and Conditions")).click();
	}	
	@Test(enabled = false)
	public void LearnAboutOurCommitmentToWomenButtonTest() {
		driver.get("https://www.cvs.com/");
		driver.findElement(By.partialLinkText("Learn about o")).click();
	}
	@Test(enabled = false)
	public void ordersReturnsClickTest() {
		driver.findElement(By.cssSelector("a.myaccount")).click();
	}
	@Test (enabled = false)
	public void groceryButtonTest() {
		driver.findElement(By.cssSelector("a#Home_Ancillary_0")).click();
	}
	@Test(enabled = false)
	public void sameDayClickTest() {
		driver.findElement(By.cssSelector("a.grocery.nav-flyout")).click();
//new
}@Test(enabled = false)
public void use_Of_Selected_mathod() {
	boolean shopIsselected = driver.findElement(By.cssSelector("a#navigation-dropdown")).isSelected();
	System.out.println("Is shop is selected" + shopIsselected);
}
@Test(enabled = false)
    public void use_of_getTile_method() {
	System.out.println("The title of the page is:" + driver.getTitle());
}
@Test(enabled = false)
   public void use_of_getText_method() {
	WebElement nur=driver.findElement(By.xpath("//a[text()='Reorder']"));
	System.out.println("The text for the Web Element is:"+nur.getText());
}
 @Test(enabled = false)
    public void use_of_getCurrentURL_method() throws InterruptedException{
	driver.findElement(By.xpath("//a[text()='Sign In / Register']")).click();
	Thread.sleep(4000);
	System.out.println("The current URL is:"+driver.getCurrentUrl());
    }
    @Test(enabled = false)
    public void use_of_getAttribute_method() {
    String value01 =driver.findElement(By.xpath("//a[text()='Sign In / Register']")).getAttribute("id");
    System.out.println("The value of id Attribute is:"+value01);
    }
    @Test(enabled = false)
    public void use_of_sendKeys_method() throws InterruptedException{
    driver.get("https://www.capitalone.com/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@id='ods-input-0']")).sendKeys("gonsal");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@name='ods-input-1']")).sendKeys("kim");
    Thread.sleep(4000);	
    	
}
   
	@Test(enabled = false)
	public void use_of_senKeys_method_then_click_submit_and_then_clear() throws InterruptedException {
		 
	driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("TV");
	
	driver.findElement(By.xpath("(//i[@class='co-search-thin'])[1]")).click();

	driver.findElement(By.xpath("//input[@id='search-field']")).clear();
	//driver.navigate().refresh();
	WebElement searchField=driver.findElement(By.xpath("//input[@id='search-field' or name='keyword']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeSelected(searchField));
	searchField.sendKeys("mobile");
	/*driver.findElement(By.xpath("(//i[@class='co-search-thin'])[1]")).click();
	Thread.sleep(2000);
	try {
	driver.findElement(By.xpath("//input[@id='search-field']//parent::span")).clear();
	}catch (Exception e) {
		e.getStackTrace();
	} */

}
	
	@Test(enabled = false)
	public void use_of_senKeys_method_then_click_by_enter_key_and_then_clear() throws InterruptedException { 
	driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("TV",Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='search-field']")).clear();
	Thread.sleep(4000);
	WebElement searchField=driver.findElement(By.xpath("//input[@id='search-field']"));
	searchField.sendKeys("Mobile",Keys.RETURN);
	//Thread.sleep(2000);
	//searchField.clear();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='search-field']")).clear();    
}  
  @Test (enabled = false)
  public void use_of_navigate_method()throws InterruptedException{
	Thread.sleep(4000);
	driver.navigate().to("http://www.Costco.com");
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(4000);
  }
  @Test(enabled = false)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(700, 400);
		driver.manage().window().setSize(dimension); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.costco.com/");
		Thread.sleep(4000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.manage().window().setSize( dimension); 
		Thread.sleep(4000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());


  }
      //@Test(enabled = true)
     // public void dropdown_selectByIndex_method () throws InterruptedException {
     // WebElement dropElement =driver.findElement(By.id()));
      //Select select = new Select (dropElement);
      //select.selectByIndex(3);
      //Thread.sleep(3000);
      }
      




}