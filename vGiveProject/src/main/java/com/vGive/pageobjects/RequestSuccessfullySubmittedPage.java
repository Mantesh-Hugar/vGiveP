package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;

public class RequestSuccessfullySubmittedPage extends CreateFundraiseForYourCharityPage {

	OnboardYourCharityPage onBoardPage;
	
	@FindBy(xpath = "//button[text()='Create fundraiser']")
	WebElement clickOnCreateFundraiserButton;
	
	@FindBy(xpath = "//h1[text()='Request succesfully submitted']")
	WebElement RequestSuccesfullySubmittedText;
	
	public RequestSuccessfullySubmittedPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle() {
		String text = driver.getTitle();
		System.out.println(text);
	}
	
	
	public CreaNewFundraiserPage RequestSuccessfullyPage() throws Exception {
		onBoardPage = new OnboardYourCharityPage();
		onBoardPage.OnBoardYourCharityPage();
		Action.click(driver, clickOnCreateFundraiserButton);
		return new CreaNewFundraiserPage();
	
	}
	
	
}
