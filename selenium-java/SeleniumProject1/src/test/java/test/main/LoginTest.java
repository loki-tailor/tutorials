package test.main;

import test.main.base.BaseTest;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
	@Test
	public void loginTest() throws Exception
	{
		System.out.println("Hello TestNG");
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("Opened URL - http://demo.automationtesting.in/Register.html");
	}	
}