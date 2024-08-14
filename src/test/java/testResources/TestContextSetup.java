package testResources;

import org.openqa.selenium.WebDriver;

import PageObjectModels.PageObjectModels;

public class TestContextSetup {
	
	public WebDriver driver;
	public DriverSetup driverSetup;
	public PageObjectModels pageObjectModels;
	
	public TestContextSetup() {
		
		driverSetup = new DriverSetup();
		pageObjectModels = new PageObjectModels(driverSetup.initialization());
		
		
	}
	

}
