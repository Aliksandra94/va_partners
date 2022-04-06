package web365.history.and.culture;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.history.and.culture.HistoryAndCultureConstants. *;
public class HistoryAndCulture extends HomeTabPage {

	public HistoryAndCulture(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = HISTORY_AND_CULTURE_HEADER_XPATH)
	public WebElement historyCultureHead;
	
}
