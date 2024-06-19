package com.urbanladder.definitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.urbanladder.actions.BookshelvesPageActions;
import com.urbanladder.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookShelvesDefinitions {

	List<WebElement>ProductName = null;
	List<WebElement>PublishedBy = null;
	List<WebElement>DiscountPrice = null;
	List<WebElement>OriginalPrice = null;
	List<WebElement>EMiFrom = null;
	
	
	BookshelvesPageActions bookshelvespageactionsObj= new BookshelvesPageActions();
	@Given("Filter  Bookshelves below Rs15000")
	public void filter_bookshelves_below_rs() {
		
			bookshelvespageactionsObj.MovetoPrizeFilter();
			bookshelvespageactionsObj.DragAndSet();
		
		
	}
	@Given("exclude out of stock")
	public void exclude_out_of_stock() {
		bookshelvespageactionsObj.ExcludeOutOfStock();
		
	}
	@Given("Select anyone Category \\(like Wall Shelves \\/ Kid Bookshelves \\/ Study Tables, etc)")
	public void select_anyone_category_like_wall_shelves_kid_bookshelves_study_tables_etc() {
		BaseClass.sleep(2000);
		bookshelvespageactionsObj.MoveToCategory();
		bookshelvespageactionsObj.ClickItems();
		
	}
	@Given("Sort by price High to Low")
	public void sort_by_price() {
		BaseClass.sleep(2000);
		bookshelvespageactionsObj.MovetoDropDown();
		bookshelvespageactionsObj.ClickHighToLow();
		
	}
	@When("fetched the items")
	public void fetched_the_top_items() {
		ProductName = bookshelvespageactionsObj.ProductName();
		PublishedBy =bookshelvespageactionsObj.PublishedBy();
		DiscountPrice =bookshelvespageactionsObj.DiscountPrice();
		OriginalPrice =bookshelvespageactionsObj.OriginalPrice();
		EMiFrom = bookshelvespageactionsObj.EMI();
	}
	@Then("print all details in console output")
	public void print_all_details_in_console_output() {
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+")Product Name: "+ProductName.get(i).getText());
			System.out.println("Published By: "+PublishedBy.get(i).getText());
			System.out.println("DiscountPrice: "+DiscountPrice.get(i).getText());
			System.out.println("OriginalPrice: "+OriginalPrice.get(i).getText());
			System.out.println("EMiFrom "+EMiFrom.get(i).getText()+"\n");
			}
		BaseClass.sleep(5000);
	}
}
