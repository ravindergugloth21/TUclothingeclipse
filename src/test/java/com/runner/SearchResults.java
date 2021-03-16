package com.runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SearchResults extends BaseClass{
	public void verifyValidData(String searchTerm)
	{
		String expectedvalue="https://tuclothing.sainsburys.co.uk/search?text="+searchTerm;
		Assert.assertTrue(expectedvalue.contains(searchTerm));
		//Assert.assertTrue(expectedvalue.contains(searchTerm)
	}
	public void verifySearchWithInvalidData(String searchResult)
	{
		Assert.assertEquals(searchResult, driver.getCurrentUrl());
	}
	public void verifyBlankData()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/",driver.getCurrentUrl());
	}
	public void verifySearchTextBox()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/",driver.getCurrentUrl());
	}
	public void storeLocatorValidAndInvalid(String detailsOfStore) throws InterruptedException
	{
		//Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.titleIs(detailsOfStore));
	
		Assert.assertEquals(detailsOfStore, driver.getTitle());
		
	}
	public void oneProductInTheBasket(String searchResult)
	{
		Assert.assertEquals(searchResult,driver.getCurrentUrl());
	}
	public void twoProductsInTheBasket()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login/checkout",driver.getCurrentUrl());
	}
	public void homeDeliveryPage()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/home-delivery/add",driver.getCurrentUrl());
	}
	public void paymentPage()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/payment-method/add",driver.getCurrentUrl());
	}
	public void instagram()
	{
		Assert.assertEquals("https://www.instagram.com/tuclothing/",driver.getCurrentUrl());
	
	}
	public void google()
	{
		Assert.assertEquals("https://accounts.google.com/signin/v2/deniedsigninrejected?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111345982334725582630&followup=https%3A%2F%2Fplus.google.com%2F111345982334725582630&flowName=GlifWebSignIn&flowEntry=ServiceLogin", driver.getCurrentUrl());
	}
	public void registration()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login#", driver.getCurrentUrl());
	}
	

}
