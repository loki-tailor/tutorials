import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Raaga extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
	     WebDriverWait wait1 = new WebDriverWait(driver, 30);
	     wait1.until(
	     ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/account_profile_picture")));
	     driver.findElement(By.id("com.google.android.gms:id/account_profile_picture")).click();
	    // driver.findElementById("com.raaga.android:id/skip_login_btn").click();
	     Thread.sleep(3000);
	  /*  ((driver.findElementsByClassName("android.widget.ImageView")).get(11)).click();
	     
	     driver.findElementById("com.raaga.android:id/language_continue_button").click();*/
	    // Thread.sleep(3000);
	  
	   /*  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
	     driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();*/
	     driver.findElementById("com.raaga.android:id/nav_ham_burger").click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Settings\"));");
	     driver.findElementByXPath("//android.widget.CheckedTextView[@text='Settings']").click();
	     //driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();
	     
	   Point point= driver.findElementById("com.raaga.android:id/toggle_auto_play").getLocation();
	TouchAction t= new TouchAction(driver);
	//toggle on
	  t.tap(point.x+20, point.y+30).perform();
	  //toggle off
	 // t.tap(point.x+100, point.y+30).perform();
	  
	  //Previous//appium version older- scrollTo()
	
	     
	     
	     
	     
		
	}

}
