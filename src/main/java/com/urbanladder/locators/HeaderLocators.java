package com.urbanladder.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderLocators {
	
	//Search input
	@FindBy(xpath="//input[@id='search']") public WebElement search_Input;
	
	//Search Buttton
	@FindBy(xpath="//*[@class='search-icon icofont-search']") public WebElement search_Button;
	
	//Living
	@FindBy(xpath="//*[@class=\"topnav_item livingunit\"]") public WebElement living_Label;
	
	//Chair
	@FindBy(xpath="(//ul[@class='inline-list left']//div)[6]/a") public WebElement Chair_Menu;
	//Chair SubMenu
	@FindBy(xpath="(//*[@class='taxonslist'])[6]/li/a/span") public List<WebElement> Chair_SubMenu;
	
	//Living Storage
	@FindBy(xpath="(//ul[@class='inline-list left']//div)[8]/a") public WebElement LivingStorage_Menu;
	//Living Storage SubMenu
	@FindBy(xpath="//ul[@class='taxonslist'])[8]//span") public List<WebElement> LivingStorage_SubMenu;
	
	//Gift Cards
	@FindBy(xpath="(//a[@class='featuredLinksBar__link'])[3]") public WebElement giftCardS_Link;
	
}
