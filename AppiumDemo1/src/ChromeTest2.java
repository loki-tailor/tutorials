import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeTest2 {
 
	
	
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver dr;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		dr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		dr.get("https://www.google.co.in/");
	}
}