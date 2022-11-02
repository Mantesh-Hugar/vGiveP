package com.vGive.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;

public class OnboardYourCharityPage extends CreateYourProfilePage {

	@FindBy(xpath = "//div[@class='MuiAutocomplete-root MuiAutocomplete-hasPopupIcon css-1l6di18']")
	WebElement ClickOnSelectCountryBtn;

	@FindBy(xpath = "//input[@name='charity_name']")
	WebElement ClickOnCharityNameTextBox;

	@FindBy(xpath = "//button[text()='Are you owner of the charity']")
	WebElement ClickOnARUOWOTC;

	@FindBy(xpath = "//div[@class='form-floating custom-select']//li//a[text()='Yes']")
	WebElement ClickOnARUOWOTCSelectYes;

	@FindBy(xpath = "//div[@class='form-floating custom-select']//li//a[text()='No']")
	WebElement ClickOnARUOWOTCSelectNo;

	@FindBy(xpath = "//input[@name='pan_card_number']")
	WebElement PanCardNumberTextBox;

	@FindBy(xpath = "//button[@id='darpanDropdown']")
	WebElement DARAPANIDTextbox;

	@FindBy(xpath = "//div[@class='form-floating custom-select']//a[text()='Yes']")
	WebElement DARAPANIDYes;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/form/div/div[1]/div/div[7]/ul/li[2]/a")
	WebElement DARAPANIDNo;

	@FindBy(xpath = "//input[@id='FileUpload1']")
	WebElement UploadSection12A;

	@FindBy(xpath = "//div[@class=' onbordcharity_2_div2_upload_div ms-4 mb-3']")
	WebElement UploadRegistrationCertificate;

	@FindBy(xpath = "//button[text()='Register']")
	WebElement RegisterBtn;

	public OnboardYourCharityPage() {
		PageFactory.initElements(driver, this);
	}

	public CreateFundraiseForYourCharityPage OnBoardYourCharityPage() throws Exception {
		CreateYourProfilePage crete = new CreateYourProfilePage();
		crete.RegisterNowLink();
		
	//	Action.click(driver, ClickOnSelectCountryBtn);
		
		Thread.sleep(4000);
		
		Action.click(driver, ClickOnCharityNameTextBox);
		Action.type(ClickOnCharityNameTextBox, prop.getProperty("CharityName"));
		Action.click(driver, ClickOnARUOWOTC);
		Action.click(driver, ClickOnARUOWOTCSelectYes);
		Action.type(PanCardNumberTextBox, prop.getProperty("PanCardNumber"));
		Action.click(driver, DARAPANIDTextbox);
		Action.click(driver, DARAPANIDNo);
		//Action.click(driver, UploadSection12A);
		
		WebElement chooseFile1 = driver.findElement(By.xpath("//input[@id='FileUpload1']"));
		chooseFile1.sendKeys("C:\\Users\\ManteshHugar\\eclipse-workspace\\vGiveProject\\DocumentsForUpload\\New10.txt");
		
		
		
		WebElement chooseFile2 = driver.findElement(By.xpath("//input[@id='FileUpload2']"));
		chooseFile2.sendKeys("C:\\Users\\ManteshHugar\\eclipse-workspace\\vGiveProject\\DocumentsForUpload\\New10.txt");
		
		Action.click(driver, RegisterBtn);
		return new RequestSuccessfullySubmittedPage();

	}
}
