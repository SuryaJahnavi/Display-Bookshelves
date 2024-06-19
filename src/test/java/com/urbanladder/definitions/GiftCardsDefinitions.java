package com.urbanladder.definitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.urbanladder.actions.GiftCardSPageAction;
import com.urbanladder.locators.GiftCardSPageLocators;
import com.urbanladder.utils.ExcelUtils;
import com.urbanladder.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardsDefinitions {
	WebDriver driver = BaseClass.getDriver();
	//Excel Path 
	String filePath = System.getProperty("user.dir")+"\\testData\\data.xlsx";

	String Amount,Name,Email,Phone,F_Name,F_Phone,F_Email,Address,Pincode;


	GiftCardSPageAction  giftcardspageaction_Obj = new GiftCardSPageAction();


	GiftCardSPageLocators giftcardspageLocators_Obj = null;
	//Constructor
	public GiftCardsDefinitions() {
		this.giftcardspageLocators_Obj=new GiftCardSPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), giftcardspageLocators_Obj);
	}

	@Given("Click on GiftCards Label")
	public void click_on_gift_cards_label() {
		giftcardspageaction_Obj.ClickOngiftCard();
	}

	@Given("Select Birthday\\/Anniversary Option")
	public void select_birthday_anniversary_option() {
		giftcardspageaction_Obj.ClickOnBirthdaORAnniversary();
	}

	@Given("Enter Amount {string} and Select Date and Month")
	public void enter_amount_and_select_date_and_month(String amount) {
		int amountrow = Integer.parseInt(amount);
		try {

			Amount = ExcelUtils.getCellData(filePath, "UrbanLadder",amountrow , 0);
			giftcardspageaction_Obj.EnterAmount(Amount);
			giftcardspageaction_Obj.SelectMonthandDate();
			giftcardspageaction_Obj.ClickOnNextButton();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Given("Fill To {string}, {string}, {string} details")
	public void fill_to_details(String name, String email, String phone) {
		int namerow = Integer.parseInt(name);
		int emailrow= Integer.parseInt(email);
		int phonerow= Integer.parseInt(phone);

		try {
			Name = ExcelUtils.getCellData(filePath, "UrbanLadder",namerow , 1);
			giftcardspageaction_Obj.EnterRecipientName(Name);
			Email = ExcelUtils.getCellData(filePath, "UrbanLadder",emailrow , 2);
			giftcardspageaction_Obj.EnterRecipientEmail(Email);
			Phone = ExcelUtils.getCellData(filePath, "UrbanLadder",phonerow , 3);
			giftcardspageaction_Obj.EnterRecipientMobile(Phone);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@When("Fill From  {string}, {string}, {string}, {string}, {string} details")
	public void fill_from_details(String name, String email, String phone, String address, String pinocode) {

		int namerow = Integer.parseInt(name);
		int emailrow= Integer.parseInt(email);
		int phonerow= Integer.parseInt(phone);
		int addressrow= Integer.parseInt(phone);
		int pincoderow= Integer.parseInt(phone);

		try {
			F_Name = ExcelUtils.getCellData(filePath, "UrbanLadder",namerow , 4);
			giftcardspageaction_Obj.EnterYourName(F_Name);
			F_Email = ExcelUtils.getCellData(filePath, "UrbanLadder",emailrow , 5);
			giftcardspageaction_Obj.EnterYourEmail(F_Email);
			F_Phone = ExcelUtils.getCellData(filePath, "UrbanLadder",phonerow , 6);
			giftcardspageaction_Obj.EnterYourMobile(F_Phone);
			Address = ExcelUtils.getCellData(filePath, "UrbanLadder",addressrow , 7);
			giftcardspageaction_Obj.EnterYourAddress(Address);
			Pincode = ExcelUtils.getCellData(filePath, "UrbanLadder",pincoderow , 8);
			giftcardspageaction_Obj.EnterYourPincode(Pincode);
			giftcardspageaction_Obj.ClickOnConfirm();
			BaseClass.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Validate the Displayed Details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void validate_the_displayed_details(String amount, String toName, String toEmail, String toPhone, String yourName, String yourEmail, String yourPhone, String address, String pincode, String message) {

		System.err.println("\nStatus: "+message);
		if(message.equalsIgnoreCase("Invalid"))
		{
			try {
				String text = giftcardspageLocators_Obj.yourEmail_Input.getAttribute("validationMessage");
				System.out.println(text+"\n");
				ExcelUtils.setCellData(filePath, "UrbanLadder",1,11,"Failed");					
				ExcelUtils.fillRedColor(filePath, "UrbanLadder",1,11);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}else if(message.equalsIgnoreCase("Valid")){
			System.out.println("*************Validation Started*************\n");
			if(giftcardspageLocators_Obj.Amount_Output.getText().replace(",", "").contains(Amount)) {
				System.out.println("'Amount' Verification-> Succesful");
			}else {
				System.out.println("'Amount' MisMatch-> Failed");
			}

			if(giftcardspageLocators_Obj.recipientsName_Output.getText().equalsIgnoreCase(Name)) {
				System.out.println("'Name' Verification ->Succesful");
			}
			else {
				System.out.println("'Name' MisMatch-> Failed");
			}

			if(giftcardspageLocators_Obj.recipientsEmail_Output.getText().equalsIgnoreCase(Email)) {
				System.out.println("'Email' Verfication ->Successful");
			}
			else {
				System.out.println("'Email' MisMatch->Failed");
			}

			if(giftcardspageLocators_Obj.recipientsMobile_Output.getText().equalsIgnoreCase(Phone))
			{
				System.out.println("'Mobile Number' Verrification ->Succesful");


			}else {
				System.out.println("'Mobile Number' MisMatch-> Failed");
			}
			if (giftcardspageLocators_Obj.pincode_Output.getText().contains(Pincode)) {
				System.out.println("'Pincode Verification' -> Successful");
			} else {
				System.out.println("'Pincode Mismatch' ->Failed");
			}
			if (giftcardspageLocators_Obj.yourName_Output.getText().equalsIgnoreCase(F_Name)){
				System.out.println("'Name Verification' ->Successful");
			} else {
				System.out.println("'Name Mismatch' ->Failed");
			}

			if (giftcardspageLocators_Obj.yourEmail_Output.getText().equalsIgnoreCase(F_Email)) {  
				System.out.println("'Email Verification' ->Successful");
			} else {
				System.out.println("'Email Mismatch' ->Failed");
			}

			if (giftcardspageLocators_Obj.Address_Output.getText().equalsIgnoreCase(Address)) {
				System.out.println("'Address Verification' -> Successful\n");
			} else {
				System.out.println("'Address Mismatch' ->Failed");
			}
			try {
				ExcelUtils.setCellData(filePath, "UrbanLadder",2,11,"Passed");
				ExcelUtils.fillGreenColor(filePath, "UrbanLadder",2,11);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
			System.out.println("*************Validation Completed*************\n\n\n");
		}
	}





