package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super(); // you need to call testbase class constructor. 
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		
		//Create the obect of loginPage class
		//LoginPage loginPage = new LoginPage(); deifne in the class level. so that can use eveywhere inside the class
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		//as i have created loginpage object
		String title = loginPage.validateLoginpageTitle();
		Assert.assertEquals(title, "Facebook - Log In or Sign Up" );
	}
	@Test(priority=2)
	public void loginPageLogoTest() {
		Boolean logo = loginPage.LogoCheck();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}

	*/
	
}
