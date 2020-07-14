package com.selenium;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JinishAutomation {

    public static void main(String[] args) {

	try {
	    Date date = new Date();
	    String newstring = null;// new SimpleDateFormat("MM/dd").format(new
				    // DateTime(date).minusDays(1).toDate());
	    System.out.println(newstring);

	    System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.fb.com");

	    WebElement until = new WebDriverWait(driver, 5).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

	    System.out.println(until);

	    // driver.findElement(By.name("email")).sendKeys("raunak@indusos.com");
	    // driver.findElement(By.name("password")).sendKeys("Indus@2018");
	    // driver.findElement(By.xpath("//*[@type='submit']")).sendKeys(Keys.RETURN);
	    // driver.manage().window().maximize();
	    //
	    // WebDriverWait we = new WebDriverWait(driver, 40);
	    //
	    // WebElement sartDate =
	    // we.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Start
	    // date']")));
	    // sartDate.sendKeys(newstring);
	    // sartDate.click();
	    // sartDate.click();
	    // Thread.sleep(5000);
	    //
	    // WebElement table =
	    // we.until(ExpectedConditions.visibilityOfElementLocated(By.id("android-click-flow")));
	    // List<WebElement> rows = table.findElements(By.tagName("tr"));
	    // System.out.println(rows.get(3).findElement(By.tagName("td")).getText());
	    // System.out.println(rows.get(4).findElement(By.tagName("td")).getText());
	    // System.out.println();

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
