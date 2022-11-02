package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class PreviewOfFundraiserPage extends BaseClass {
	 PersonalizeTheFundraiserPage personalize;
	
	@FindBy(xpath = "//a[text()='Edit page']")
	WebElement EditPageButton;
	
	@FindBy(xpath = "//*[@id=\"selectCheckbox\"]")
	WebElement SelectCheckbox;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextButton;
	
	@FindBy(xpath = "//a[text()='Publish page']")
	WebElement PublishPageButton;
	
	public PreviewOfFundraiserPage () {
		PageFactory.initElements(driver, this);
	}
	
	public void PubblishPageButton() {
		 personalize=new PersonalizeTheFundraiserPage(); 
		 Action.click(driver, SelectCheckbox);
	}
}
