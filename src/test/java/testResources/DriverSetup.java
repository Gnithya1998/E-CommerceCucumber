package testResources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public WebDriver driver;
	
	public WebDriver initialization() {
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Team EERO\\Documents\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		}
		
		return driver;
	}

}
