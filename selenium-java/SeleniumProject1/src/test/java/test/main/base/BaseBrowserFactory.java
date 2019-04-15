package test.main.base;

import java.lang.ThreadLocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseBrowserFactory
{
	private ThreadLocal<WebDriver>	driver = new ThreadLocal<WebDriver>();
	private String browser;

	public BaseBrowserFactory(String browser)
	{
		this.browser = browser.toLowerCase();
	}

	public WebDriver createDriver()
	{
		System.out.println("[Creating driver: "+ browser +"]");

		switch(browser)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
				driver.set(new ChromeDriver());
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
				driver.set(new FirefoxDriver());
				break;

			case "ie":
				System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer.exe");
				driver.set(new InternetExplorerDriver());
				break;

			case "edge":
				System.setProperty("webdriver.edge.driver","src/test/resources/MicrosoftWebDriver.exe");
				driver.set(new EdgeDriver());
				break;

			default:
				System.out.println("[Browser not identifiable: "+ browser +". Proceeding with default chrome browser. ]");
				System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
				driver.set(new ChromeDriver());
				break;
		}
		return driver.get();
	}
}