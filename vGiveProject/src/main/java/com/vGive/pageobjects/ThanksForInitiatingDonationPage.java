package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class ThanksForInitiatingDonationPage extends BaseClass {
	public static DonateNowPage donateNow;
	@FindBy(xpath = "//h1[text()=', Thanks for initiating donation']")
	WebElement ThanksPageText;
	
	@FindBy(xpath = "//a[text()='Go back to fund raiser']")
	WebElement BackArrow;
	
	@FindBy(xpath = "//a[text()='Read more']")
	WebElement ReadMore;
	
	@FindBy(xpath = "//input[@name='amount']")
	WebElement AmountTextBox;
	
	@FindBy(xpath = "//input[@name='chooseCb']")
	WebElement SelectCheckbox;
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement ClickOnContinueButton;
	
	public ThanksForInitiatingDonationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ThankYouForYourGift thanksForInitiating() throws InterruptedException {
		
		donateNow=new DonateNowPage();
		donateNow.clickOnDonateButton();
		
		Action.isDisplayed(driver, ThanksPageText);
		
		Action.type(AmountTextBox, prop.getProperty("Amount"));
		
		Action.click(driver, SelectCheckbox);
		
		Action.click(driver, ClickOnContinueButton);
		
		return new ThankYouForYourGift();
	}
}
