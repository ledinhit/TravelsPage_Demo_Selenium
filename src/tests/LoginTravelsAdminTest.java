package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardTravelsPage;
import pages.LoginTravelsPage;

public class LoginTravelsAdminTest extends AdminTravelsBaseTest {
	LoginTravelsPage loginPg;
	DashboardTravelsPage dashoardPg;
	String alert = ".resultlogin>.alert>p"; // css
	String errMess = ".resultlogin>.alert"; // css
	/*
	 * String mailAdmin = "admin@phptravels.com"; String passAdmin = "demoadmin";
	 * String mailUser = "user@phptravels.com"; String passUser = "demouser";
	 */

// login Home page
	/*
	 * @Test public void loginWithCorrect() { loginPg = new
	 * LoginTravelsPage(driver); dashoardPg = new DashboardTravelsPage(driver);
	 * loginPg.LoginAdminPage("admin@phptravels.com", "demoadmin");
	 * driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 * System.out.println("TC_01 Link url: " + driver.getCurrentUrl());
	 * System.out.println("TC_01 Title: " + driver.getTitle()); //
	 * Assert.assertTrue(dashoardPg.isDisplayed()); }
	 * 
	 * @Test public void loginWithPassEmpty() { loginPg = new
	 * LoginTravelsPage(driver); loginPg.LoginAdminPage("admin@phptravels.com", "");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * Assert.assertEquals(loginPg.getHtml5MessPass(),
	 * "Please fill out this field.");
	 * 
	 * }
	 * 
	 * @Test public void LoginWithEmailEmpty() { loginPg = new
	 * LoginTravelsPage(driver); loginPg.LoginAdminPage("", "demoadmin");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * Assert.assertEquals(loginPg.getHtml5MessEmail(),
	 * "Please fill out this field."); }
	 * 
	 * @Test public void LoginWithBlankField() { loginPg = new
	 * LoginTravelsPage(driver); loginPg.LoginAdminPage("", "");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * Assert.assertEquals(loginPg.getHtml5MessEmail(),
	 * "Please fill out this field."); }
	 */
	@Test
	public void LoginWithEmailInCorrect() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginAdminPage("admin1@phptravels.com", "demoadmin");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String errorMess = driver.findElement(By.cssSelector(errMess)).getText();
		System.out.println(errorMess);
		Assert.assertEquals(errorMess, "Invalid Login Credentials");
	}

	@Test
	public void LoginWithPassInCorrect() {
		loginPg = new LoginTravelsPage(driver);
		loginPg.LoginAdminPage("admin@phptravels.com", "demoadmin1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String errorMess = driver.findElement(By.cssSelector(errMess)).getText();
		System.out.println(errorMess);
		Assert.assertEquals(errorMess, "Invalid Login Credentials");
	}

	/*
	 * @Test public void LoginWithEmailInvalid() { loginPg = new
	 * LoginTravelsPage(driver); loginPg.LoginAdminPage("adminphptravels.com",
	 * "demoadmin"); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * String errorMess = driver.findElement(By.cssSelector(alert)).getText();
	 * Assert.assertEquals(errorMess,
	 * "The Email field must contain a valid email address.");
	 * 
	 * }
	 */

}
