package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjectModels.HomePageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testResources.TestContextSetup;

public class HomeSteps {

	WebDriver driver;
	public TestContextSetup testContextSetup;
	HomePageObjects homePageObjects;

	public HomeSteps(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
		homePageObjects = testContextSetup.pageObjectModels.getHomePage();
	}

	@When("browser is launched and user lands on the home page")
	public void browser_is_launched_and_user_lands_on_the_home_page() {

		System.out.println(homePageObjects.getTitle());

	}

	@Then("verify home page is visible")
	public void verify_home_page_is_visible() {

		Assert.assertTrue(homePageObjects.homePageVisibility());
	}

	@Then("user navigates to signup page")
	public void user_navigates_to_signup_page() {

		homePageObjects.signupPage();
	}

	@Then("verify Logged in as {string} is visible")
	public void verify_logged_in_as_username_is_visible(String name) {

		String nameString = homePageObjects.usernameCheck();
		Assert.assertEquals("Logged in as " + nameString, "Logged in as " + name);
		System.out.println("Name success");
	}

	@When("user deletes the account")
	public void user_deletes_the_account() {

		System.out.println("Entered delete section");
		homePageObjects.deleteAccBtn();
	}

	@Then("verify {string} is visible and continue for home page")
	public void verify_account_deleted_is_visible_and_continue(String msg) {

		String textString = homePageObjects.deleteAccMsg();
		Assert.assertEquals(textString, msg);
		System.out.println("Account deleted");
	}
	
	@When("^user add products to cart with ids$")
	public void user_add_products_to_cart(List<Integer> data) {
		
		homePageObjects.addProductToCart(data);
		homePageObjects.getCartPage();
	}

}
