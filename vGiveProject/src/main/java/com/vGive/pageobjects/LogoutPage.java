package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class LogoutPage extends BaseClass {

	//Manage fundraiser login and logout flow
	
	@FindBy(xpath = "//button[@class='grey-outline_btn']")
	WebElement HomePageLoginButton;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='userPass']")
	WebElement Password;
	
	@FindBy(xpath = "//span[text()='Login']")
	WebElement ClickOnLoginButton;
	
	@FindBy(xpath = "//form[@class='d-flex headerDropDown']")
	WebElement ClickOnRegisteredUserAccount;

	@FindBy(xpath = "//a[text()='My account']")
	WebElement ClickOnMyAccount;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;
	
	// Mouse hover on support button for both create new fundraiser and Support existing fundraiser
	
	@FindBy(xpath = "//a[text()='Support']")
	WebElement SupportBtnForRFFC;
	
	//Create new fundraiser login and logout flow
	
	@FindBy(xpath = "//li//a[text()='Create new fundraiser']")
	WebElement CreateNewFundraiserOption;
	
	@FindBy(xpath = "//button[@class='grey-outline_btn']")
	WebElement CreateNewFundraiserUserButton;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement LogoutButtonForCreateFundraiser;
	
	//Support existing login and logout flow
	
	@FindBy(xpath = "//li//a[text()='Support existing fundraiser']")
	WebElement SupportExistingFundraiserOption;
	
	@FindBy(xpath = "//button[@class='grey-outline_btn']")
	WebElement  SupportExistingFundraiserUserButton;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement LogoutButtonForSupportExistingFundraiser;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	public HomePage logOutPage() throws InterruptedException {
		Action.click(driver, HomePageLoginButton);
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		//Action.fluentWait(driver, ClickOnRegisteredUserAccount, 20);
		Thread.sleep(4000);
		Action.click(driver, ClickOnRegisteredUserAccount);
		//Thread.sleep(2000);
		Action.click(driver, Logout);
		return new HomePage();
		
	}
	
	public CreateFundraiseForYourCharityPage LogOutForCreateNewFundraiser() throws InterruptedException {
		Action.mouseHoverByJavaScript(SupportBtnForRFFC);
		Action.click(driver, CreateNewFundraiserOption);
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		Thread.sleep(4000);
		Action.click(driver, CreateNewFundraiserUserButton);
		Action.click(driver, LogoutButtonForCreateFundraiser);
		return new CreateFundraiseForYourCharityPage();
	}
	
	public HelpRaiseFundsForTheCharityOfYourChoicePage LogOutForSupportExistingFundraiser() throws InterruptedException {
		Action.mouseHoverByJavaScript(SupportBtnForRFFC);
		Action.click(driver, SupportExistingFundraiserOption);
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		Thread.sleep(4000);
		Action.click(driver, SupportExistingFundraiserUserButton);
		Action.click(driver, LogoutButtonForCreateFundraiser);
		return new HelpRaiseFundsForTheCharityOfYourChoicePage();
	}
	
	
	
	
}

