package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

    public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "/home/lokesh/drivers/geckodriver");

	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();

	String appUrl = "http://www.DemoQA.com";
	driver.get(appUrl);

	// Click on Registration link
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

	// Go back to Home Page
	driver.navigate().back();

	// Go forward to Registration page
	driver.navigate().forward();

	// Go back to Home page
	driver.navigate().to(appUrl);

	// Refresh browser
	driver.navigate().refresh();

	// Close browser
	driver.close();

    }
}