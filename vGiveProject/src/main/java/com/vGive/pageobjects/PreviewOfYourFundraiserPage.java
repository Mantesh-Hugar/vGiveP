package com.vGive.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vGive.actiondriver.Action;
import com.vGive.base.BaseClass;

public class PreviewOfYourFundraiserPage extends BaseClass {
	
	CreateFundraiseForYourCharityPage createfunds;
	
	@FindBy(xpath = "//div[@class='form-floating custom-select NewFundraiserPre_1_dropdown_div ']")
	WebElement ClickOnDropdownTextBox;
	
	@FindBy(xpath = "//a[text()='Default']")
	WebElement SelectDDOptions;
	
	@FindBy(xpath = "//button[@class='  NewFundraiserPre_2_button1']")
	WebElement SaveASDraftButton;
	
	@FindBy(xpath = "//button[@class=' NewFundraiserPre_2_button_publish1']")
	WebElement PublishButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/div[2]/div[1]/div/h6[1]")
	WebElement ClickToEditTitleAndDescription;
	
	@FindBy(xpath = "//div[@class='createFund_PreModal_body_2 mb-3 form-floating']")
	WebElement ModifyWnDTitleBtn;
	
	@FindBy(xpath = "//div[@class='createFund_PreModal_body_3 mb-4']")
	WebElement ModifyWnDSubtextBtn;
	
	@FindBy(xpath = "//div[@class='createFund_PreModal_body_4']/button[text()='Modify']")
	WebElement ModifyWnModifyButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/div[6]/div/img")
	WebElement ModifyWnDCrossBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/div[2]/div[1]/div/h6[2]")
	WebElement ClickToEditTimeleftAndGoalAmountBtn;
	
	@FindBy(xpath = "//div[@class=' mb-3 createFund_PreModal1_body_1_inputdate']/input")
	WebElement ClickOnEndDateTextbox;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/section[2]/div[8]/form/div[2]/input")
	WebElement ClickOnSetGoalAmount;
	
	@FindBy(xpath = "//div[@class='createFund_PreModal_body_4']/button[text()='Modify']")
	WebElement ModifyWnModifyButton1;
	
	public PreviewOfYourFundraiserPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CongratulationsPage PreviewFundraiserFlow() throws Exception {
		
		createfunds=new CreateFundraiseForYourCharityPage();
		Action.click(driver, PublishButton);
		return new CongratulationsPage();
	}
	
}
