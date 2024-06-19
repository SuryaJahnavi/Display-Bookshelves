package com.urbanladder.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.urbanladder.locators.BookshelvesPageLocators;
import com.urbanladder.utils.BaseClass;

public class BookshelvesPageActions {
	
	Actions handler = BaseClass.getHandler();
	BookshelvesPageLocators bookshelvespagelocator_Obj = null;


	public BookshelvesPageActions() {
		this.bookshelvespagelocator_Obj = new BookshelvesPageLocators();
		PageFactory.initElements(BaseClass.getDriver(),bookshelvespagelocator_Obj);

	}
//Check for BookShelves Page
	public boolean checkBookShelfUrl() {

		return BaseClass.getWait(10).until(ExpectedConditions.urlContains("BookShelves"));

	}
	//Check for Popup 
	public boolean checkPopupBanner(){
		return bookshelvespagelocator_Obj.Popup.isDisplayed();
	}
	//Close Popup
	public void closePopup() {
		bookshelvespagelocator_Obj.closePopup.click();
	}
	//Checks for Price 
	public boolean CheckPriceFilter() {
		return bookshelvespagelocator_Obj.price_Filter.isDisplayed();
	}
	//MouseHover to Prize Filter 
	public void MovetoPrizeFilter() {
		BaseClass.getWait(20).until(ExpectedConditions.visibilityOf(bookshelvespagelocator_Obj.price_Filter));
		handler.moveToElement(bookshelvespagelocator_Obj.price_Filter).build().perform();
	}

	//Check for Right Dragger 
	public boolean CheckRightDragger() {
		return bookshelvespagelocator_Obj.Right_Dragger.isDisplayed();
	}
	//Drag And Set the Price to 15000
	public void DragAndSet() {
		handler.dragAndDropBy(bookshelvespagelocator_Obj.Right_Dragger, -211, 0).build().perform();

	}
	//Check For Category Filter
	public boolean CheckCategoryFilter() {
		return bookshelvespagelocator_Obj.category_Filter.isDisplayed();
	}

	//Mouse Hover to Category 
	public void MoveToCategory() {
		
		BaseClass.sleep(2000);
		handler.moveToElement(bookshelvespagelocator_Obj.category_Filter).build().perform();

	}
	//Check For WallShelves or  Kid Bookshelves 
	public boolean CheckIsElementClickable() {
		if(bookshelvespagelocator_Obj.Kid_Bookshelves_CheckBox.isEnabled()|| bookshelvespagelocator_Obj.Wall_Shelves_CheckBox.isEnabled()){
			return true;
		}
		return false;
	}
	//Click  WallShelves or  Kid Bookshelves 
	public void ClickItems() {
		try {
			BaseClass.sleep(2000);
			bookshelvespagelocator_Obj.Kid_Bookshelves_CheckBox.click();
		}catch (Exception e) {

			bookshelvespagelocator_Obj.Wall_Shelves_CheckBox.click();
		}
	}

	//Check for Out Of Stock 
	public boolean CheckOutOfStock() {
		return bookshelvespagelocator_Obj.outOfStock_CheckBox.isDisplayed();
	}
	//Click Out Of Stock 
	public void ExcludeOutOfStock() {
		bookshelvespagelocator_Obj.outOfStock_CheckBox.click();
	}
	//Check For SortBy DropDown
	public boolean CheckDropDown() {
		return bookshelvespagelocator_Obj.SortBy_DropDown.isDisplayed();
	}
	//House Hover to DropDown
	public void MovetoDropDown() {
		handler.moveToElement(bookshelvespagelocator_Obj.SortBy_DropDown).build().perform();;
	}
	//Check For High To Low Option
	public boolean CheckHightoLow() {
		return bookshelvespagelocator_Obj.HighToLow_Option.isDisplayed();
	}
	//Click on  High To Low Option
	public void ClickHighToLow() {
		bookshelvespagelocator_Obj.HighToLow_Option.click();
	}


	//Check and return the Results Displayed
	public List<WebElement> ProductName() {
		try{
			return bookshelvespagelocator_Obj.ProductName;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	public List<WebElement> PublishedBy() {
		try{
			return bookshelvespagelocator_Obj.PublishedBy;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	public List<WebElement> DiscountPrice() {
		try{
			return bookshelvespagelocator_Obj.DiscountPrice;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	public List<WebElement> OriginalPrice() {
		try{
			return bookshelvespagelocator_Obj.OriginalPrice;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	public List<WebElement> EMI() {
		try{
			return bookshelvespagelocator_Obj.EMiFrom;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}



}






