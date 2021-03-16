package com.drivers;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Actions extends BaseClass {
	
	public void clearSearchTextBox(By element)
	{
		driver.findElement(element).clear();
	}
	
	public void updateElement(By element, String value)
	{
		driver.findElement(element).sendKeys(value);
	}
	public void clickOnElement(By element)
	{
		driver.findElement(element).click();
	}
	public void storeLocator(By element)
	{
		driver.findElement(element).click();
	}

}
