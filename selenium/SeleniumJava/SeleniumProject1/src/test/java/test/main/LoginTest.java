package test.main;

import test.main.base.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
	@Test
	public void loginTest() throws Exception
	{
		System.out.println("Hello TestNG");
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Opened the URL - https://the-internet.herokuapp.com/login");

		WebElement we_userName = driver.findElement(By.id("username"));
		WebElement we_password = driver.findElement(By.name("password"));
		WebElement we_loginBtn = driver.findElement(By.tagName("button"));

		we_userName.sendKeys("tomsmith");
		we_password.sendKeys("SuperSecretPassword!");
		takeScreenshot("//" + this.getClass().getName() + " - formFilled - " + getTime());		

		we_loginBtn.click();

		Thread.sleep(5000);
		takeScreenshot("//" + this.getClass().getName() + " - loginBtnClicked - " + getTime());

		WebElement we_flashSuccessMsg = driver.findElement(By.id("flash-messages"));
		String message = we_flashSuccessMsg.getText();
		Assert.assertTrue(message.contains("You logged into a secure area!"),"The Success Login Message validation failed.");
		
	}	
}