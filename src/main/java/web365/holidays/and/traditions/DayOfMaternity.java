package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.DayOfMaternityConstants.*;
public class DayOfMaternity extends HolidaysAndTraditions {

	public DayOfMaternity(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = DAY_OF_MATERNITY_AND_BEAUTY_XPATH)
	public WebElement dayOfMaternity;
	
	@FindBy(xpath = DAY_OF_MATERNITY_AND_BEAUTY_IMAGE_XPATH)
	public WebElement dayOfMaternityImg;

	public DayOfMaternity goToDayOfMaternity() {
		moveToElement(dayOfMaternity);
		return new DayOfMaternity(this.driver);
	}
}
