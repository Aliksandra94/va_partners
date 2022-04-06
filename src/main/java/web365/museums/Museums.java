package web365.museums;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.museums.MuseumsConstants.*;
public class Museums extends HomeTabPage {

	public Museums(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(xpath = MUSEUM_HEADER_XPATH)
	public WebElement museumHead;
}
