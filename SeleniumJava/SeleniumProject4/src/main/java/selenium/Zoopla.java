package selenium;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoopla {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zoopla.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("search-input-location")).sendKeys("London");
	driver.findElement(By.id("search-input-location")).sendKeys(Keys.ENTER);
	List<WebElement> priceList = driver.findElements(By.xpath("//a[contains(@class,'listing-results-price')]"));
	try {
	    Thread.sleep(20000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println(priceList.size());

	for (int i = 0; i < priceList.size(); i++) {
	    System.out.println(priceList.get(0).getText());
	}

    }

}
