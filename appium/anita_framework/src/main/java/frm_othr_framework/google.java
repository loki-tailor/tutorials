package frm_othr_framework;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class google extends basechrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
 AndroidDriver<AndroidElement> driver = Capabilities();
			 driver.get("http://google.com");
			 System.out.println("Google page is opened successfully");
			 driver.findElementByName("q").sendKeys("Dream 11");
			 driver.findElementByName("q").sendKeys(Keys.ENTER);
			// List<String> hrefs = new ArrayList<String>();
			 List<WebElement> alllinks = ((WebDriver)driver).findElements(By.xpath("//a[@href='http://www.dream11.com/']"));
			 System.out.println(alllinks.size());
			 alllinks.get(1).click();
			 //allowAppPermission(driver);
			/* for(int i=0;i<alllinks.size();i++)
			        System.out.println(alllinks.get(i).getText());*/
			 
	}
	/*public static void allowAppPermission(WebDriver driver){
		 while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		}*/

}
