package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.herokuapp.theinternet.base.BasePageObject;

public class SecureAreaPage extends BasePageObject {

	// this will not be visited directly
	// will get navigated here when there is a success login

	private By message = By.id("flash-messages");

	public SecureAreaPage(WebDriver driver) {
		super(driver);
	}

	/** Wait for message to be visible on the page */
	public void waitForSecureAreaPageToLoad() {
		waitForVisibilityOf(message, 5);
	}

	public String getMessageText() {
		return find(message).getText();
	}

}
