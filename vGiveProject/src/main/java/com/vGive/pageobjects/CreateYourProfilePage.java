package com.vGive.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class CreateYourProfilePage extends BaseClass {

	public static RegisterNowLinkPage clickOnRgisterNowBtn;

	@FindBy(xpath = "//button[@class='form-control ']")
	WebElement ProfileType;
	
	@FindBy(xpath = "//li[@class='drop-down-Iicon']")
	List<WebElement> AllProfileTypes;

	@FindBy(xpath = "//a[@value='charity']")
	WebElement ProfileTypeCharity;

	@FindBy(xpath = "//a[text()='Donor']")
	WebElement ProfileTypeDonor;

	@FindBy(xpath = "//button[text()='Yes, proceed']")
	WebElement CharityProfileProceed;

	@FindBy(xpath = "//button[text()='Change']")
	WebElement CharityProfileChange;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='floatingInput1']")
	WebElement LastName;

	@FindBy(xpath = "//input[@name='phone_number']")
	WebElement PhoneNumbertextbox;

	@FindBy(xpath = "//input[@id='floatingEmail']")
	WebElement EmailIdTextbox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement PasswordTextbox;

	@FindBy(xpath = "//button[@class='toggle-eye-btn']//img")
	WebElement EyeLogo;

	@FindBy(xpath = "//input[@id='floatingPassword']")
	WebElement ConfirmPassword;

	@FindBy(xpath = "//button[text()='Preferred method of contact']")
	WebElement PreferredMethodofContact;

	@FindBy(xpath = "//li//a[text()='Email']")
	WebElement SelectEmail;

	@FindBy(xpath = "//li//a[text()='Call']")
	WebElement SelectCall;

	@FindBy(xpath = "//li//a[text()='Text']")
	WebElement SelectText;

	@FindBy(xpath = "//input[@id='floatingInput3']")
	WebElement AddressTextbox;

	@FindBy(xpath = "//span[@title='Sample Tooltip']")
	WebElement LocationLogo;

	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/form/div/div[1]/section/div/div/div[10]/div/div/div")
	WebElement SelectCountry;

	@FindBy(xpath = "//label[text()=' Select state']")
	WebElement SelectState;

	@FindBy(xpath = "//input[@name='pincode']")
	WebElement PostalCode;

	@FindBy(xpath = "//a[text()='Select avatar']")
	WebElement ClickonSelectAvatarBtn;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]")
	WebElement img3avatar;

	@FindBy(xpath = "//a[text()='Save']")
	WebElement ClickOnSaveBtn;

	@FindBy(xpath = "//div[@class='col-lg-6 col-12']//a//a")
	WebElement uploadImg;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement ClickOnNextBtn;

	public CreateYourProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public OnboardYourCharityPage RegisterNowLink() throws Exception {

		clickOnRgisterNowBtn = new RegisterNowLinkPage();
		clickOnRgisterNowBtn.RegisterNowLinkFromC();

		Action.click(driver, ProfileType);
		
		Action.Dropdown(AllProfileTypes, "Charity");
		
		//Action.click(driver, ProfileTypeCharity);
		
        Action.explicitWait(driver, CharityProfileProceed, 20);
		
		Action.click(driver, CharityProfileProceed);
		
		Action.click(driver, FirstName);
		Action.type(FirstName, prop.getProperty("FirstName"));

		Action.click(driver, LastName);
		Action.type(LastName, prop.getProperty("LastName"));

		Action.type(PhoneNumbertextbox, prop.getProperty("PhoneNumber"));

		Action.type(EmailIdTextbox, prop.getProperty("EmailId"));

		Action.type(PasswordTextbox, prop.getProperty("Password"));

		Action.type(ConfirmPassword, prop.getProperty("ConfirmPassword"));

		Action.click(driver, PreferredMethodofContact);

		Action.click(driver, SelectCall);

		Action.type(AddressTextbox, prop.getProperty("Address"));

		Action.click(driver, SelectCountry);

		Action.type(SelectCountry, prop.getProperty("Country"));

		Action.type(SelectState, prop.getProperty("State"));

		Action.type(PostalCode, prop.getProperty("PostalCode"));

		// Upload Image

//		WebElement chooseFile = driver.findElement(By.xpath("//div[@class='col-lg-6 col-12']//a//a"));
//		chooseFile.sendKeys(
//				"C:\\Users\\ManteshHugar\\eclipse-workspace\\vGiveProject\\Images\\SamplePNGImage_100kbmb.png/");

		// Select Avatar flow

		Action.click(driver, ClickonSelectAvatarBtn);
		Action.JSClick(driver, img3avatar);
		Thread.sleep(2000);
		Action.click(driver, ClickOnSaveBtn);
		Thread.sleep(2000);
		Action.click(driver, ClickOnNextBtn);
		return new OnboardYourCharityPage();

	}

}
