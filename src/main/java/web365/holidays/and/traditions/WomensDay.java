package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.WomensDayConstants.*;
public class WomensDay extends HolidaysAndTraditions {

	
	public WomensDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = WOMENS_DAY_XPATH)
	public WebElement womensDay;
	
	@FindBy(xpath = WOMENS_DAY_IMAGE_XPATH)
	public WebElement womensDayImg;

	public WomensDay goToWomensDay() {
		moveToElement(womensDay);
		return new WomensDay(this.driver);
		
	}
	
}
