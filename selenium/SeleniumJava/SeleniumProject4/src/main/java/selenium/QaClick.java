package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/anita/chromedriver");
		
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://www.qaclickacademy.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       System.out.println(driver.findElements(By.tagName("a")).size());
	       
	}

}
