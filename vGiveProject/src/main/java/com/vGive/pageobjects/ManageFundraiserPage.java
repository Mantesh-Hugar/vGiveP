package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class ManageFundraiserPage extends BaseClass {

	public static LoginPage loginPage;
	
	@FindBy(xpath = "//form[@class='d-flex headerDropDown']")
	WebElement ClickOnRegisteredUserAccount;

	@FindBy(xpath = "//a[text()='My account']")
	WebElement ClickOnMyAccount;
	
	@FindBy(xpath = "//a[text()='My account']")
	WebElement ClickOnMyAccountForCreateFundraiser;
	
	@FindBy(xpath = "//a[text()='My account']")
	WebElement ClickOnMyAccountForSupportExistingFundraiser;
	
	public ManageFundraiserPage() {
		PageFactory.initElements(driver, this);
	}
	

	public ManageFundraiserPage myAccount() throws InterruptedException {
		loginPage.LoginForMyAccount();
		//Action.fluentWait(driver, ClickOnRegisteredUserAccount, 20);
		//Thread.sleep(4000);
		Action.click(driver, ClickOnRegisteredUserAccount);
		//Thread.sleep(2000);
		Action.click(driver, ClickOnMyAccount);
		return new ManageFundraiserPage();
		
	}
	
	public ManageFundraiserPage myAccount1() throws InterruptedException {
		
		loginPage.LoginForCreateNewFundraiser();
		Action.click(driver, ClickOnRegisteredUserAccount);
		Action.click(driver, ClickOnMyAccountForCreateFundraiser);
		return new ManageFundraiserPage();
	}
	
	public ManageFundraiserPage myAccount2() throws InterruptedException {
		loginPage.LoginForSupportExistingFundraiser();
		Action.click(driver, ClickOnRegisteredUserAccount);
		Action.click(driver, ClickOnMyAccountForSupportExistingFundraiser);
		return new ManageFundraiserPage();
	}
}
