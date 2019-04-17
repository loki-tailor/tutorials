package com.herokuapp.theinternet.login.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.HomePage;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;

public class PositiveLoginTests extends BaseTest {

	@Test(priority = 1)
	public void positiveLoginTest() {

		// Open Home Page
		HomePage homePage = new HomePage(driver);
		homePage.open();

		// navigate to login page
		LoginPage loginPage = homePage.clickFormAuthenticationLink();

		// Wait for login page to load
		loginPage.waitForLoginPageToLoad();

		// fill username and password and press enter
		SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");

		// wait for success message to load
		secureAreaPage.waitForSecureAreaPageToLoad();
		String text = secureAreaPage.getMessageText();

		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("You logged into a secure area!"), "Post loging text validation FAILED.");
		sleep();

	}

}
