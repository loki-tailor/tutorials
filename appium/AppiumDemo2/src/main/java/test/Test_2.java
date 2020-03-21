package test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test_2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

	ADB.runcommand("adb start-server");
	String listDevices = ADB.runcommand("adb devices -l");
	System.out.println(listDevices);
	String serialId = ADB.runcommand("adb shell getprop ro.boot.serialno").replace("\n", "").replace(" ", "").trim();
	System.out.println("Using: " + serialId);
	String platformVersion = ADB.runcommand("adb shell getprop ro.build.version.release").replace("\n", "").replace(" ", "").trim();
	System.out.println("Using: " + platformVersion);
	ADB.runcommand("adb kill-server");
	
	AndroidDriver<WebElement> androidDriver = null;

	try {

	    DesiredCapabilities cap = new DesiredCapabilities();

	    cap.setCapability("platformName", "Android");
	    cap.setCapability("platformVersion", platformVersion);
	    cap.setCapability("deviceName", serialId);

	    cap.setCapability("appPackage", "com.sec.android.app.samsungapps");
	    cap.setCapability("appActivity", "com.sec.android.app.samsungapps.SamsungAppsMainActivity");
	    // cap.setCapability("noReset", "true");
	    // cap.setCapability("fullReset", "false");
	    // cap.setCapability("automationName", "UiAutomator2");
	    androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub/"), cap);
	    System.out.println("Launched Galaxy Store application");

	    halt();

	    // tc1(androidDriver);
	    // tc2(androidDriver);

	    WebDriverWait webDriverWait = new WebDriverWait(androidDriver, 30);
	    
	    String xpath_str_ga_centerSection = "//*[@resource-id='com.sec.android.app.samsungapps:id/recycler_for_you']/child::*";
	    By by_ga_centerSection = ByAndroidUIAutomator.xpath(xpath_str_ga_centerSection);
	    
	    List<WebElement> we_list_present_centerSection_horizantal = webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by_ga_centerSection));
	    System.out.println("we_list_present_centerSection_horizantal = " + we_list_present_centerSection_horizantal.size());

	    List<String> dynamicCollection = new ArrayList<String>();
	    for (WebElement tmpwe : we_list_present_centerSection_horizantal) {

		String xpath_str_all_dc_lbl = "/*[@resource-id='com.sec.android.app.samsungapps:id/lbl_heading']";
		By by_all_dc_lbl = ByAndroidUIAutomator.AndroidUIAutomator(xpath_str_all_dc_lbl);
		WebElement tmpwe2 = androidDriver.findElement(by_all_dc_lbl);
		String text = tmpwe2.getText();
		dynamicCollection.add(text);
		System.out.println("Dynamic Collection #" + (dynamicCollection.size() + 1));
	    }

	    System.out.println("TC Completed");

	    tc3(androidDriver);
	} catch (Exception e) {
	    e.printStackTrace();

	} finally {
	    if (androidDriver != null) {

		// androidDriver.quit();
	    }
	}
    }

    public static void tc3(AndroidDriver<WebElement> androidDriver) throws Exception {

    }

    @SuppressWarnings("unused")
    public static void tc2(AndroidDriver<WebElement> androidDriver) throws Exception {

	// TC2: Downloading Multiple apps -> Popular Apps DC from HomePage

	WebDriverWait webDriverWait = new WebDriverWait(androidDriver, 30);

	String uiSelector_setScrollable = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(exp)";
	String popularApps_label_cssSelector = uiSelector_setScrollable.replace("exp", "new UiSelector().text(\"Popular Apps\")");
	By popularApps_label_by = ByAndroidUIAutomator.AndroidUIAutomator(popularApps_label_cssSelector);

	List<WebElement> we = androidDriver.findElements(By.xpath("//android.widget.TextView[@text='Popular Apps']/parent::*/child::*[@resource-id='com.sec.android.app.samsungapps:id/grid_applications']/child::*"));
	System.out.println(we.size());

	// Download Start
	we.forEach(tmpwe -> {
	    System.out.println(tmpwe.getTagName());
	    WebElement appwe = tmpwe.findElement(By.id("com.sec.android.app.samsungapps:id/btn_download"));
	    System.out.println("appwe - " + appwe.getTagName());
	    appwe.click();
	    System.out.println("clicked");
	    System.out.println();
	});

	// Download Cancel
	if (false) {
	    System.out.println("2 second wait before cancelling.");
	    Thread.sleep(2000);
	    we.forEach(tmpwe -> {
		System.out.println("Cancelling");
		WebElement cancelwe = tmpwe.findElement(ByAndroidUIAutomator.id("com.sec.android.app.samsungapps:id/cancel_download_btn"));
		System.out.println(cancelwe.getTagName());
		cancelwe.click();
		System.out.println("Cancel Clicked");
		System.out.println();
	    });
	}

    }

    public static void tc1(AndroidDriver<?> androidDriver) {
	// TC:1 Fresh Launch > TnC Accept and press back button on SK page

	WebDriverWait webDriverWait = new WebDriverWait(androidDriver, 30);

	// click tnc checkbox
	String tnc_checkbox_id_uiSelector = "new UiSelector().resourceId(\"com.sec.android.app.samsungapps:id/isa_accept_terms_and_conditions\")";
	By tnc_checkbox_id = ByAndroidUIAutomator.AndroidUIAutomator(tnc_checkbox_id_uiSelector);
	webDriverWait.until(ExpectedConditions.presenceOfElementLocated(tnc_checkbox_id)).click();
	System.out.println("Clicked checkbox of TnC");

	// halt();

	// // click start on tnc page
	By tnc_start_btn = By.id("com.sec.android.app.samsungapps:id/positive");
	webDriverWait.until(ExpectedConditions.presenceOfElementLocated(tnc_start_btn)).click();
	System.out.println("Accepted Terms & Condition");

	// halt();

	// go to GS Home Page
	androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	System.out.println("Pressed back button from 1st time SK");
    }

    public static void halt() {
	Scanner sc = new Scanner(System.in);
	while (true) {
	    System.out.print("Type 'c' to continue: ");
	    String input = sc.nextLine();
	    if (input.equals("c")) {
		break;
	    }
	}
    }

}
