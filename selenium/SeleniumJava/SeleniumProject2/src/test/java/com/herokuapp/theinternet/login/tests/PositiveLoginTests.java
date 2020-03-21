package com.herokuapp.theinternet.login.tests;

import com.herokuapp.theinternet.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PositiveLoginTests extends BaseTest {

	@Test(priority = 1)
	public void positiveLoginTest() {
		driver.get("https://the-internet.herokuapp.com/");
		sleep();

		driver.findElement(By.linkText("Form Authentication")).click();

		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		sleep();
		driver.findElement(By.id("login")).submit();

		WebDriverWait wait5a = new WebDriverWait(driver, 10);
		wait5a.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#flash.success")));
		String text = driver.findElement(By.cssSelector("#flash.success")).getText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("You logged into a secure area!"), "Post loging text validation FAILED.");
		sleep();

	}

}
