package com.vGive.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.RegisterNowLinkPage;

public class RegisterNowLinkPageTest extends BaseClass {

	public static RegisterNowLinkPage registerNow;
	
	@BeforeMethod
	public void setup() throws Throwable {
		launchApp();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test (priority = 1)
	public void clickOnRegisterNowLinkFromCreateNewFundraiser() {
		
		registerNow=new  RegisterNowLinkPage();
		registerNow.RegisterNowLinkFromC();
		
		
	}
	@Test (priority = 2)
	public void clickOnRegisterNowLinkFromSupportExistingFundraiser() {
		
		registerNow=new  RegisterNowLinkPage();
		registerNow.RegisterNowLinkFromSup();
		
		
	}
	
	@Test (priority = 3)
	public void clickOnRegisterNowLinkFromSupportHomePage() {
		
		registerNow=new  RegisterNowLinkPage();
		registerNow.RegisterNowLinkFromHomP();
		
		
	}
}
