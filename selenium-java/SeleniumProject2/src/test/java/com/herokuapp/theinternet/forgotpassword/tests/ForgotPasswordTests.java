package com.herokuapp.theinternet.forgotpassword.tests;

import com.herokuapp.theinternet.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordTests extends BaseTest {

	@Test
	public void forgotPwdTest() {
		driver.get("https://the-internet.herokuapp.com/");
		sleep();

		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgot Password")));
		driver.findElement(By.linkText("Forgot Password")).click();
		sleep();

		driver.findElement(By.name("email")).sendKeys("myemailaddress@mydomain.com");
		sleep();
		driver.findElement(By.xpath("//*[text()='Retrieve password']")).click();

		wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));
		String text = driver.findElement(By.id("content")).getText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("Your e-mail's been sent!"),
				"Validation failed post clicking on 'Retrieve password' btn.");
		sleep();

	}

}
