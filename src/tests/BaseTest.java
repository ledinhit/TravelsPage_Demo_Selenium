package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Links;

public class BaseTest {
	String linkSignIn = "login";// class
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(Links.URL);
		driver.findElement(By.className(linkSignIn)).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
