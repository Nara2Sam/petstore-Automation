package ynr.dt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
	
public void invokeBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//webdriver --interface, driver- instance created for webdriver,
	driver.get("https://petstore.octoperf.com");
}
}
