package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.herokuapp.theinternet.base.BasePageObject;

public class LoginPage extends BasePageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private String loginPageUrl = "http://the-internet.herokuapp.com/login";

	private By userNameLocator = By.id("username");
	private By passwordLocator = By.name("password");
	private By logInButnLocator = By.tagName("button");
	private By errMessageLocator = By.id("flash");

	public void open() {
		driver.get(loginPageUrl);
	}

	/** Wait for username field to be visible on the page */
	public void waitForLoginPageToLoad() {
		waitForVisibilityOf(userNameLocator, 5);
	}

	/** Execute positive log in */
	public SecureAreaPage logIn(String userName, String password) {
		enterUsernameAndPassword(userName, password);
		clickLogInButton();
		return new SecureAreaPage(driver);
	}

	/** Execute negative log in */
	public void negativeLogIn(String userName, String password) {
		enterUsernameAndPassword(userName, password);
		clickLogInButton();
		waitForErrorMessage();
	}

	/** Enter username and password on Login page */
	private void enterUsernameAndPassword(String userName, String password) {
		System.out.println("Entering username and password...");
		find(userNameLocator).sendKeys(userName);
		find(passwordLocator).sendKeys(password);
	}

	/** Click on login btn */
	private void clickLogInButton() {
		System.out.println("Clicking log in button");
		find(logInButnLocator).click();
	}

	/* Wait for error mesg to be visible on the page */
	public void waitForErrorMessage() {
		waitForVisibilityOf(errMessageLocator, 5);
	}

	public String getErrorMessageText() {
		return find(errMessageLocator).getText();
	}

}
