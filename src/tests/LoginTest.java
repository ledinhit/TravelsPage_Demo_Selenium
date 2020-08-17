package tests;

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

	// @Test
	/*
	 * public void loginWithEmailEmpty() { loginPg.Login("", "123456"); // String
	 * emailErrMes = // driver.findElement(By.xpath('//*[contains(@xpath,"1")]'));
	 * // System.out.println("title web: "+title); //
	 * assertEquals("An email address required.");
	 * 
	 * }
	 * 
	 * @Test public void LoginWithPassEmpty() {
	 * loginPg.Login("ledinh.94d@gmail.com", "");
	 * 
	 * }
	 * 
	 * @Test public void LoginWithBlankField() { //loginPg.Login("", "");
	 * 
	 * }
	 */
}
