package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPracticePage {

	String emailLogin = "email";// id
	String btnLogin = "SubmitLogin"; // id
	String passLogin = "passwd";// id

	WebDriver driver;

	// Cái class này hàm khởi tạo Object (constructor) có 1 tham số chính là driver.
	// Nếu không có tham số này sẽ báo lỗi.
	public LoginPracticePage(WebDriver driver) {
		this.driver = driver;
	}

	public void Login(String email, String pass) {

		driver.findElement(By.id(emailLogin)).sendKeys(email);
		driver.findElement(By.id(passLogin)).sendKeys(pass);
		driver.findElement(By.id(btnLogin)).click();
	}

}
