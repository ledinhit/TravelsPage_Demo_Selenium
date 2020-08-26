package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardTravelsPage;
import pages.LoginTravelsPage;

public class LoginTravelsHomeTest extends HomeTravelsBaseTest {
	LoginTravelsPage loginPg;
	DashboardTravelsPage dashoardPg;
	String alert = ".resultlogin>.alert";
	/*
	 * String mailAdmin = "admin@phptravels.com"; String passAdmin = "demoadmin";
	 * String mailUser = "user@phptravels.com"; String passUser = "demouser";
	 */

// login Home page
	@Test
	public void loginWithCorrect() {
		loginPg = new LoginTravelsPage(driver);
		dashoardPg = new DashboardTravelsPage(driver);
		loginPg.LoginHomePage("user@phptravels.com", "demouser");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("TC_01 Link url: " + driver.getCurrentUrl());
		System.out.println("TC_01 Title: " + driver.getTitle());
		// Assert.assertTrue(dashoardPg.isDisplayed());
	}

	@Test
	public void loginWithPassEmpty() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("user@phptravels.com", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String passErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_02 Messenger error: " + passErrMes);
		Assert.assertEquals(passErrMes, "Invalid Email or Password");

	}

	@Test
	public void LoginWithEmailEmpty() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("", "demouser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_03 Messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Invalid Email or Password");

	}

	@Test
	public void LoginWithBlankField() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String passErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_04 Messenger error : " + passErrMes);
		Assert.assertEquals(passErrMes, "Invalid Email or Password");

	}

	@Test
	public void LoginWithEmailInCorrect() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("ledinh.94@gmail.com", "demouser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String passErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_05 Messenger error : " + passErrMes);
		Assert.assertEquals(passErrMes, "Invalid Email or Password");

	}

	@Test
	public void LoginWithPassInCorrect() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("user@phptravels.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String passErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_06 Messenger error : " + passErrMes);
		Assert.assertEquals(passErrMes, "Invalid Email or Password");

	}

	@Test
	public void LoginWithEmailInvalid() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginHomePage("ledinh.94gmail.com", "demouser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(alert)).getText();
		System.out.println("TC_07 Messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Invalid Email or Password");

	}

}
