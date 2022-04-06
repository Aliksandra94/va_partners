package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.holidays.and.traditions.HolidaysAndTraditionsConstants.*;
public class HolidaysAndTraditions extends HomeTabPage {

	public HolidaysAndTraditions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


	@FindBy(xpath = HOLIDAYS_AND_TRADITIONS_HEADER_XPATH)
	public WebElement holidaysTraditionsHead;
}
