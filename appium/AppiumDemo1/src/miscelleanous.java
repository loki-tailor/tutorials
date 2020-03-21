import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanous extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.isLocked());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKeyCode(AndroidKeyCode.HOME);

	}

}
