package StepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreLocatorStepdef extends BaseClass {
	@When("^I click TU store locator link$")
	public void i_click_TU_store_locator_link() throws Throwable {
		storeLocator.storeLocatorLink();
	    
	}

	@When("^enter the post code \"([^\"]*)\"$")
	public void enter_the_post_code(String pcode) throws Throwable {
		storeLocator.storeLocatorResult(pcode);
	    
	}

	


}
