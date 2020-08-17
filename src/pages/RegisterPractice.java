package pages;

import org.testng.annotations.Test;

import utilities.Links;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class RegisterPractice {
	WebDriver driver;
	String emailRegister = "email_create";
	String btnRegister ="Register";
	
  @Test
  public void Register() {
  }
  @BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(Links.URL);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
