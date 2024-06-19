package com.urbanladder.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.urbanladder.locators.GiftCardSPageLocators;
import com.urbanladder.utils.BaseClass;

public class GiftCardSPageAction {
	GiftCardSPageLocators giftcardspageLocators_Obj = null;
	Select monthDate;
	
	//Constructor
	public GiftCardSPageAction() {
		this.giftcardspageLocators_Obj=new GiftCardSPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), giftcardspageLocators_Obj);
	}
	//Check for GiftCard Label Link
	public boolean CheckGiftCardLabel() {
		return giftcardspageLocators_Obj.giftCards_Label.isDisplayed();
	}
	//Click on GiftCard Link 
	public void ClickOngiftCard() {
		giftcardspageLocators_Obj.giftCards_Label.click();
	}
	//Check  "Birthday/Anniversary"
	public boolean CheckForBirthdaORAnniversary() {
		return giftcardspageLocators_Obj.Birthday_AnniversaryGift.isDisplayed();
	}
	//choose "Birthday/Anniversary"
	public void ClickOnBirthdaORAnniversary(){
		giftcardspageLocators_Obj.Birthday_AnniversaryGift.click();
	}
	//Check for Price Input
	public boolean CheckAmountInnputBox() {
		return giftcardspageLocators_Obj.Amount_Input.isDisplayed();
	}
	//Enter the Amount in Input Box
	public void EnterAmount(String Amount){
		giftcardspageLocators_Obj.Amount_Input.sendKeys(Amount);
	}
	//Check For Date and Month DropDown
	public boolean CheckForDateandMonth() {
		return (giftcardspageLocators_Obj.month_DropDown.isDisplayed() && giftcardspageLocators_Obj.date_DropDown.isDisplayed());
	}
	//Select Date and Month on Drop Down 
	public void SelectMonthandDate(){
		monthDate = new Select(giftcardspageLocators_Obj.month_DropDown);
		monthDate.selectByIndex(1);
		monthDate = new Select(giftcardspageLocators_Obj.date_DropDown);
		monthDate.selectByIndex(1);
	}
	//Check For next Button 
	public boolean CheckForNextButtton() {
		return giftcardspageLocators_Obj.next_button.isDisplayed();
	}
	//Click on Next Button
	public void ClickOnNextButton(){
		giftcardspageLocators_Obj.next_button.click();
	}
	//To 
	//Check For Recipient's Name 
	public boolean CheckForRecipientName() {
		return giftcardspageLocators_Obj.recipientsName_Input.isDisplayed();
	}
	//Enter the Recipient's Name 
	public void EnterRecipientName(String name) {
		giftcardspageLocators_Obj.recipientsName_Input.sendKeys(name);
	}
	//Check For Recipient's Email
	public boolean CheckForRecipientEmail(){
		return giftcardspageLocators_Obj.recipientsEmail_Input.isDisplayed();
	}
	//Enter the Recipient's Email
	public void EnterRecipientEmail(String Email) {
		giftcardspageLocators_Obj.recipientsEmail_Input.sendKeys(Email);
	}
	//Check For Recipient's Mobile
	public boolean CheckForRecipientMobile() {
		return giftcardspageLocators_Obj.recipientsMobile_Input.isDisplayed();
	}
	//Enter the Recipient's Mobile 
	public void EnterRecipientMobile(String mobile) {
		giftcardspageLocators_Obj.recipientsMobile_Input.sendKeys(mobile);
	}

	//From
	//1)Check for Your Name
	public boolean CheckForYourName() {
		return giftcardspageLocators_Obj.yourName_Input.isDisplayed();
	}
	//Enter Your Name 
	public void EnterYourName(String name) {
		giftcardspageLocators_Obj.yourName_Input.sendKeys(name);
	}
	//2)Check for Your Email
	public boolean CheckForYourEmail(){
		return giftcardspageLocators_Obj.yourEmail_Input.isDisplayed();
	}
	//Enter Your Email
	public void EnterYourEmail(String Email) {
		giftcardspageLocators_Obj.yourEmail_Input.sendKeys(Email);
	}
	//3)Check for Your Mobile
	public boolean CheckForYourMobile() {
		return giftcardspageLocators_Obj.yourEmail_Input.isDisplayed();
	}
	//Enter Your Mobile 
	public void EnterYourMobile(String mobile) {
		giftcardspageLocators_Obj.yourMobile_Input.sendKeys(mobile);
	}
	//4)Check for Your Address
	public boolean CheckForYourAddress() {
		return giftcardspageLocators_Obj.Address_Input.isDisplayed();
	}
	//Enter Your Address
	public void EnterYourAddress(String address) {
		giftcardspageLocators_Obj.Address_Input.sendKeys(address);
	}
	//5)Check for Your pincode
	public boolean CheckForYourPincode() {
		return giftcardspageLocators_Obj.pincode_Input.isDisplayed();
	}
	//Enter Your Pincode 
	public void EnterYourPincode(String pincode) {
		giftcardspageLocators_Obj.pincode_Input.sendKeys(pincode);
	}
	//Check for Messge Input box 
	public boolean CheckForMsgBox() {
		return giftcardspageLocators_Obj.Message_Input.isDisplayed();
	}
	//Enter Message 
	public void EnterMsg(String msg) {
		giftcardspageLocators_Obj.Message_Input.sendKeys(msg);
	}
	//Check For Confirm Button
	public boolean CheckForConfirm() {
		return giftcardspageLocators_Obj.Confirm_button.isDisplayed();
	}
	//Click On Confirm Button
	public void ClickOnConfirm() {
		BaseClass.getHandler().scrollToElement(giftcardspageLocators_Obj.Confirm_button);
		BaseClass.sleep(2000);
		giftcardspageLocators_Obj.Confirm_button.click();
		BaseClass.sleep(2000);
	}
}
