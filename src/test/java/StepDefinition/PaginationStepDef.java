package StepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaginationStepDef extends BaseClass {
	@When("^I search for the product$")
	public void i_search_for_the_product() throws Throwable {
		paginationPage.searchForTheProduct();
	    
	}

	@When("^products are displayed$")
	public void products_are_displayed() throws Throwable {
		paginationPage.productsAreDisplayed();
	    
	}

	@Then("^I scroll down and move to another page$")
	public void i_scroll_down_and_move_to_another_page() throws Throwable {
		paginationPage.pagination();
	    
	}

	@Then("^again I scroll down and move to another page$")
	public void again_I_scroll_down_and_move_to_another_page() throws Throwable {
		paginationPage.moveToAnotherPage();
	    
	}



}
