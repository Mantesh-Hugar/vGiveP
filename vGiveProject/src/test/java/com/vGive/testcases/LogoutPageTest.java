package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.LogoutPage;

public class LogoutPageTest extends BaseClass {

	LogoutPage logoutPage;

	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}

		@AfterMethod()
		public void tearDown() {
			driver.quit();
		}

	@Test(priority = 1)
	public void logout() throws InterruptedException {
		logoutPage = new LogoutPage();
		logoutPage.logOutPage();

	}
	
	@Test(priority = 2)
	public void logout1() throws InterruptedException {
		logoutPage = new LogoutPage();
		logoutPage.LogOutForCreateNewFundraiser();

	}
	
	@Test(priority = 3)
	public void logout2() throws InterruptedException {
		logoutPage = new LogoutPage();
		logoutPage.LogOutForSupportExistingFundraiser();

	}
	

	
}
