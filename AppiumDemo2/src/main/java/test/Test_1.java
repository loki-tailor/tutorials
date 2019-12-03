package test;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test_1 {

    public static void main(String[] args) {

	try {
	    AndroidDriver<WebElement> driver;
	    DesiredCapabilities cap = new DesiredCapabilities();

	    cap.setCapability("platformName", "Android");
	    cap.setCapability("platformVersion", "5.1.1");
	    cap.setCapability("deviceName", "3204d9f3ef6ea0ad");
	    cap.setCapability("appPackage", "com.tfs.testappium");
	    cap.setCapability("appActivity", "com.tfs.testappium.MainActivity");

	    driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub/"), cap);

	    System.out.println("Open Application ");

	    driver.findElementById("com.tfs.testappium:id/txtUN").sendKeys("Pratiksha");
	    System.out.println("Entered username");

	    driver.findElementById("com.tfs.testappium:id/txtPWD").sendKeys("Daptare");
	    System.out.println("Entered Password ");

	    driver.findElementById("com.tfs.testappium:id/btnLogin").click();
	    System.out.println("Cliked on login button");
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
