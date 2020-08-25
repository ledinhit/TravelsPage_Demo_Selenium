package pages;

import org.openqa.selenium.WebDriver;

import utilities.Links;

public class DashboardTravelsPage {
	WebDriver driver;

	public DashboardTravelsPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDisplayed() {
		if (Links.URL_ACCOUNT.equals(driver.getCurrentUrl())) {
			return true;
		} else {
			return false;
		}
	}
}
