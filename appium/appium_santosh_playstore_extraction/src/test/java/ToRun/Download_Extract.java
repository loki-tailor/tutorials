package ToRun;

import java.io.FileInputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import Check_Down_Extract_Utilities.ExtractionReadWrite;
import Final.Extraction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.MobileCapabilityType;

public class Download_Extract {
	public static AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	XSSFCell cell;
	Properties obj;
	static FileInputStream fis;
	String compatibility1 = null;
	float AppSize1 = 0;

	public static void main(String args[]) throws Exception {
		System.out.println("starting");
		ApkDownload();
	}

	public static void ApkDownload() throws Exception

	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.vending");
		capabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		capabilities.setCapability("newCommandTimeout", 200);
		// capabilities.setCapability("fullReset", "true");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\prop.properties");
		obj.load(objfile);
		int start = Integer.parseInt(obj.getProperty("start"));
		int end = Integer.parseInt(obj.getProperty("end"));
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Final.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("final");

		try {
			Runtime runtime1 = Runtime.getRuntime();
			Process process1 = runtime1.exec("adb shell pm clear com.android.vending");

			for (int i = start; i < end; i++)

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
				Thread.sleep(500);
				Boolean size = driver.findElements(By.id("com.android.vending:id/decide_bar")).size() > 0;
				String appSize = "not found";
//				if (size == true) {
////					MobileElement ele = driver.findElement(By.id("com.android.vending:id/decide_bar"));
////					MobileElement Siz_ele = ele.findElements(By.id("com.android.vending:id/subtitle_text")).get(1);
////					appSize = Siz_ele.getText();
//
//				}
//				System.out.println(appSize);

//				String[] stringsplite = appSize.split(" ", 2);
//				System.out.println(stringsplite[0]);
//				System.out.println(stringsplite[1]);
//
//				String num = stringsplite[0];
//				int sizenum = Integer.parseInt(num);
//				String mb = stringsplite[1];

				Boolean OutOfCountry = driver
						.findElements(By.xpath("//*[@text='This item is not available in your country.']")).size() > 0;
				Boolean itemnotfount = driver.findElements(By.xpath("//*[@text='Item not found.']")).size() > 0;
				Boolean notcompatible = driver.findElements(By.id("com.android.vending:id/warning_message_module"))
						.size() > 0;
				if (notcompatible == true) {
					System.out.println("Incompatible");
					ExtractionReadWrite.WriteExcel(value, "Incompatible");

				} else if (OutOfCountry == true) {
					ExtractionReadWrite.WriteExcel(value, "Not available in your county");

				} else if (itemnotfount == true) {
					ExtractionReadWrite.WriteExcel(value, "Not Found");
				}

//				else if (mb == "GB") {
//					ExtractionReadWrite.WriteExcel(value, appSize);
//				} else if (mb == "MB" && sizenum >= 100) {
//					ExtractionReadWrite.WriteExcel(value, appSize);
//				}

				else {

					Boolean install = driver.findElements(By.xpath("//*[@text='Install']")).size() > 0;
					if (install == true) {
						WebElement install1 = driver.findElement(By.className("android.widget.Button"));
						install1.click();
						System.out.println("clicked on install button");

						Boolean accpet = driver.findElements(By.xpath("//*[@text='ACCEPT']")).size() > 0;

						if (accpet == true)
						{

							WebElement accept = driver.findElement(By.xpath("//*[@text='ACCEPT']"));
							accept.click();
							System.out.println("clicked on accept button");
						}

						else {
							System.out.println("install button found but accept button not found");
						}
					}

					else {
						System.out.println("there is no install button, App has skipped");
					}

					Extraction.Apk(value);
				}

			}
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}
}