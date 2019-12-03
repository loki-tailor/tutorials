package com.selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.file.MyFile;

public class SantoshAutomation {

    public static void main(String[] args) {

	HashMap<String, AppStatus> map = new HashMap<>();

	try {

	    System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 30);

	    for (String packageName : MyFile.readFileAsList("resources/packages.csv")) {
		driver.get("https://play.google.com/store/apps/details?id=" + packageName);
		String compability = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".KfiqCc + span")))).getText();
		

	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}

class AppStatus {
    public String packageName;
    public int size;
}
