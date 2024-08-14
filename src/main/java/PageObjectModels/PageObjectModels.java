package PageObjectModels;

import org.openqa.selenium.WebDriver;

public class PageObjectModels {
	
	public WebDriver driver;
	public HomePageObjects homePageObjects;
	public RegistrationPageObjects registrationPageObjects;
	public CartPageObjects cartPageObjects;
	public CheckoutPageObjects checkoutPageObjects;
	
	public PageObjectModels(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public HomePageObjects getHomePage() {
		
		homePageObjects = new HomePageObjects(driver);
		return homePageObjects;
		
	}
	
	public RegistrationPageObjects getRegistrationPage() {
		
		registrationPageObjects = new RegistrationPageObjects(driver);
		return registrationPageObjects;
	}
	
	public CartPageObjects getCartPage() {
		
		cartPageObjects = new CartPageObjects(driver);
		return cartPageObjects;
	}
	
	public CheckoutPageObjects getCheckoutPage() {
		
		checkoutPageObjects = new CheckoutPageObjects(driver);
		return checkoutPageObjects;
	}

}
