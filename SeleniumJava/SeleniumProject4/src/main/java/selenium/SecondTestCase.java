package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCase {

    public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");

	// Create a new instance of the Firefox driver
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.findElement(By.name("firstname")).sendKeys("Anita");
	driver.findElement(By.name("lastname")).sendKeys("Dewangan");
	driver.findElement(By.id("submit")).submit();

    }

}
