package test.main.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

// import test.main.base.BaseBrowserFactory;

public class BaseTest
{
	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)	
	@Parameters({ "browser" })
	protected void setUp(@Optional("chrome") String browser)
	{
		BaseBrowserFactory factory = new BaseBrowserFactory(browser);
		driver = factory.createDriver();
		driver.manage().window().maximize();

		// add implicit wait
		// driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		// System.out.println("Implicit wait exhausted.");
	}

	@AfterMethod(alwaysRun = true)
	protected void tearDown()
	{
		Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
		System.out.println("[Closing driver: "+ capabilities.getBrowserName() +"]");
		driver.quit();
	}
}