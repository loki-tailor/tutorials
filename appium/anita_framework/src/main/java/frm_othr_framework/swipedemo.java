package frm_othr_framework;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipedemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 TouchAction t = new TouchAction(driver);
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
         driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        
         driver.findElementByXPath("//*[@content-desc='9']").click();
         t.press( driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofSeconds(3)).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	}

}
