package test.main;

import test.main.base.BaseTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;
import java.util.Iterator;

public class WindowsAndFramesTest extends BaseTest
{
	// @Test
	public void newWindowTest() throws Exception
	{
		driver.get("http://the-internet.herokuapp.com/windows");
		System.out.println("Opened URL: http://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);

		System.out.println("AFTER Clicking");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.findElement(By.linkText("Click Here")).click();

		System.out.println("AFTER Clicking");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		// switching to new window
		String wh_firstWindow = driver.getWindowHandle();
		System.out.println("wh_firstWindow: " + wh_firstWindow);
		Thread.sleep(2000);

		Set<String> wh_allWindows = driver.getWindowHandles();
		Iterator<String> wh_iterator = wh_allWindows.iterator();
		while(wh_iterator.hasNext())
		{
			String wh_presentWindow = wh_iterator.next().toString();
			if(!wh_presentWindow.equals(wh_firstWindow))
			{
				driver.switchTo().window(wh_presentWindow);
				break;
			}
		}
		Thread.sleep(2000);

		System.out.println("AFTER SWITCHING");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		Assert.assertTrue(driver.getTitle().equals("New Window"),"New Window valdation failed");
		Assert.assertTrue(driver.getCurrentUrl().equals("http://the-internet.herokuapp.com/windows/new"),"CurrentURL vaildation failed");
		Thread.sleep(2000);
	}	


	@Test
	public void wysiwygEditorTest() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/iframe");
		System.out.println("Opened URL: https://the-internet.herokuapp.com/iframe");
		Thread.sleep(2000);

		WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iFrame);
		Thread.sleep(2000);

		WebElement textArea = driver.findElement(By.xpath("//*[@id='tinymce']/p"));
		textArea.clear();

		String str = "Here goes the content inside this TextArea which is embedded in an iFrame bro !!!";
		// textArea.sendKeys(str); // this won't work, since sendKeys does not work when a TextArea is withing an iFrame
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]",textArea,str);
		Thread.sleep(2000);

		Assert.assertTrue(textArea.getText().equals(str),"Text area validation failed.");			
	}
}