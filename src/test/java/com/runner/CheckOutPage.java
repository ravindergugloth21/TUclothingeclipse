package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BaseClass {
	public void addproductToBasket() throws InterruptedException
	{
		driver.findElement(By.linkText("Kids")).click();
		driver.findElement(By.linkText("Dresses Jumpsuits & Outfits")).click();
		driver.findElement(By.linkText("Pink Leopard Print Dress & Leggings (3-14 Years)")).click();
		driver.findElement(By.cssSelector("#select-size")).click();
		Select sizeDropDown=new Select(driver.findElement(By.cssSelector("#select-size")));
		sizeDropDown.selectByIndex(11);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#productVariantQty"));
		
		Select quantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		quantityDropDown.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#AddToCart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")).click();
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
		driver.findElement(By.cssSelector("#guest_email")).sendKeys("rrrr@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
		
		
		
	}
	public void homeDelivery() throws InterruptedException
	{
		driver.findElement(By.cssSelector("label[for='HOME_DELIVERY']")).click();//for click and home delivery
		driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
		Thread.sleep(3000);
		//Assertion-----https://tuclothing.sainsburys.co.uk/checkout/multi/home-delivery/add
	}
	public void clickANdCollect() throws InterruptedException
	{
		driver.findElement(By.cssSelector("label[for='CLICK_AND_COLLECT']")).click();//for click and collect
		driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='lookup']")).sendKeys("IG7 5NP");
		driver.findElement(By.cssSelector("button[data-testid='lookup-submit']")).click();
		Thread.sleep(3000);
		driver.findElements(By.cssSelector("button[data-testid='select-store']")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-testid='submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Assertion url-https://tuclothing.sainsburys.co.uk/checkout/multi/payment-method/add
	}

}
