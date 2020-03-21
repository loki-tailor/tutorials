package com.herokuapp.theinternet.login.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.BaseTest;

public class NegativeLoginTests extends BaseTest {

	@Test(priority = 1)
	public void negativeLoginTestInvalidUsrName() {
		driver.get("https://the-internet.herokuapp.com/login");
		sleep();

		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		driver.findElement(By.id("username")).sendKeys("invalidUserName");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		sleep();
		driver.findElement(By.id("login")).submit();

		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
		String text = driver.findElement(By.id("flash")).getText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("Your username is invalid!"),
				"Post loging with invalid username text validation FAILED.");
		sleep();

	}

	@Test(priority = 2)
	public void negativeLoginTestInvalidPwd() {
		driver.get("https://the-internet.herokuapp.com/login");
		sleep();

		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
		sleep();
		driver.findElement(By.id("login")).submit();

		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
		String text = driver.findElement(By.id("flash")).getText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("Your password is invalid!"),
				"Post loging with invalid password text validation FAILED.");
		sleep();

	}

}
