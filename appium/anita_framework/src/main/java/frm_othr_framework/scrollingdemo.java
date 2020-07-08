package frm_othr_framework;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingdemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 Dimension size = driver.manage().window().getSize();
		 int x = size.getWidth()/2;
		 int startY=(int)(size.getHeight()*0.60);
		 int endY=(int)(size.getHeight()*0.10);
		 TouchAction ta = new TouchAction(driver);
		 ta.press(x, endY).waitAction(Duration.ofSeconds(1)).moveTo(x, startY).release().perform();
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));").click();
	}

}
