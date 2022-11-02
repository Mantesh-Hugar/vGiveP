package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class LoginPage extends BaseClass{
	public static HomePage homePage;
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='userPass']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='toggle-eye-btn']")
	WebElement ToggleEyeBtn;
	
	@FindBy(xpath = "//span[text()='Login']")
	WebElement ClickOnLoginButton;
	
	@FindBy(xpath = "//a[text()='Forgot password']")
	WebElement ForgotPasswordLink;
	
	@FindBy(xpath = "//a[text()='Register now']")
	WebElement RegisterNowLink;
	
	@FindBy(xpath = "//button[@class='gcls']")
	WebElement GoogleLogoLink;
	
	@FindBy(xpath = "//button[@class='kep-login-facebook metro']")
	WebElement FbLogoLink;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public CreateFundraiseForYourCharityPage LoginForCreateNewFundraiser() {
		homePage=new HomePage();
		homePage.MouseHoverAndClickonCreateNewFundraiser();
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		return new CreateFundraiseForYourCharityPage();
	}
	
	public HelpRaiseFundsForTheCharityOfYourChoicePage LoginForSupportExistingFundraiser() {
		homePage=new HomePage();
		homePage.MouseHoverAndClickonSupportExistingFundraiser();
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		return new HelpRaiseFundsForTheCharityOfYourChoicePage();
	}
	
	public ManageFundraiserPage LoginForMyAccount() {
		homePage=new HomePage();
		homePage.ClickOnHomePageLoginButton();
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		return new ManageFundraiserPage();
	}
	
	public DonateNowPage LoginForDonateNow() {
		Action.type(EmailId, prop.getProperty("username"));
		Action.type(Password, prop.getProperty("password"));
		Action.click(driver, ClickOnLoginButton);
		return new DonateNowPage();
	}
	
}
