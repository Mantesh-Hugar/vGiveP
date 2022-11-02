package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class HomePage extends BaseClass {

	
	@FindBy(xpath = "//a//img[@alt='vgive logo']")
	WebElement vGiveLogo;
	
	@FindBy(xpath = "//a[text()='Donate now']")
	WebElement DonateNowBtn;
	
	@FindBy(xpath = "//a[text()='Volunteer now']")
	WebElement VolunteerNowBtn;
	
	@FindBy(xpath = "//button[@class='grey-outline_btn']")
	WebElement HomePageLoginButton;
	
	@FindBy(xpath = "//a[text()='Support']")
	WebElement SupportBtnForRFFC;
	
	@FindBy(xpath = "//li//a[text()='Create new fundraiser']")
	WebElement CreateNewFundraiserOption;
	
	@FindBy(xpath = "//li//a[text()='Support existing fundraiser']")
	WebElement SupportExistingFundraiserOption;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(driver, vGiveLogo);
	}
	
	public  String  getvGiveTitle() {
		String vGiveTitle = driver.getTitle();
		return vGiveTitle;
	}
	public LoginPage MouseHoverAndClickonCreateNewFundraiser() {
		Action.mouseHoverByJavaScript(SupportBtnForRFFC);
		Action.click(driver, CreateNewFundraiserOption);
		return new LoginPage();
	}
	
	public LoginPage MouseHoverAndClickonSupportExistingFundraiser() {
		Action.mouseHoverByJavaScript(SupportBtnForRFFC);
		Action.click(driver, SupportExistingFundraiserOption);
		return new LoginPage();
	}
	
	public LoginPage ClickOnHomePageLoginButton() {
		Action.click(driver, HomePageLoginButton);
		return new LoginPage();
	}
	
	public DonateNowPage ClickOnDonateNowButton() {
		Action.click(driver, DonateNowBtn);
		return new DonateNowPage();
	}
}
