package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");
	
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       System.out.println(driver.getCurrentUrl());
       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("java");
      // Select options = new Select()
       
	}

}
