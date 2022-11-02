package com.vGive.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class CreateFundraiseForYourCharityPage extends BaseClass {

	@FindBy(xpath = "//button[@id='defaultDropdownContact']")
	WebElement ChooseACauseButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/form/div/div[1]/div/div[1]/ul/li[5]/a")
	WebElement MedicalOption;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/form/div/div[1]/div/div[2]/input")
	WebElement AddFundraiserTitle;

	@FindBy(xpath = "//*[@id=\"exampleFormControlTextarea1\"]")
	WebElement AddFundraiserdescription;

	@FindBy(xpath = "//button[text()='What do you plan to raise?']")
	WebElement SelectFundraiser;

	@FindBy(xpath = "//a[text()='Funds']")
	WebElement SelectFunds;

	@FindBy(xpath = "//*[@id=\"fundraiseCharity_1_select_3_div_row_goal_amount\"]")
	WebElement GoalAmount;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/form/div/div[1]/div/div[7]/div/select")
	WebElement CountryCodeSelection;

	@FindBy(xpath = " //div[@class=' mb-3 fundraiseCharity_1_input_date']/button/img")
	WebElement CalendarLogo;

	@FindBy(xpath = "//input[@min='2022-07-25']")
	WebElement CalendarEndDate;

	@FindBy(xpath = "//input[@id='FileUpload1']")
	WebElement FileUpload;

	@FindBy(xpath = "//button[text()='Preview']")
	WebElement PreviewButton;

	public CreateFundraiseForYourCharityPage() {
		PageFactory.initElements(driver, this);
	}

	public PreviewOfYourFundraiserPage LoginForCreateNewFundraiser() throws Exception {

		LoginPage login = new LoginPage();

		login.LoginForCreateNewFundraiser();

		Thread.sleep(3000);
		Action.click(driver, ChooseACauseButton);
		Thread.sleep(3000);
		Action.click(driver, MedicalOption);
		Thread.sleep(1000);
		Action.click(driver, AddFundraiserTitle);
		 Thread.sleep(1000);
		Action.type(AddFundraiserTitle, prop.getProperty("Title"));
		Thread.sleep(1000);
		Action.type(AddFundraiserdescription, prop.getProperty("Description"));
		Thread.sleep(1000);
		Action.click(driver, SelectFundraiser);
		Thread.sleep(1000);
		Action.click(driver, SelectFunds);
		 Thread.sleep(1000);
		Action.type(GoalAmount, prop.getProperty("GoalAmount"));
		Thread.sleep(1000);
		Action.click(driver,  CalendarLogo);
		// Action.click(driver,FileUpload);
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='FileUpload1']"));
		chooseFile.sendKeys(
				"C:\\Users\\ManteshHugar\\eclipse-workspace\\vGive_Project\\Images\\SamplePNGImage_100kbmb.png");
		Action.click(driver, PreviewButton);
		return new PreviewOfYourFundraiserPage();
	}
}
