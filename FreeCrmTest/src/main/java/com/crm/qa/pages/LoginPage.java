package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory or OR
	@FindBy(name="email")
	WebElement username;
	
	@FindBy (name="pass")
	WebElement password;
	
	@FindBy (xpath="//input[@value='Log In']")
	WebElement submit;
	
	@FindBy (xpath="//i[@class='fb_logo img sp_7TPb4rZ1w7k sx_1f926f']")
	WebElement logo;
	
	//do this for all the elements present in the page
	
	//initialize the elements with the help of the page factory
	
	//create the constructor of this class
	public LoginPage() {
		PageFactory.initElements(driver, this);
		//with the help of this keyword all the variables defined above will be initialized with its driver
		//this -- pointing to the current class object
	}
	
	
	//different methods to perform functionality
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public Boolean LogoCheck() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		return new HomePage();
	}

}
