package StepDefinition;


import java.util.List;
import java.util.Map;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FollowUSStepDef extends BaseClass {
	@When("^I click Instagram logo next to follow us$")
	public void i_click_Instagram_logo_next_to_follow_us() throws Throwable {
		followUSClass.instagramLogin();
	    
	}

	@When("^I should be able to enter instragram credentials$")
	public void i_should_be_able_to_enter_instragram_credentials(DataTable userdetails) throws Throwable {
		//Map<String,String>logindetails=userdetails.asMap(String.class,String.class);
		//String emailId=logindetails.get("email");
		//String passwordid=logindetails.get("password");
		//followUSClass.instagramCredentials(logindetails.get("email"),logindetails.get("password"));
		
		List<String>logindetails=userdetails.asList(String.class);
		followUSClass.instagramCredentials(logindetails);
	    
	}

	

	@When("^I click Google logo next to follow us$")
	public void i_click_Google_logo_next_to_follow_us() throws Throwable {
		followUSClass.googleLogin();
	    
	}

	@When("^enter the <\"([^\"]*)\">$")
	public void enter_the(String arg1, DataTable userdetails) throws Throwable {
		followUSClass.googleCredentials(userdetails);
	    
	}

	


}
