package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");
		
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//span[text()='Flights']")).click();;
	       driver.findElement(By.xpath("//span[text()='Round Trip']")).click();
	       driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
	       
	}

}
