package web365.history.and.culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.history.and.culture.MiddleAgesConstants.*;
public class MiddleAges extends HistoryAndCulture {

	public MiddleAges(WebDriver driver) {
		super(driver);
	    this.driver = driver;
	}
	
	@FindBy(xpath = MIDDLE_AGES_BUTTON)
	public WebElement middleAges;
	
	@FindBy(xpath = MIDDLE_AGES_TEXT)
	public WebElement middleAgesText;

	public MiddleAges goToMiddleAges() {
	   moveToElement(middleAges);
	   return new MiddleAges(this.driver);
		
	}
}
