package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class HomePageStepDef extends BaseClass{
	
	@Given("^I am on Home page$")
	public void i_am_on_Home_page() throws Throwable {
		homePage.verifyHomePage();
	   	}

	@When("^I enter valid \"([^\"]*)\" details$")
	public void i_enter_valid_details(String ravi) throws Throwable {
		homePage.verifyValidDetails(ravi);
	   
	}

	

	@When("^I enter invalid \"([^\"]*)\" details$")
	public void i_enter_invalid_details(String Termsearch) throws Throwable {
		homePage.verifyInvalidDetails(Termsearch);
	    
	}

	

	@When("^I leave search text box \"([^\"]*)\"blank$")
	public void i_leave_search_text_box_blank(String blank) throws Throwable {
		homePage.blankTextBox();
		
	   
	}

	

	@When("^I click on search text box$")
	public void i_click_on_search_text_box() throws Throwable {
		
	   homePage.searchTextBox();
	}

	




}
