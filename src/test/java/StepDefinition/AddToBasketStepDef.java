package StepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToBasketStepDef extends BaseClass{
	
		@When("^I add \"([^\"]*)\" product to the basket$")
	public void i_add_product_to_the_basket(String searchoneproduct) throws Throwable {
			addToBasket.addOneProductToBasket(searchoneproduct);
	    
	}

	

	@When("^I search product \"([^\"]*)\" and add to basket$")
	public void i_search_product_and_add_to_basket(String arg1) throws Throwable {
		addToBasket.addFirstProducttoSecondProgram();
	   
	}

	@When("^I go and search for second product \"([^\"]*)\" and add to basket$")
	public void i_go_and_search_for_second_product_and_add_to_basket(String arg1) throws Throwable {
	    addToBasket.addSecondProductToBasket();
	}

	

	
	


}
