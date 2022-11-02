package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class PersonalizeTheFundraiserPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]/section/div/form/div[1]/input")
	WebElement TitleTextbox;

	@FindBy(xpath = "//*[@id=\"exampleFormControlTextarea1\"]")
	WebElement DescriptionTextbox;

	@FindBy(xpath = "//*[@id=\"floatingInput\"]")
	WebElement SetGoalAmountTextbox;

	@FindBy(xpath = "//*[@id=\"selectCheckbox\"]")
	WebElement SelectCheckbox;

	@FindBy(xpath = "//input[@placeholder='Select end date']")
	WebElement SelectEndDateTextbox;

	@FindBy(xpath = "//div[@class=' mb-3 mt-3 fundraiseCharity_1_input_date']/button/img")
	WebElement CalendarLogo;
	
	@FindBy(xpath = "//input[@min='2022-07-22']")
	WebElement date;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]/section/div/div/div/div/div/a")
	WebElement ReadMoreButton;
	
	@FindBy(xpath = "//div[@class=' mb-3 mt-3 fundraiseCharity_1_input_date']")
	WebElement AblogoC;

	public PersonalizeTheFundraiserPage() {
		PageFactory.initElements(driver, this);
	}

	public PersonalizeTheFundraiserPage clickOnSupportButton() throws Exception{

		HelpRaiseFundsForTheCharityOfYourChoicePage Helpraise=new HelpRaiseFundsForTheCharityOfYourChoicePage();
		Helpraise.clickOnSupportButton();
		
		
		Action.type(TitleTextbox, prop.getProperty("Title"));
		Action.type(DescriptionTextbox, prop.getProperty("Description"));
		Action.type(SetGoalAmountTextbox, prop.getProperty("GoalAmount"));
		Action.click(driver, SelectCheckbox);
		Action.explicitWait(driver, CalendarLogo, 20);
		Action.JSClick(driver,  CalendarLogo);
		//Action.click(driver, SelectEndDateTextbox);
		Action.explicitWait(driver, NextButton, 20);
		Action.click(driver, NextButton);
		return new PersonalizeTheFundraiserPage();
	}

}
