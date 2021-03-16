package com.runner;

import org.junit.Assert;
import org.openqa.selenium.By;



public class PaginationPage extends BaseClass{
	public void searchForTheProduct() throws InterruptedException
	{
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(3000);
		
		
	}
	public void productsAreDisplayed() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#mw_datenight")).click();
		Thread.sleep(2000);
		driver.findElements(By.cssSelector("li[class='ln-o-inline-list__item']")).get(2).click();
		Thread.sleep(3000);
		
	}
	public void pagination() throws InterruptedException
	{
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(2000);
		
	}
	public void moveToAnotherPage()
	{
		driver.findElement(By.linkText("4")).click();
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/c/men/men-trending?q=%3AnewArrivals&page=3&size=24", driver.getCurrentUrl());
	}

}
