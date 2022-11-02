package com.vGive.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.HomePage;


public class HomePageTest extends BaseClass {

	public static HomePage homePage;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
//	@AfterMethod()
//	public void tearDown() {
//		driver.quit();
//	}
	
	@Test(priority = 1)
	public void verifyLogo() throws Throwable {

		homePage= new HomePage();
		boolean result=homePage.validateLogo();
		Assert.assertTrue(result);
		
	}
	
	@Test(priority = 2)
	public void verifyTitle() {
		
		String actTitle=homePage.getvGiveTitle();
		Assert.assertEquals(actTitle, "vGive");
		System.out.println(actTitle);
	
	}
	@Test(priority = 3)
	public void clickCreateNewFundraiser() {
		homePage= new HomePage();
		homePage.MouseHoverAndClickonCreateNewFundraiser();
	}
	
	@Test(priority = 4)
	public void clickSupportExistingfundraiser() {
		homePage=new HomePage();
		homePage.MouseHoverAndClickonSupportExistingFundraiser();
	}
	
	@Test(priority = 5)
	public void clickOnLoginButton() {
		homePage = new HomePage();
		homePage.ClickOnHomePageLoginButton();
	}
	
	@Test(priority = 6)
	public void clickOnDonateNow() {
		homePage=new HomePage();
		homePage.ClickOnDonateNowButton();
	}
}
