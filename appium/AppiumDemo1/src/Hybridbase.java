import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybridbase  {
	public static  AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	   File f = new File("src");
	   File fs = new File(f,"APiDemos-debug.apk");
       DesiredCapabilities cap = new DesiredCapabilities();
    if(device.equals("emulator"))
    {
    	 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
    }
    else if(device.equals("real"))
    {
       cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
    }
       cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
       cap.setCapability("newCommandTimeout", 100);
       AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
       System.out.println("connection established");
       return driver;
	}

}
