package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.PreviewOfYourFundraiserPage;

public class PreviewOfYourFundraiserPageTest extends BaseClass{
	
	PreviewOfYourFundraiserPage previewFunds;
	

	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void login1() throws Exception {

		previewFunds = new PreviewOfYourFundraiserPage();
		previewFunds.PreviewFundraiserFlow();
	}

}
