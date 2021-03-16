package StepDefinition;



import com.runner.BaseClass;

import cucumber.api.java.en.Then;


public class SearchResultsDef extends BaseClass{
	@Then("^I should see related \"([^\"]*)\" products$")
	public void i_should_see_related_products(String searchResult) throws Throwable {
		searchResults.verifyValidData(searchResult);
		
	   
	}
	
	@Then("^I should see error message for \"([^\"]*)\" details$")
	public void i_should_see_error_message_for_details(String searchResult) throws Throwable {
		searchResults.verifySearchWithInvalidData(searchResult);
	    
	}
	
	@Then("^I should see error message for blank product$")
	public void i_should_see_error_message_for_blank_product() throws Throwable {
	    searchResults.verifyBlankData();
	}
	
	@Then("^warning message to be displayed$")
	public void warning_message_to_be_displayed() throws Throwable {
	   searchResults.verifySearchTextBox();
	}
	@Then("^it should display the nearest stores \"([^\"]*)\"$")
	public void it_should_display_the_nearest_stores(String detailsOfStore) throws Throwable {
	    searchResults.storeLocatorValidAndInvalid(detailsOfStore);
	}
	@Then("^I should see \"([^\"]*)\" related products in the basket$")
	public void i_should_see_related_products_in_the_basket(String searchResult) throws Throwable {
		searchResults.oneProductInTheBasket(searchResult);
	    
	}
	@Then("^I should see two  products in the basket$")
	public void i_should_see_two_products_in_the_basket() throws Throwable {
		searchResults.twoProductsInTheBasket();
	   
	}
	@Then("^I should be in Home delivery page$")
	public void i_should_be_in_Home_delivery_page() throws Throwable {
		searchResults.homeDeliveryPage();
	
	}
	    

	@Then("^I should be able to proceed to payment page$")
	public void i_should_be_able_to_proceed_to_payment_page() throws Throwable {
		searchResults.paymentPage();
	    
	}
	@Then("^I should be able to  follow TU using instagram$")
	public void i_should_be_able_to_follow_TU_using_instagram() throws Throwable {
		searchResults.instagram();
	    
	}
	@Then("^I should be able to follow TU$")
	public void i_should_be_able_to_follow_TU() throws Throwable {
		searchResults.google();
	    
	}
	@Then("^I should be able to register$")
	public void i_should_be_able_to_register() throws Throwable {
		searchResults.registration();
	    
	}


}
