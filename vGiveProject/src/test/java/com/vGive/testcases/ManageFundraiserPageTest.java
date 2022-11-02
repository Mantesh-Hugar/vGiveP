package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.ManageFundraiserPage;

public class ManageFundraiserPageTest extends BaseClass {

	ManageFundraiserPage myAccount;
	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}

//		@AfterMethod()
//		public void tearDown() {
//			driver.quit();
//		}

		@Test(priority = 1)
	public void homePageLogin() throws InterruptedException {
		myAccount=new ManageFundraiserPage();
		myAccount.myAccount();
	}
		
		@Test(priority = 2)
		public void crateNewFundraiser() throws InterruptedException {
			myAccount=new ManageFundraiserPage();
			myAccount.myAccount1();
		}
		
		@Test(priority = 3)
		public void supportExistingFundraiser() throws InterruptedException {
			myAccount=new ManageFundraiserPage();
			myAccount.myAccount2();
		}
}

