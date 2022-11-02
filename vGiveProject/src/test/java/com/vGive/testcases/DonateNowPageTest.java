package com.vGive.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.DonateNowPage;
import com.vGive.pageobjects.HomePage;

public class DonateNowPageTest extends BaseClass{

	DonateNowPage donateNowPage;
	
	
	@BeforeMethod
	public void setup() throws Throwable {
		launchApp();
	}
	
	@Test(priority = 1)
	public void verifyLogo() throws Throwable {

		donateNowPage=new DonateNowPage();
		boolean result=donateNowPage.verifyText();
		Assert.assertTrue(result);
		
	}
	@Test(priority = 2)
	public void clickOnDonateButton() throws InterruptedException {
		
		donateNowPage=new DonateNowPage();
		donateNowPage.clickOnDonateButton();
	}
	
	
}
