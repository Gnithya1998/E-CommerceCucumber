package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonObjects.CommonPageObjects;

public class CheckoutPageObjects extends CommonPageObjects {

	WebDriver driver;

	public CheckoutPageObjects(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "address_delivery")
	WebElement deliveryAddress;

	@FindBy(id = "address_invoice")
	WebElement billingAddress;

	@FindBy(css = "div.cart_info")
	WebElement cartInfo;

	@FindBy(name = "message")
	WebElement messageBox;

	@FindBy(linkText = "Place Order")
	WebElement placeOrderBtn;

	@FindBy(name = "name_on_card")
	WebElement cardName;

	@FindBy(css = "input.card-number")
	WebElement cardNumber;

	@FindBy(xpath = "//input[@data-qa='cvc']")
	WebElement cardCVV;

	@FindBy(name = "expiry_month")
	WebElement cardMonth;

	@FindBy(name = "expiry_year")
	WebElement cardYear;

	@FindBy(id = "submit")
	WebElement confirmOrder;

	@FindBy(xpath = "//p[contains(text(),'Your order')]")
	WebElement orderSuccess;

	public boolean addressDisplay() {

		if (deliveryAddress.isDisplayed() && billingAddress.isDisplayed()) {

			return true;
		} else {

			return false;
		}
	}

	public boolean cartDiaplayed() {

		return cartInfo.isDisplayed();
	}

	public void ClickPlaceOrder(String message) {

		messageBox.sendKeys(message);
		placeOrderBtn.click();
	}

	public void cardDetails(String name, String number, String cvv, String month, String year) {

		cardName.sendKeys(name);
		cardNumber.sendKeys(number);
		cardCVV.sendKeys(cvv);
		cardMonth.sendKeys(month);
		cardYear.sendKeys(year);
		confirmOrder.click();

	}

	public String orderSuccessMsg() {

		return orderSuccess.getText();
	}

}
