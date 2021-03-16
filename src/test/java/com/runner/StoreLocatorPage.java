package com.runner;

import org.junit.Assert;
import org.openqa.selenium.By;

public class StoreLocatorPage extends BaseClass{
	public static By STORELOCATORlINK=By.xpath("//a[contains(text(),'Tu Store Locator')]");
	public void storeLocatorLink() throws InterruptedException
	{
		actions.storeLocator(STORELOCATORlINK);
		//driver.findElement(STORELOCATORlINK).click();
		Thread.sleep(2000);
	}
	public void storeLocatorResult(String pcode) throws InterruptedException
	{
		
		//driver.findElement(By.className("ln-c-text-input ln-u-push-bottom")).sendKeys("IG7 5NP");
		driver.findElement(By.xpath("//body/div[@id='js-global-settings']/div[@id='wrapper']/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(pcode);
		//driver.findElement(By.xpath("//label[contains(text(),'Click and Collect')]"));
		driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
		
		
	}

}
