package com.vGive.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.HelpRaiseFundsForTheCharityOfYourChoicePage;

public class HelpRaiseFundsForTheCharityOfYourChoicePageTest extends BaseClass{

	public class LoginPageTest extends BaseClass {
		HelpRaiseFundsForTheCharityOfYourChoicePage helpraiseforthefundraiserpage;
	

		@BeforeMethod()
		public void setup() throws InterruptedException {
			launchApp();
		}

//		@AfterMethod()
//		public void tearDown() {
//			driver.quit();
//		}

		@Test(priority = 1)
		public void login1() throws Throwable {
			helpraiseforthefundraiserpage = new HelpRaiseFundsForTheCharityOfYourChoicePage();
			helpraiseforthefundraiserpage.clickOnSupportButton();
		}
	}
}
