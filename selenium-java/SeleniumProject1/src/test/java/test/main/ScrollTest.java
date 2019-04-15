package test.main;

import test.main.base.BaseTest;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;

public class ScrollTest extends BaseTest
{
	@Test
	public void scrollTest() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		System.out.println("Opened URL: https://the-internet.herokuapp.com/infinite_scroll");
		Thread.sleep(2000);

		List<WebElement> allDivs = driver.findElements(By.className("jscroll-added"));
		int divSize = allDivs.size();
		System.out.println("# of divs: " + divSize);		

		while(divSize < 4)
		{	
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
			jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("# of divs: " + divSize);			

			allDivs = driver.findElements(By.className("jscroll-added"));
			divSize = allDivs.size();
			System.out.println("# of divs: " + divSize);		
			Thread.sleep(2000);
		}

		Assert.assertTrue(divSize == 4,"There should be 4 paragraphs, but there are " + divSize);
	}	
}