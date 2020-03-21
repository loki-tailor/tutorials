import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeTest {
 
	AndroidDriver dr;
	
	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities capablities = new DesiredCapabilities();

		capablities.setCapability("deviceName","ZY223ZJMF4");
		capablities.setCapability("platformVersion","7.0");
		capablities.setCapability("platformName","Android");
		capablities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		dr= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capablities);
		dr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		dr.get("https://www.google.co.in/");
	}
}