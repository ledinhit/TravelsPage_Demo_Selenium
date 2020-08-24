package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTravelsPage {

	WebDriver driver;

	// Home page
	/*
	 * được tìm kiếm mỗi lần sử dụng
	 * 
	 * @CacheLookup timf một lần rồi sử dụng
	 */
	@FindBy(name = "username")
	WebElement userEmail;
	@FindBy(name = "password")
	WebElement userPass;
	@FindBy(name = "//button[contains(text(),'Login')]")
	WebElement btnHomeLogin;

	// Admin page
	@FindBy(name = "email")
	WebElement adminEmail;
	@FindBy(name = "password")
	WebElement adminPass;
	@FindBy(name = "//span[contains(text(),'Login')]")
	WebElement btnAdminLogin;
	/*
	 * LoginPage: Nơi chứa các những gì thuộc về LoginPage ví như: các element,
	 * function login.
	 */

	/*
	 * Cái class này hàm khởi tạo Object (constructor) có 1 tham số chính là driver.
	 * Nếu không có tham số này sẽ báo lỗi.
	 */
	public LoginTravelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void LoginHomePage(String email, String pass) {
		userEmail.sendKeys(email);
		userPass.sendKeys(pass);
		btnHomeLogin.click();

	}

	@Test
	public void LoginAdminPage(String email, String pass) {
		adminEmail.sendKeys(email);
		adminPass.sendKeys(pass);
		btnAdminLogin.click();

	}

}
