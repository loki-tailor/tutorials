package test.main.base;

import java.lang.ThreadLocal;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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

	public WebDriver createDriverGrid()
	{
		// setting up selenium grid url	
		URL url = null;
		try {
			url = new URL("http://10.222.14.154:4444/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		System.out.println("Starting " + browser + " on grid");

		// using DesiredCapabilities to set up browser
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser);

		// creating driver
		try {
			driver.set(new RemoteWebDriver(url,capabilities));
		} catch (WebDriverException e) {
			if (e.getMessage().contains("Error forwarding"))
			{
				System.out.println("[Couldn't set browser: "+ browser +". It is unknown, starting chrome instead.]");
				capabilities.setBrowserName("chrome");
				driver.set(new RemoteWebDriver(url,capabilities));
			}
		}
		return driver.get();
	}

	protected WebDriver createDriverSauce(String platform, String testName) throws Exception
	{
		System.out.println("[Setting up driver: "+ browser +" on SauceLabs]");	
		String userName = "loki-tailor";
		String accessKey = "5e7f2e15-c14b-4bda-9cb0-01123f820ae8";
		String url = "http://" + userName + ":" + accessKey + "@ondemand.saucelabs.com:80/wd/hub";

		// Set up DesiredCapabilities (i.e. browser and os)
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName",browser);
		caps.setCapability("extendedDebugging","true");
		caps.setCapability("capturePerformance","true");
		
		// If Platform is not provided, start tests on Windows 10
		if (platform == null)
		{
			caps.setCapability("platform","Windows 10");
		} else {
			caps.setCapability("platform",platform);
		}

		// setting test name
		caps.setCapability("name",testName);

		try {
			driver.set(new RemoteWebDriver(new URL(url),caps));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver.get();
	}
}