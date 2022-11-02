package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.RequestSuccessfullySubmittedPage;

public class RequestSuccessfullySubmittedPageTest extends BaseClass {
	RequestSuccessfullySubmittedPage submittedButton;
	
	@BeforeMethod
	public void  setup() throws InterruptedException {
		launchApp();
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}
	
	@Test(priority = 1)
	public void clickOnRequestSuccessfullySubmittedButton() throws Exception {
		submittedButton=new RequestSuccessfullySubmittedPage();
		submittedButton.RequestSuccessfullyPage() ;
	}
	
//	@Test(priority = 1)
//	public void validateText() {
//		submittedButton.verifyTitle();
//	}
}
