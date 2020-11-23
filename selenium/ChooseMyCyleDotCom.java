package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseMyCyleDotCom {

	public static void main(String[] args) {

		try {

			System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver_79.0.3945.36.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://www.google.com/");

			String[] list = {

					"https://www.choosemybicycle.com/en/bicycles/montra-celtic-2-1-2017",
					"https://www.choosemybicycle.com/en/bicycles/montra-redeem-2018"
			};

			for (String url : list) {

				driver.navigate().to(url);

				new WebDriverWait(driver, 20)
						.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".itemName")));

				System.out.print(driver.findElement(By.cssSelector(".itemName")).getText());
				System.out.print(",");

				try {
					System.out.print(driver.findElement(By.cssSelector(".itemPrice")).getText());
					System.out.print(",");
				} catch (Exception e) {

					System.out.print(driver.findElement(By.cssSelector(".discountedPrice")).getText());
					System.out.print(",");

					System.out.print(driver.findElement(By.cssSelector(".originalPrice")).getText());
					System.out.print(",");

				}

				System.out.print("############# - TBC");
				System.out.print(",");

				String[] str = { "Frame", "Fork", "Front derailleur", "Rear derailleur", "Shifters", "Cassette",
						"Chain", "Crank set", "Brake Lever", "Brake lever", "Brakes", "Wheel size", "Tires", "Rims" };

				for (String key : str) {

					try {
						System.out.print(driver.findElement(By.xpath("//*[text()='" + key + "']//following-sibling::p"))
								.getText().replace(",", " | "));
						System.out.print(",");
					} catch (Exception ne) {
						System.out.print(key);
						System.out.print(",");
						continue;
					}
				}
				System.out.println();

			} // end of for

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
