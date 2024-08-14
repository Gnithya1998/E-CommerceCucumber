package stepDefinitions;

import static org.testng.Assert.assertEquals;

import PageObjectModels.CartPageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testResources.TestContextSetup;

public class CartSteps {

	TestContextSetup testContextSetup;
	CartPageObjects cartPageObjects;

	public CartSteps(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
		cartPageObjects = testContextSetup.pageObjectModels.getCartPage();
	}

	@When("verify cart page is visible")
	public void verify_cart_page_is_visible() {
		
		String cartUrlString = cartPageObjects.cartUrl();
		assertEquals(cartUrlString, "https://automationexercise.com/view_cart");
	}

	@When("user proceed to checkout the products before registration")
	public void user_proceed_to_checkout_the_products() {
		
		cartPageObjects.checkOutBtnBeforeReg();
	}

	@When("user navigates to cart page and proceed to checkout")
	public void user_navigates_to_cart_page_and_proceed_to_checkout() {

		cartPageObjects.checkOutBtnAfterReg();
	}

}
