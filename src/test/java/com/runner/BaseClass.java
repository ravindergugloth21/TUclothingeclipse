package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.drivers.Actions;

public class BaseClass {
	
	public static WebDriver driver;
	public static SearchResults searchResults=new SearchResults();
	public static HomePage homePage=new HomePage();
	public static StoreLocatorPage storeLocator=new StoreLocatorPage();
	public static AddToBasketPage addToBasket=new AddToBasketPage();
	public static CheckOutPage checkOutPage=new CheckOutPage();
	public static FollowUSClass followUSClass=new FollowUSClass();
	public static LoginPage loginPage=new LoginPage();
	public static PaginationPage paginationPage=new PaginationPage();
	public static Actions actions=new Actions();
	
	

}
