package com.vGive.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.CreateFundraiseForYourCharityPage;
import com.vGive.pageobjects.LoginPage;

public class CreateFundraiseForYourCharityPageTest extends BaseClass {

	CreateFundraiseForYourCharityPage createNewFund;
	

	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}

//	@AfterMethod()
//	public void tearDown() {
//		driver.quit();
//	}

	@Test(priority = 1)
	public void login1() throws Exception {

		createNewFund = new CreateFundraiseForYourCharityPage();
		createNewFund.LoginForCreateNewFundraiser();
	}
}
