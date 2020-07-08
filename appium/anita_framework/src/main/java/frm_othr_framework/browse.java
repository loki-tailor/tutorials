package frm_othr_framework;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;

public class browse extends basechrome{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 AndroidDriver<AndroidElement> driver = Capabilities();
		 driver.get("http://google.com");
		 System.out.println("Google page is opened successfully");
		 //driver.findElementById("lst-ib").sendKeys("facebook");
		/*
		 driver.get("https://m.facebook.com/");
		 driver.findElementByName("email").sendKeys("ftrmetirpr@gmail.com");
		 driver.findElementByName("pass").sendKeys("ftrmetirpr");
		 driver.findElementByName("login").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//button[@type='submit']").click();*/
		 driver.get("http://cricbuzz.com");
		 driver.findElementByXPath("//a[@href='#menu']").click();
		 driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,460)", "");
		
		Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header"));
	     System.out.println(driver.getCurrentUrl());
	}
	

}
