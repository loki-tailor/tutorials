package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

    public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");

	// Create a new instance of the Firefox driver
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-form/");
	WebElement ele = driver.findElement(By.id("continents"));
	Select oSelect = new Select(ele);

	oSelect.selectByIndex(1);
	oSelect.selectByVisibleText("Africa");
	List<WebElement> options = oSelect.getOptions();
	int size = options.size();
	for (int i = 0; i < size; i++) {

	    System.out.println(options.get(i).getText());
	}

    }

}
