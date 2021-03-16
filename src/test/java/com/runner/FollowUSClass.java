package com.runner;



import java.util.List;

import org.openqa.selenium.By;

public class FollowUSClass extends BaseClass {
	public void instagramLogin()
	{
		driver.findElement(By.cssSelector("a[href='https://www.instagram.com/tuclothing']")).click();
		driver.findElement(By.cssSelector(".aOOlW.bIiDR")).click();
		driver.findElement(By.cssSelector(".sqdOP.L3NKy.y3zKF")).click();
		
	}
	public void instagramCredentials(List<String>logindetails)
	{
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(logindetails.get(0));
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(logindetails.get(1));
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	public void googleLogin() throws InterruptedException
	{
		driver.findElements(By.cssSelector(".ln-u-soft-ends.ln-u-soft-sides")).get(4).click();
		Thread.sleep(2000);
		;
	}
	public void googleCredentials(String email,String password)
	{
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("ravindergugloth21@gmail.com");
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
	}

}
