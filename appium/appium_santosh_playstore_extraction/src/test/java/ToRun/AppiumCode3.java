package ToRun;

import java.io.FileInputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Check_Down_Extract_Utilities.ExtractionReadWrite;
import Final.Extraction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumCode3 {
	public static AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	XSSFCell cell;
	Properties obj;
	static FileInputStream fis;
	float AppSize1 = 0;

	public static void main(String args[]) throws Exception {
		System.out.println("Downloading & Extraction Process Started");
		ApkDownload();
		System.out.println("Download & Extraction Process Completed");
	}

	public static void ApkDownload() throws Exception

	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.vending"); // playstore packeg
		capabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		// capabilities.setCapability("noReset", true);
		capabilities.setCapability("newCommandTimeout", 200);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + ("\\prop.properties"));
		obj.load(objfile);
		int start = Integer.parseInt(obj.getProperty("start"));
		int end = Integer.parseInt(obj.getProperty("end"));
		fis = new FileInputStream(System.getProperty("user.dir") + ("\\src\\Final.xlsx"));
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("final");

		

			for (int i = start; i < end; i++)

			{
				try
				{
				String value = sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(
						"-------------------------------------------------------------------------------------------------");
				System.out.println(i);
				System.out.println(value);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println("Time is -" + dtf.format(now));

				Runtime runtime = Runtime.getRuntime();
				Process process = runtime.exec(
						"adb shell am start -a android.intent.action.VIEW" + " -d 'market://details?id='" + value);
				Thread.sleep(5);
				String app_size = "";
				float size = 0;
				int j;
				MobileElement ele;
				MobileElement Siz_ele;
				String size_str = "";
				WebDriverWait wait = new WebDriverWait(driver, 30);
				Boolean textele = driver.findElementsById("com.android.vending:id/decide_bar").size() > 0;
				if (textele == true) {
					ele = driver.findElementById("com.android.vending:id/decide_bar");
					int textsize = ele.findElementsById("com.android.vending:id/subtitle_text").size();
					for (j = 0; j < textsize - 1; j++) {
						/*
						 * wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions
						 * .presenceOfElementLocated(By.id("com.android.vending:id/decide_bar")));
						 */

						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions
								.presenceOfElementLocated(By.id("com.android.vending:id/subtitle_text")));
						Siz_ele = ele.findElementsById("com.android.vending:id/subtitle_text").get(j);
						/*
						 * wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions
						 * .presenceOfElementLocated(By.id("com.android.vending:id/subtitle_text")));
						 */
						size_str = Siz_ele.getText();

						if ((size_str.contains("MB")) | (size_str.contains("GB")) | (size_str.contains("KB"))) {
							System.out.println("App size is " + size_str);
							try {
								int cutpos = size_str.length() - 2;
								String size_num = size_str.substring(0, cutpos);
								app_size = size_str.substring(cutpos);
								size = Float.parseFloat(size_num);
								// System.out.println(size);
								// System.out.println(app_size);

							} catch (Exception e) {
								String[] str_split = size_str.split(" ");
								String size_num = str_split[0];
								size = Float.parseFloat(size_num);
								// System.out.println(size);
								app_size = str_split[1];
								// System.out.println(app_size);
							}

						}

					}

					if (app_size.equalsIgnoreCase("GB")) {
						System.out.println("Big APK");
						ExtractionReadWrite.WriteExcel(value, "Big APK");
					} else if (app_size.equalsIgnoreCase("MB") && size >= 150) {
						System.out.println("Big APK");
						ExtractionReadWrite.WriteExcel(value, "Big APK");
					}

					else {

						Boolean install = driver.findElements(By.xpath("//*[@text='Install']")).size() > 0;

						if (install == true) {
							// WebElement install1 =
							// driver.findElement(By.className("android.widget.Button"));
							WebElement install1 = driver.findElement(By.xpath("//*[@text='Install']"));
							install1.click();
							System.out.println("clicked on install button");

							Boolean accpet = driver.findElements(By.xpath("//*[@text='ACCEPT']")).size() > 0;

							if (accpet == true) {

								WebElement accept = driver.findElement(By.xpath("//*[@text='ACCEPT']"));
								accept.click();
								System.out.println("clicked on accept button");
							}

							else {
								System.out.println("install button found but accept button not found");
							}
							Extraction.Apk(value);
						}

						else {
							Boolean notcompatible = driver
									.findElements(By.id("com.android.vending:id/warning_message_module")).size() > 0;
							Boolean incompatible = driver.findElements(By.id("com.android.vending:id/ribbon_content"))
									.size() > 0;
							if (notcompatible == true | incompatible == true)

							{
								System.out.println("Incompatible");
								ExtractionReadWrite.WriteExcel(value, "Incompatible");

							} else {
								Boolean OutOfCountry = driver
										.findElements(
												By.xpath("//*[@text='This item is not available in your country.']"))
										.size() > 0;
								if (OutOfCountry == true)

								{
									System.out.println("Not available in your county");
									ExtractionReadWrite.WriteExcel(value, "Not available in your county");

								}

							}
						}
					}

				} else {

					Boolean open = driver.findElements(By.xpath("//*[@text='Open']")).size() > 0;

					if (open == true)

					{
						System.out.println("App already Installed");
						Extraction.Apk(value);

					} else {
						Boolean itemnotfount = driver.findElements(By.id("com.android.vending:id/error_msg"))
								.size() > 0;
						if (itemnotfount == true)

						{
							String notfound = driver.findElement(By.id("com.android.vending:id/error_msg")).getText();
							System.out.println(notfound);
							ExtractionReadWrite.WriteExcel(value, "Not Found");
						} else {
							Boolean preregister = driver.findElements(By.xpath("//*[@text='Pre-Register']")).size() > 0;
							if (preregister == true)

							{
								System.out.println("Need Pre-Register");
								ExtractionReadWrite.WriteExcel(value, "Need Pre-Register");
							} else {
								Boolean cantinstall = driver.findElements(By.xpath("//*[@text='OK']")).size() > 0;
								if (cantinstall == true)

								{
									driver.findElement(By.xpath("//*[@text='OK']")).click();
									System.out.println("Can't install the app");
									ExtractionReadWrite.WriteExcel(value, "Install Failed");
								}
							}
						}
					}
				}
				}
				catch (Exception e) {
					e.printStackTrace();
		} 
			
			
			
			
		}

	}
}
