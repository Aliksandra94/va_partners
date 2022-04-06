package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.NewYearConstants.*;

public class NewYear extends HolidaysAndTraditions {

	public NewYear(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = NEW_YEAR_IMAGE_XPATH)
	public WebElement newYearImg;
}
