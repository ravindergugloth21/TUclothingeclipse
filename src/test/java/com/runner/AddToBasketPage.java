package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class AddToBasketPage extends BaseClass {
	public static By SEARCHTEXTBOX=By.id("search");
	public static By SEARCHBUTTON=By.id("search");
	public static By ADDTOCART=By.cssSelector("#AddToCart");
	public void addOneProductToBasket(String searchoneproduct) throws InterruptedException
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		
		actions.updateElement(SEARCHTEXTBOX,searchoneproduct);
		actions.clickOnElement(SEARCHBUTTON);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Maternity Stripe 'Mama' Slogan Top")).click();
		driver.findElement(By.cssSelector("label[for='size-tile-138197854']")).click();
		driver.findElement(By.cssSelector("#productVariantQty")).click();
		Select SizeDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		SizeDropDown.selectByIndex(2);
		driver.findElement(ADDTOCART).click();
		Thread.sleep(3000);
		Assert.assertE
	}
	public void addFirstProducttoSecondProgram() throws InterruptedException
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		actions.updateElement(SEARCHTEXTBOX," Maternity Grey Marl Sweatshirt");
		actions.clickOnElement(SEARCHBUTTON);
		Thread.sleep(6000);
		driver.findElement(By.linkText("Maternity Stripe 'Mama' Slogan Top")).click();
		driver.findElement(By.cssSelector("label[for='size-tile-138197854']")).click();
		driver.findElement(By.cssSelector("#productVariantQty")).click();
		Select SizeDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		SizeDropDown.selectByIndex(2);
		driver.findElement(ADDTOCART).click();
		Thread.sleep(5000);
		
	}
	public void addSecondProductToBasket() throws InterruptedException
	{
		actions.clearSearchTextBox(SEARCHTEXTBOX);
		actions.updateElement(SEARCHTEXTBOX,"Shoes");
		actions.clickOnElement(SEARCHBUTTON);
		driver.findElement(By.linkText("Sole Comfort Brown Slip On Shoes" )).click();
		driver.findElement(By.cssSelector("label[data-testid='tile-label-137947511']")).click();
		driver.findElement(By.cssSelector("#productVariantQty")).click();
		Select QuantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		QuantityDropDown.selectByIndex(2);
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[data-testid='checkoutButton']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
	}

}
