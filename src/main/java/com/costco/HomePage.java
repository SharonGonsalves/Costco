package com.costco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	
	@FindBy(xpath = "(//img[@class='bc-logo logo-us'])[2]")
	WebElement logo;

	@FindBy(xpath = "//a[@id='header_sign_in']")
	WebElement signIn;

	@FindBy(xpath = "//a[@class='hidden-xs hidden-sm hidden-md']")
	WebElement whileSuppliesLastElement;

	@FindBy(xpath = "(//a[@class='hidden-xs hidden-sm hidden-md hidden-lg'])[1]")
	WebElement treasureHunt;

	@FindBy(how = How.XPATH, using = "(//a[@class='hidden-xs hidden-sm'])[1]")
	WebElement sameDay;

	@FindBy(xpath = "//a[text()='Warehouse Savings']")
	WebElement warehouseSavingsElement;

	By forgotSignIn =By.id("costco-forgot-signin");
	
	
	
	public boolean isLogoDisplayed() {
		boolean isDisplayed = logo.isDisplayed();
		System.out.println("Is logo Displayed: " + isDisplayed);
		return isDisplayed;
	}

	public void signInButton() {
		signIn.click();
	}

	public void whileSupplies() {
		whileSuppliesLastElement.click();
	}

	public void treasureHuntClicking() {
		treasureHunt.click();
	}

	public void sameDayClicking() {
		sameDay.click();
	}

	public void warehouseSavings() {
		warehouseSavingsElement.click();
	}
	public void signInClicked() throws InterruptedException{
		driver.findElement(forgotSignIn).click();
		
	}
   //new
	@Test(enabled = true)
	public void use_of_senKeys_method_then_click_submit_and_then_clear() {
	
	    
}}