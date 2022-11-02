package com.vGive.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vGive.base.BaseClass;

public class CongratulationsPage extends BaseClass{

	PreviewOfYourFundraiserPage previewFunds;
	@FindBy(xpath = "//h1[text()='Congratulations!!!']")
	WebElement CongratulationPage;
	
	public CongratulationsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void congratulationsPage() throws Exception {
		
		previewFunds=new PreviewOfYourFundraiserPage ();
			
		
	}
}
