package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class HelpRaiseFundsForTheCharityOfYourChoicePage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"top-funds\"]/section/div/div[1]/div/div/div/button")
	WebElement ClickOnSupportButtonForT5F;

	@FindBy(xpath = "//*[@id=\"top-funds\"]/section/div/div[1]/div/div/div/a")
	WebElement ClickOnReadMoreButtonForT5F;

	@FindBy(xpath = "//button[@class='grey-outline_btn']")
	WebElement ClickOnRegisteredUserAccount;

	@FindBy(xpath = "//a[text()='My account']")
	WebElement ClickOnMyAccount;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;

	public HelpRaiseFundsForTheCharityOfYourChoicePage() {
		PageFactory.initElements(driver, this);
	}

	public PersonalizeTheFundraiserPage clickOnSupportButton() {

		LoginPage login = new LoginPage();
		login.LoginForSupportExistingFundraiser();

		Action.click(driver, ClickOnSupportButtonForT5F);
		return new PersonalizeTheFundraiserPage();
	}
}
