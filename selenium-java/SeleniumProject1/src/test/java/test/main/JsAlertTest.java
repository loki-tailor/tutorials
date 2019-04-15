package test.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import test.main.base.BaseTest;

public class JsAlertTest extends BaseTest
{
	@Test(priority = 1)
	public void jsAlertBtnText() throws Exception
	{
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("Opened URL: http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("I am a JS Alert"),"TEXT on alert is NOT as 'I am a JS Alert'");
		Thread.sleep(2000);

		alert.accept();
		
		WebDriverWait threeSecWait = new WebDriverWait(driver,3);
		Assert.assertTrue(
			threeSecWait.until(
				ExpectedConditions.textToBePresentInElementLocated(
					By.id("result"),"You successfuly clicked an alert"
				)
			),
			"RESULT VALIDATION FAILED for text 'You successfuly clicked an alert'"
		);
		Thread.sleep(2000);		
	}

	@Test(priority=2)
	public void jsAlertConfirmTest() throws Exception 
	{
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("Opened URL: http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("I am a JS Confirm"),"TEXT on alert is NOT as 'I am a JS Confirm'"); 
		Thread.sleep(2000);

		alert.accept();

		WebDriverWait wait3 = new WebDriverWait(driver,3);
		Assert.assertTrue(
			wait3.until(
				ExpectedConditions.textToBePresentInElementLocated(
					By.id("result"),"You clicked: Ok"
				)
			),
			"RESULT VALIDATION FAILED FOR text 'You clicked: Ok'"
		);
		Thread.sleep(2000);		
	}

	@Test(priority=3)
	public void jsAlertCancelTest() throws Exception
	{
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("Opened URL: http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver,5);
		wait5.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("I am a JS Confirm"),"Alert TEXT validation failed for text 'I am a JS Confirm'");
		Thread.sleep(2000);
		
		alert.dismiss();

		WebDriverWait wait3 = new WebDriverWait(driver,3);
		Assert.assertTrue(wait3.until(ExpectedConditions.textToBePresentInElementLocated(By.id("result"),"You clicked: Cancel")),"RESULT VALIDATION FAILED FOR TEXT: You clicked: Cancel");
		Thread.sleep(2000);
	}

	@Test(priority=4)
	public void jsAlertPromptTest() throws Exception
	{
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		System.out.println("URL opened: http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver,5);
		wait5.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().equals("I am a JS prompt"),"Alert TEXT VALIDATION FAILED for TEXT - 'I am a JS prompt'");
		Thread.sleep(2000);

		alert.sendKeys("Lokeshwar");
		
		alert.accept();
	
		WebDriverWait wait3 = new WebDriverWait(driver,3);
		Assert.assertTrue(wait3.until(ExpectedConditions.textToBePresentInElementLocated(By.id("result"),"You entered: Lokeshwar")),"RESULT VALIDATION FAILED FOR TEXT - You entered: Lokeshwar");
		Thread.sleep(2000);
	}
}