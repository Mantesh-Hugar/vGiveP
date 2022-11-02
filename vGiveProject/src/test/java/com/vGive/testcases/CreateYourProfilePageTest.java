package com.vGive.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.base.BaseClass;
import com.vGive.pageobjects.CreateYourProfilePage;

public class CreateYourProfilePageTest extends BaseClass{
	CreateYourProfilePage createYP;
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		launchApp();
	}
	
	@Test(priority = 1)
	public void Registernow() throws Exception {
		createYP = new CreateYourProfilePage(); 
		createYP.RegisterNowLink();
		
	}
}
