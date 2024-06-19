package com.urbanladder.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class BookshelvesPageLocators {

	//Category Filter
	@FindBy(xpath="//li[@data-group='category']")  public WebElement category_Filter;

	//Wall Shelves 
	@FindBy(id="filters_primary_category_Wall_Shelves") public WebElement Wall_Shelves_CheckBox;
	// Kid Bookshelves 
	@FindBy(id="filters_primary_category_Kids_Bookshelves") public WebElement Kid_Bookshelves_CheckBox ;


	//Price Filter 

	@FindBy(xpath="(//div[@class='gname'])[2]")
	public WebElement price_Filter;

	//Right Dragger
	@FindBy(xpath = "//div[@class='noUi-handle noUi-handle-upper']")public WebElement Right_Dragger;


	//Out Of Stock CheckBox
	@FindBy(id="filters_availability_In_Stock_Only") public WebElement outOfStock_CheckBox;

	//SortBy DropDown
	@FindBy(xpath="//span[normalize-space()='Recommended']") public WebElement SortBy_DropDown;

	//Sort By High To Low 
	@FindBy(xpath = "//*[@data-key=\"price_desc\"]") public WebElement HighToLow_Option;


	//Results
	//ProductName
	@FindAll({@FindBy(xpath = "//div[@class='product-title product-title-sofa-mattresses']/span")}) public List<WebElement> ProductName;
	//Published By
	@FindAll({@FindBy(xpath = "//div[@class=\"product-title product-title-sofa-mattresses\"]//div[2]/div")}) public List<WebElement> PublishedBy;
	//Discount Price
	@FindAll({@FindBy(xpath = "//div[@class=\"price-number\"]/span")}) public List<WebElement> DiscountPrice;
	//Original Price
	@FindAll({@FindBy(xpath = "//div[@class=\"price-number\"]/strike")}) public List<WebElement> OriginalPrice;
	//EMi
	@FindAll({@FindBy(xpath = "//span[@class='link-color']")}) public List<WebElement> EMiFrom;
	

	//Popup Banner 
	@FindBy(xpath="//*[@id='login_dialog']") public WebElement Popup;
	//Close Popup Element	
	@FindBy(xpath="//a[contains(text(),'Close')]")  public WebElement closePopup;

}
