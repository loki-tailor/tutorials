package test.main.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.ITestContext;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
// import test.main.base.BaseBrowserFactory;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "environment", "platform" })
	protected void setUp(@Optional("chrome") String browser, @Optional("local") String env, @Optional String platform,
			ITestContext iTestContext) throws Exception {
		String testName = iTestContext.getCurrentXmlTest().getName();
		BaseBrowserFactory factory = new BaseBrowserFactory(browser);

		// start test on - grid or locally or in cloud (SauceLab) environment
		if (env.equals("grid")) {
			driver = factory.createDriverGrid();
		} else if (env.equals("sauce")) {
			driver = factory.createDriverSauce(platform, testName);
		} else {
			driver = factory.createDriver();
		}

		Thread.sleep(2000);

		driver.manage().window().maximize();

		// add implicit wait
		// driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		// System.out.println("Implicit wait exhausted.");
	}

	@AfterMethod(alwaysRun = true)
	protected void tearDown() {
		Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println("[Closing driver: " + capabilities.getBrowserName() + "]");
		driver.quit();
	}

	protected void takeScreenshot(String fileName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//target//test-output//screenshots//" + fileName + ".png";
		try {
			FileUtils.copyFile(srcFile, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyhhmmss");
		return dateFormat.format(new Date());
	}
}