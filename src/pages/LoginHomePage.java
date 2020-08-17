package pages;

import org.testng.annotations.Test;

import utilities.Links;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginHomePage {
	WebDriver driver;
	String userEmail = "username";
	String userPass = "password";
	String btnLogin = "//button[@xpath='1']";
	String mailAdmin = "admin@phptravels.com";
	String passAdmin = "demoadmin";
	String mailUser = "user@phptravels.com";
	String passUser = "demouser";

	@Test
	public void LoginWithAdmin() {
		driver.findElement(By.name(userEmail)).sendKeys(mailAdmin);
		driver.findElement(By.name(userPass)).sendKeys(passAdmin);;
		driver.findElement(By.xpath(btnLogin)).click();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(Links.URL_LOGIN_FRONT_END);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
