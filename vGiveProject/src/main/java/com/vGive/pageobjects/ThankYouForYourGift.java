package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class ThankYouForYourGift extends BaseClass {
	
public static ThanksForInitiatingDonationPage thanks;


	@FindBy(xpath = "//h1[text()='Thank you for your gift!']")
	WebElement titleOfPage;
	
	@FindBy(xpath = "//input[@id='floatingInput1']")
	WebElement EmailIdTextBox;
	
	@FindBy(xpath = "//button[text()='Invite now']")
	WebElement InviteNowButton;
	
	
	public ThankYouForYourGift() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEmailId() throws InterruptedException {
		
		thanks=new ThanksForInitiatingDonationPage();
		thanks.thanksForInitiating();
		Action.isDisplayed(driver, titleOfPage);
		Action.type(EmailIdTextBox, prop.getProperty("Amount"));
		Action.click(driver, InviteNowButton);
		
	}
}
