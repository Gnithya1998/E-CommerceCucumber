package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObjectModels.PageObjectModels;
import PageObjectModels.RegistrationPageObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testResources.TestContextSetup;

public class RegistrationSteps {

	WebDriver driver;
	TestContextSetup testContextSetup;
	RegistrationPageObjects registrationPageObjects;

	public RegistrationSteps(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
		registrationPageObjects = testContextSetup.pageObjectModels.getRegistrationPage();
	}

	@Then("verify {string} visibility")
	public void user_navigates_to_signup_page_and_verify_new_user_signup_visibility(String msg) {

		String textString = registrationPageObjects.newUserSignUp();
		Assert.assertEquals(textString, msg);
	}

	@When("user enters {string} and {string} address")
	public void user_enters_name_and_email_address(String name, String email) {

		registrationPageObjects.signUp(name, email);
	}

	@Then("verify {string} is visible")
	public void verify_enter_account_information_is_visible(String msg) {

		String textString = registrationPageObjects.accInfoMsg();
		Assert.assertEquals(textString, msg);
	}

	@Then("user fills the details for registration")
	public void user_fills_the_details_for_registration() {

		registrationPageObjects.accountInformationForm("Admin@123");
		registrationPageObjects.addressInformationForm("Nikkie", "kalrani", "IIT Madras", "India", "Tamil Nadu",
				"Chennai", "600028", "1112223334");
	}

	@Then("verify {string} is visible and continue in registration page")
	public void verify_account_created_is_visible_and_continue(String msg) {

		String textString = registrationPageObjects.accCreatedMsg();
		Assert.assertEquals(textString, msg);
		registrationPageObjects.homeNavigation();
	}
	
	@Then("verify {string} error is displayed")
	public void verify_error_is_displayed(String msg) {
		
		String errorMsg = registrationPageObjects.errorMsgElement();
		Assert.assertEquals(errorMsg, msg);
		
	}

}
