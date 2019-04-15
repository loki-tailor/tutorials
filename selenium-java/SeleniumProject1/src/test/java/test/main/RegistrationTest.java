package test.main;

import test.main.base.BaseTest;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationTest extends BaseTest
{
	@Test
	public void loginTest() throws Exception
	{
		System.out.println("Hello TestNG");
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("Opened URL - http://demo.automationtesting.in/Register.html");

		String uniqueId = getTime();

		WebElement we_firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement we_lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement we_Address = driver.findElement(By.tagName("textarea"));
		WebElement we_email = driver.findElement(By.cssSelector("#eid > input"));
		WebElement we_phone = driver.findElement(By.xpath("//div[@class='form-group']/label[contains(text(),'Phone*')]/../div/input"));
		WebElement we_gender = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement we_hobbies_1 = driver.findElement(By.id("checkbox1"));
		WebElement we_hobbies_2 = driver.findElement(By.id("checkbox2"));
		WebElement we_password = driver.findElement(By.id("firstpassword"));
		WebElement we_passwordConfirm = driver.findElement(By.id("secondpassword"));	
		WebElement we_submitBtn = driver.findElement(By.id("submitbtn"));

		WebElement we_skills = driver.findElement(By.id("Skills"));
		Select select_skills = new Select(we_skills);

		WebElement we_country_click1 = driver.findElement(By.xpath("//select[@ng-model='country']"));
		WebElement we_country_click_india = driver.findElement(By.xpath("//*[@id='countries']/option[@value='India']"));

		WebElement we_dob_date = driver.findElement(By.id("yearbox"));
		Select select_doB_date = new Select(we_dob_date);

		WebElement we_dob_month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select_doB_month = new Select(we_dob_month);

		WebElement we_dob_day = driver.findElement(By.id("daybox"));
		Select select_doB_day = new Select(we_dob_day);

		/******* Performing Operations on the WebElements *****/

		we_firstName.sendKeys("FirstName-" + uniqueId);
		Thread.sleep(2000);

		we_lastName.sendKeys("LastName-" + uniqueId);
		Thread.sleep(2000);

		we_Address.sendKeys("Addres of this user having unique ID as - " + uniqueId);
		Thread.sleep(2000);

		we_email.sendKeys(uniqueId + "@dummy.com");
		Thread.sleep(2000);

		we_phone.sendKeys(uniqueId.substring(2));
		Thread.sleep(2000);

		we_gender.click();
		Thread.sleep(2000);

		we_hobbies_1.click();
		Thread.sleep(2000);

		we_hobbies_2.click();
		Thread.sleep(2000);

		WebElement we_languages_clk = driver.findElement(By.id("msdd"));		
		we_languages_clk.click();

		WebElement we_languages_eng = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
		we_languages_eng.click();
		Thread.sleep(2000);

		WebElement we_languages_hindi = driver.findElement(By.xpath("//a[contains(text(),'Hindi')]"));	
		we_languages_hindi.click();
		Thread.sleep(2000);

		select_skills.selectByIndex(5);
		Thread.sleep(2000);
		select_skills.selectByValue("CSS");
		Thread.sleep(2000);
		select_skills.selectByVisibleText("Java");
		Thread.sleep(2000);

		we_country_click1.click();
		we_country_click_india.click();

		WebElement we_selectCountry = driver.findElement(By.xpath("//span[@class='selection']/span"));
		we_selectCountry.click(); 

		WebElement we_selectCountry_searchFld = driver.findElement(By.className("select2-search__field"));
		we_selectCountry_searchFld.sendKeys("India");

		WebElement we_selectCountry_resultClk = driver.findElement(By.className("select2-results"));
		we_selectCountry_resultClk.click();

		select_doB_date.selectByValue("1994"); 
		select_doB_month.selectByIndex(9); 
		select_doB_day.selectByVisibleText("23"); 

		we_password.sendKeys("SuperSeceretPassword!1");
		Thread.sleep(2000);

		we_passwordConfirm.sendKeys("SuperSeceretPassword!1");
		Thread.sleep(2000);

		we_submitBtn.click();
		Thread.sleep(60000);
	}

	public String getTime()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyhhmmss");
		return dateFormat.format(new Date());
	}	
}