package com.urbanladder.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardSPageLocators {

	//Gift Card Lable Link
	@FindBy(xpath="(//a[@class='featuredLinksBar__link'])[3]") public WebElement giftCards_Label;
	//Birthday/ Anniversary Link
	@FindBy(xpath="(//li[@class='_11b4v'])[3]") public WebElement Birthday_AnniversaryGift;
	
	//Inputs
	//Amount InputBox 
	@FindBy(xpath="//*[@id='ip_2251506436']") public WebElement Amount_Input;
	//Month DropDown
	@FindBy(xpath="//select[1]") public WebElement month_DropDown;
	//Date DropDown
	@FindBy(xpath="//select[2]") public WebElement date_DropDown;
	//Next Buttton
	@FindBy(xpath="//button[normalize-space()='Next']") public WebElement next_button;
	
	
	//Inputs
	//To
	//Recipient Name
	@FindBy(xpath="//input[@id='ip_4036288348']") public WebElement recipientsName_Input;
	//Recipient Email
	@FindBy(xpath="//input[@id='ip_137656023']") public WebElement recipientsEmail_Input;
	//Recipient Mobile
	@FindBy(xpath="//input[@id='ip_3177473671']") public WebElement recipientsMobile_Input;
	
	//From
	//Your Name
	@FindBy(xpath="//input[@id='ip_1082986083']") public WebElement yourName_Input;
	
	@FindBy(xpath="//input[@id='ip_4081352456']") public WebElement yourEmail_Input;
	//Your Mobile 
	@FindBy(xpath="//input[@id='ip_2121573464']") public  WebElement yourMobile_Input;
	//Your Address
	@FindBy(xpath="//input[@id='ip_2194351474']") public WebElement Address_Input;
	//pincode 
	@FindBy(xpath="//input[@id='ip_567727260']") public WebElement pincode_Input;
	//Message Input
	@FindBy(xpath="//textarea[@id='ip_582840596']") public WebElement Message_Input;
    //Submit Buttton
	@FindBy(xpath="//*[@type='submit']") public WebElement Confirm_button;


	//Ouput
	//Amount OutPut 
	@FindBy(xpath="//div[@class='BCLqs']") public WebElement Amount_Output;
	//Date Output
	@FindBy(xpath="//*[@class='_14QEd _1QpDs']//section//span[1]") public WebElement Date_Output;
	//Recipient Name Ouput
	@FindBy(xpath="//*[@class='dL47V'][1]/div[1]") public WebElement recipientsName_Output;
	//Recipient Email Output
	@FindBy(xpath="//*[@class='dL47V'][1]/div[2]") public WebElement recipientsEmail_Output;
	//Recipient Mobile Output
	@FindBy(xpath="//*[@class='dL47V'][1]/div[3]") public WebElement recipientsMobile_Output;
	
	//Your Name Output
	@FindBy(xpath="(//*[@class='dL47V'])[2]/div[1]") public WebElement yourName_Output;
	//Your Email Output
	@FindBy(xpath="(//*[@class='dL47V'])[2]/div[2]") public WebElement yourEmail_Output;
	//Your Mobile Output
	@FindBy(xpath="(//*[@class='dL47V'])[2]/div[3]") public WebElement yourMobile_Output;
	//Address Output
	@FindBy(xpath="(//*[@class='dL47V'])[2]/div[4]") public WebElement Address_Output;
	//Pincode Output
	@FindBy(xpath="(//*[@class='dL47V'])[2]/div[5]") public WebElement pincode_Output;
	//Message OutPut
	@FindBy(xpath="(//*[@class='dL47V'])[3]") public WebElement Message_outPut;


}
