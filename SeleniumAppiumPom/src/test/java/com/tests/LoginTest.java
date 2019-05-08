package com.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.DemoSiteWpLoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LoginTest {
	/***
	 * driver.findElementByAndroidUIAutomator(“new UiScrollable(new
	 * UiSelector()).scrollIntoView(text(“Enter your element”))”);
	 * 
	 * Above is for scrolling to a particular element
	 */

	AndroidDriver<WebElement> driver;

	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

	@Test
	public void demoAutTest() {
		try {
			DemoSiteWpLoginPage loginPage = new DemoSiteWpLoginPage(driver).openUrl(driver);
			Thread.sleep(2000);
			loginPage.enter("admin", "demo@123");
			System.out.println("test completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
