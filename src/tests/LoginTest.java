package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPracticePage;

public class LoginTest extends BaseTest {
	LoginPracticePage loginPg;

	@Test
	public void loginWithCorrect() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "123456");
		String title = driver.getTitle();
		System.out.println("title web: " + title);
		Assert.assertEquals(title, "My account - My Store");
	}

	@Test

	public void loginWithEmailEmpty() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "An email address required.");

	}

	@Test
	public void LoginWithPassEmpty() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Password is required.");

	}

	@Test
	public void LoginWithBlankField() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("", "");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "An email address required.");
	}

	@Test
	public void LoginWithEmailInCorrect() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Authentication failed.");
	}

	@Test
	public void LoginWithPassInCorrect() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94@gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Authentication failed.");
	}

	@Test
	public void LoginWithEmailInvalid() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94gmail.com", "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Invalid email address.");
	}

	@Test
	// Pass Five characters minimum
	public void LoginWithPassInvalid() {
		loginPg = new LoginPracticePage(driver);
		loginPg.Login("ledinh.94d@gmail.com", "1234");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String emailErrMes = driver.findElement(By.cssSelector(".alert>ol>li")).getText();
		System.out.println("Email messenger error : " + emailErrMes);
		Assert.assertEquals(emailErrMes, "Invalid password.");
	}
}
