package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.herokuapp.theinternet.base.BasePageObject;

import net.bytebuddy.asm.Advice.Enter;

public class ForgotPasswordPage extends BasePageObject {

	private By emailFieldLocator = By.id("email");
	private By retrievePasswordBtnLocator = By.tagName("button");

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	/** wait for the retrieve password button to be visible on the page */
	public void waitForForgotPasswordPageToLoad() {
		waitForVisibilityOf(retrievePasswordBtnLocator, 5);
	}

	/** Execute Retrieve Password */
	public EmailSentPage executeRetrievePassword(String email) {
		find(emailFieldLocator).sendKeys(email);
		find(retrievePasswordBtnLocator).click();
		return new EmailSentPage(driver);
	}
}
