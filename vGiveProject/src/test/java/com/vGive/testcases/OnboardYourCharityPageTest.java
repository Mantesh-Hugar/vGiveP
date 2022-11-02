package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.OnboardYourCharityPage;

public class OnboardYourCharityPageTest extends BaseClass {

	OnboardYourCharityPage onBoard;
	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}
	
//	@AfterMethod()
//	public void tearDown() {
//		driver.quit();
//	}
	@Test(priority = 1)
	public void Registernow() throws Exception {
		onBoard = new OnboardYourCharityPage (); 
		onBoard.OnBoardYourCharityPage();
		
	}
}
