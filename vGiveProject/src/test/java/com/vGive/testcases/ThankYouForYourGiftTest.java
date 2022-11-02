package com.vGive.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.ThankYouForYourGift;

public class ThankYouForYourGiftTest extends BaseClass{

	ThankYouForYourGift thankYou;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void TypeEmailId() throws InterruptedException {
		thankYou=new ThankYouForYourGift();
		thankYou.clickOnEmailId();
	}
}
