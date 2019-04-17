package com.herokuapp.theinternet.forgotpassword.tests;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.EmailSentPage;
import com.herokuapp.theinternet.pages.ForgotPasswordPage;
import com.herokuapp.theinternet.pages.HomePage;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordTests extends BaseTest {

	@Test
	public void forgotPwdTest() {

		// open home page
		HomePage homePage = new HomePage(driver);
		homePage.open();

		// navigate to forgot poassword link
		System.out.println("Wait is over bro...");
		ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();

		// wait for 'Forgot Pwd Page' to load
		forgotPasswordPage.waitForForgotPasswordPageToLoad();

		// execute forgot pwd steps
		EmailSentPage emailSentPage = forgotPasswordPage.executeRetrievePassword("myEmailAddress@abc.com");

		// wait for page to load
		emailSentPage.waitForEmailSentPageToLoad();

		// get validation text
		String text = emailSentPage.getMessageText();
		System.out.println(this.getClass().getName() + " - text = " + text);

		Assert.assertTrue(text.contains("Your e-mail's been sent!"),
				"Validation failed post clicking on 'Retrieve password' btn.");

		sleep();

	}

}
