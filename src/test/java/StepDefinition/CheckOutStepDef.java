package StepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutStepDef extends BaseClass{
	
	@When("^I add product to basket and click checkout$")
	public void i_add_product_to_basket_and_click_checkout() throws Throwable {
		checkOutPage.addproductToBasket();
	    
	}

	@When("^I select home delivery$")
	public void i_select_home_delivery() throws Throwable {
		checkOutPage.homeDelivery();
	    
	}
	@When("^I select click and collect delivery$")
	public void i_select_click_and_collect_delivery() throws Throwable {
		checkOutPage.clickANdCollect();
	    
	}

	


}
