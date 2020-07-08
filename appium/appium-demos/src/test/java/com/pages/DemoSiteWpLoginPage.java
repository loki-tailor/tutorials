package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DemoSiteWpLoginPage {

	public DemoSiteWpLoginPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "user_login")
	WebElement user_login;

	@AndroidFindBy(id = "user_pass")
	WebElement user_pass;

	@AndroidFindBy(id = "wp-submit")
	WebElement wp_submit;

	String url = "http://demosite.center/wordpress/wp-login.php";

	public DemoSiteWpLoginPage openUrl(AndroidDriver<WebElement> driver) {
		driver.get(url);
		return this;
	}

	public void enter(String usr, String pwd) {
		try {
			user_login.sendKeys(usr);
			System.out.println("entered username");
			Thread.sleep(2000);

			user_pass.sendKeys(pwd);
			System.out.println("entered password");
			Thread.sleep(2000);

			wp_submit.click();
			System.out.println("clicked login button");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
