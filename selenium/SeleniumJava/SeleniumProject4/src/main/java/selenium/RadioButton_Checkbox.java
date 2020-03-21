package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton_Checkbox {

    public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");

	// Create a new instance of the Firefox driver
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-form/");
	List<WebElement> rb = driver.findElements(By.name("sex"));

	if (rb.get(1).isSelected() != true) {
	    rb.get(1).click();
	}
	;

	if (driver.findElement(By.id("exp-2")).isSelected() != true) {
	    driver.findElement(By.id("exp-2")).click();
	}
	List<WebElement> ckbox = driver.findElements(By.name("profession"));

	int size = ckbox.size();
	for (int i = 0; i < size; i++) {
	    String svalue = ckbox.get(i).getAttribute("value");

	    if (svalue.equalsIgnoreCase("Automation Tester")) {
		ckbox.get(i).click();
	    }
	}

    }

}
