package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.PreviewOfFundraiserPage;

public class PreviewOfFundraiserPageTest extends BaseClass {

	public class LoginPageTest extends BaseClass {
		PreviewOfFundraiserPage preview;
	

		@BeforeMethod()
		public void setup() throws InterruptedException {
			launchApp();
		}

		@AfterMethod()
		public void tearDown() {
			driver.quit();
		}

		@Test(priority = 1)
		public void login1() throws Throwable {
			preview = new PreviewOfFundraiserPage();
			preview.PubblishPageButton();
		}
	}
}
