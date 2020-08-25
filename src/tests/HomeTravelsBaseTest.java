package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Links;

public class HomeTravelsBaseTest {
	String linkLogin = "Login";// xpath
	String dropdown = "//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']";
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(Links.URL_LOGIN_FRONT_END);
		driver.findElement(By.xpath(dropdown)).click();
		driver.findElement(By.linkText(linkLogin)).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
