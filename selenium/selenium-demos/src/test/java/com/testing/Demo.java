package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.out.println("hello world");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_99.0.4844.51.exe");

        var driver = new ChromeDriver();
        driver.get("https://kitchen.applitools.com/ingredients/canvas");


        // driver.quit();
    }
}
