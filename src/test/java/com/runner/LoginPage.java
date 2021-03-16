package com.runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass {
	private static By REGISTRATIONEMAIL=By.cssSelector("#register_email");
	private static By REGISTRATIONTITLE=By.cssSelector("#register_title");
	private static By FIRSTNAME=By.cssSelector("#register_firstName");
	private static By LASTNAME=By.cssSelector("#register_lastName");
	private static By PASSWORD=By.cssSelector("#password");
	private static By PASSWORDREENTER=By.cssSelector("#register_checkPwd");
	private static By TERMSANDCONDITIONS=By.cssSelector("label[for='Terms & Conditions & Privacy Policy']");
	private static By REGISTERBUTTON=By.cssSelector("#submit-register");
	
	
	public void registrationLink() throws InterruptedException
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
		
	}
	public void loginCredentials(List<String>logindetails) throws InterruptedException
	{
		driver.findElement(REGISTRATIONEMAIL).sendKeys(logindetails.get(0));
		Thread.sleep(2000);
		driver.findElement(REGISTRATIONTITLE);
		Select titledropdown=new Select(driver.findElement(REGISTRATIONTITLE));
		titledropdown.selectByIndex(1);
		driver.findElement(FIRSTNAME).sendKeys(logindetails.get(2));
		driver.findElement(LASTNAME).sendKeys(logindetails.get(3));
		driver.findElement(PASSWORD).sendKeys(logindetails.get(4));
		driver.findElement(PASSWORDREENTER).sendKeys(logindetails.get(5));
		driver.findElement(TERMSANDCONDITIONS).click();
		//
		driver.findElement(REGISTERBUTTON).click();
		System.out.println(logindetails.get(0));
		System.out.println(logindetails.get(1));
		System.out.println(logindetails.get(2));
		System.out.println(logindetails.get(3));
		System.out.println(logindetails.get(4));
		System.out.println(logindetails.get(5));
		
	}

}
