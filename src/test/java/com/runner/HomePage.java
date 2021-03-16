package com.runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

public class HomePage extends BaseClass {
	public static By SEARCHTEXTBOX=By.id("search");
	public static By SEARCHBUTTON=By.className("searchButton");
	
	public void verifyHomePage()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
	}

	public void verifyValidDetails(String TermSearch)
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		actions.updateElement(SEARCHTEXTBOX,TermSearch);
		actions.clickOnElement(SEARCHBUTTON);
	}
	public void verifyInvalidDetails(String deepa)
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		actions.updateElement(SEARCHTEXTBOX,deepa);
		actions.clickOnElement(SEARCHBUTTON);
	}
	public void blankTextBox()
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		actions.updateElement(SEARCHTEXTBOX,"");
		actions.clickOnElement(SEARCHBUTTON);
	}
	public void searchTextBox()
	{
		driver.findElement(SEARCHTEXTBOX).clear();
		actions.updateElement(SEARCHTEXTBOX,"");
		actions.clickOnElement(SEARCHBUTTON);
	}
}
