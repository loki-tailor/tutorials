package com.herokuapp.theinternet.login.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.LoginPage;

public class NegativeLoginTests extends BaseTest {

	@Test(priority = 1)
	public void negativeLoginTestInvalidUsrName() {

		// navigate to login page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();

		// execute negative login
		loginPage.negativeLogIn("incorrectUserName", "SuperSeceretPassword!");

		// wait for error message
		loginPage.waitForErrorMessage();

		String text = loginPage.getErrorMessageText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("Your username is invalid!"),
				"Post loging with invalid username text validation FAILED.");
		sleep();

	}

	@Test(priority = 2)
	public void negativeLoginTestInvalidPwd() {

		// navigate to login page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();

		// execute -ve login journey
		loginPage.negativeLogIn("tomsmith", "invalidpassword");

		// wait for error message to appear
		loginPage.waitForErrorMessage();

		// fetch error message and validate
		String text = loginPage.getErrorMessageText();
		System.out.println(this.getClass().getName() + " - text = " + text);
		Assert.assertTrue(text.contains("Your password is invalid!"),
				"Post loging with invalid password text validation FAILED.");
		sleep();

	}

}
