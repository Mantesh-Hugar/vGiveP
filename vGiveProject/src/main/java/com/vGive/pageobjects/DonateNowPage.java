package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class DonateNowPage extends BaseClass {
	
	
	public static HomePage home;
  public static LoginPage login;

	@FindBy(xpath = "//h1[text()='Donate now ']")
	WebElement DonateNowText;

	@FindBy(xpath = "//a[text()='Donate']")
	WebElement ClickOnDonateButton;

	@FindBy(xpath = "//a[text()='Read more']")
	WebElement ReadMoreButton;

	public DonateNowPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyText() {
		return Action.isDisplayed(driver, DonateNowText);
	}

	public ThanksForInitiatingDonationPage clickOnDonateButton() throws InterruptedException {
		home = new HomePage();
		home.ClickOnDonateNowButton();
		Thread.sleep(2000);
		Action.click(driver, ClickOnDonateButton);
		login=new LoginPage();
		login.LoginForDonateNow();
		return new ThanksForInitiatingDonationPage();
	}
	
}
