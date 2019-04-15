package test.main;

import test.main.base.BaseTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicWebElementTest extends BaseTest
{
	@Test
	public void dynamicWebElement() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		System.out.println("Opened URL: https://the-internet.herokuapp.com/dynamic_loading/2");
		Thread.sleep(2000);

		WebElement we_startBtn = driver.findElement(By.tagName("button"));
		we_startBtn.click();

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));

		WebElement we_txt = driver.findElement(By.id("finish"));
		String text = we_txt.getText();
		Assert.assertTrue(text.equals("Hello World!"),"Hello World! text is not visible.");
		System.out.println("Assert Validation is success.");
		Thread.sleep(2000);
	}
}