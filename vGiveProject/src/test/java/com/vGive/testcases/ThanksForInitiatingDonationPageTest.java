package com.vGive.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.ThanksForInitiatingDonationPage;

public class ThanksForInitiatingDonationPageTest extends BaseClass{

	ThanksForInitiatingDonationPage thanksPage;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void thanksForInitiating() throws InterruptedException {
		thanksPage=new ThanksForInitiatingDonationPage();
		thanksPage.thanksForInitiating();
	}
}
