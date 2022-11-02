package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.LoginPage;


public class LoginPageTest extends BaseClass {
	LoginPage loginPage;

	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}

//	@AfterMethod()
//	public void tearDown() {
//		driver.quit();
//	}

	@Test(priority = 1)
	public void login1() {

		loginPage = new LoginPage();
		loginPage.LoginForCreateNewFundraiser();
	}

	@Test(priority = 2)
	public void login2() throws Exception {
		loginPage = new LoginPage();
		loginPage.LoginForSupportExistingFundraiser();
	}
	
	@Test(priority = 3)
	public void login3() {
		loginPage = new LoginPage();
		loginPage.LoginForMyAccount();
	}
	
}
