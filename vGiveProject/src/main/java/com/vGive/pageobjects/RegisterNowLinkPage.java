package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class RegisterNowLinkPage extends BaseClass {

	public static HomePage homePage;
	
	@FindBy(xpath = "//a[text()='Register now']")
	WebElement RegisterNowLink;
	
	
	public RegisterNowLinkPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CreateYourProfilePage RegisterNowLinkFromC() {
		homePage=new HomePage();
		homePage.MouseHoverAndClickonCreateNewFundraiser();
		Action.click(driver, RegisterNowLink);
		return new CreateYourProfilePage();
		
	}
	
	public CreateYourProfilePage RegisterNowLinkFromSup() {
		homePage=new HomePage();
		homePage.MouseHoverAndClickonSupportExistingFundraiser();
		Action.click(driver, RegisterNowLink);
		return new CreateYourProfilePage();
		
	}
	public CreateYourProfilePage RegisterNowLinkFromHomP() {
		homePage=new HomePage();
		homePage.ClickOnHomePageLoginButton();
		Action.click(driver, RegisterNowLink);
		return new CreateYourProfilePage();
		
	}
}
