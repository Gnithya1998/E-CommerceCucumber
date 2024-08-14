package stepDefinitions;

import org.testng.Assert;

import PageObjectModels.CheckoutPageObjects;
import io.cucumber.java.en.Then;
import testResources.TestContextSetup;

public class CheckoutSteps {

	TestContextSetup testContextSetup;
	CheckoutPageObjects checkoutPageObjects;
	
	public CheckoutSteps(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		checkoutPageObjects = testContextSetup.pageObjectModels.getCheckoutPage();
	}
	
	@Then("verify address details and review the order")
	public void verify_address_details_and_review_the_order() {

		checkoutPageObjects.ClickPlaceOrder("Added products are visible");
		Assert.assertTrue(checkoutPageObjects.addressDisplay());
		Assert.assertTrue(checkoutPageObjects.cartDiaplayed());
	}
	@Then("user enter the payment details and confirm order")
	public void user_enter_the_payment_details_and_confirm_order() {
		
	    checkoutPageObjects.cardDetails("Nikkie", "1111 2222 3333 4444", "999", "08", "2029");
	}
	@Then("verify {string} is displayed")
	public void verify_is_displayed(String msg) {

		String msgString = checkoutPageObjects.orderSuccessMsg();
		Assert.assertEquals(msgString, msg);
	}
	
}
