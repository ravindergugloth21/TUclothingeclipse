package StepDefinition;

import java.util.List;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends BaseClass{
	@When("^I click on the link$")
	public void i_click_on_the_link() throws Throwable {
	    loginPage.registrationLink();
	}

	@When("^enter the details$")
	public void enter_the_details(DataTable userdetails) throws Throwable {
		List<String>logindetails=userdetails.asList(String.class);
	   loginPage.loginCredentials(logindetails); 
	}

	

}
