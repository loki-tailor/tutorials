package demo;

/*- @created 16-11-2020
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;

public class SwayamDotCom {
	public static void main(String[] args) {
		System.out.println("######################### EXECUTION STARTED #########################");
		WebDriver driver = null;
		// String[] fields_to_extract = "Course Status :,Duration :,Start Date :,End Date :,Exam Date :,Enrollment Ends :,Category :,Level :".split(","); // for upcoming courses
		String[] fields_to_extract = "Course Status :,Duration :,Start Date :,End Date :,Exam Date :,Category :,Level :".split(","); // for past courses
		String generic_xpath = "//*[text()='<field>']/following-sibling::td";
		try {
			driver = remoteBrowserDriverInit();

			// iterate over all URLs
			for(int i = 30; i <= 80; i++) {

				// navigate to site
				String index = "";
				if(i < 10) index = "0" + i;
				else index = String.valueOf(i);
				// String url = "https://onlinecourses.nptel.ac.in/noc21_cs"+index+"/preview";
				// String url = "https://onlinecourses.nptel.ac.in/noc21_ae"+index+"/preview";
				String url = "https://onlinecourses.swayam2.ac.in/aic20_sp" + index +"/preview";
				driver.get(url);

				// wait for page to load
				new WebDriverWait(driver, 30).until( tmpDriver -> ((JavascriptExecutor) tmpDriver).executeScript("return document.readyState").equals("complete"));
				String title = driver.getTitle();
				// System.out.println("Page loaded");

				// skip if no data available
				if(title.equalsIgnoreCase(url)) {
					System.out.println("Skipping index - " + i);
					continue;
				}
			
				System.out.print(i + "," + title + ",");

				// extract data & print
				for(String field : fields_to_extract) {
					System.out.print(driver.findElement(By.xpath(generic_xpath.replace("<field>",field))).getText().replace("\n", " ~ ") + ",");
				}
				System.out.println();

				java.util.concurrent.TimeUnit.SECONDS.sleep(1);

			} // end of for-loop

		} catch(WebDriverException | InterruptedException e) {
			e.printStackTrace();
		} finally { 
			// if(driver != null) driver.quit(); 
		}
	}
	
	static WebDriver localBrowserDriverInit() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lokeshwar.tailor\\Downloads\\git\\tutorials\\selenium\\selenium-server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	static WebDriver remoteBrowserDriverInit() {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
		options.addArguments("--disable-gpu"); 
		driver = new ChromeDriver(options);
		return driver;
	}
}