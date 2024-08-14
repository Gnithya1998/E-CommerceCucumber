package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testResources.TestContextSetup;

public class HookSteps {
	
	WebDriver driver;
	TestContextSetup testContextSetup;
	
	public HookSteps(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.driver = testContextSetup.driverSetup.initialization();
		
	}
		
	@After
	public void tearDown() {
		
		driver.close();
	}

}
