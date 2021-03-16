package StepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	public static String BASEURL="https://tuclothing.sainsburys.co.uk/";
	public static String DRIVERPATH="D:\\Automation\\chromedriver.exe";
	public static By COOKIES=By.id("consent_prompt_submit");
	@Before
	public void start() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",DRIVERPATH);
		 driver=new ChromeDriver();
		driver.get(BASEURL);
		Thread.sleep(2000);
		driver.findElement(COOKIES).click();
		}
	
	@After
	public void stop()
	{
		//driver.close();
	}

}
