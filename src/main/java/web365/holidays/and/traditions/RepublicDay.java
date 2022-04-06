package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.RepublicDayConstants.*;
public class RepublicDay extends HolidaysAndTraditions {

	public RepublicDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = DAY_OF_THE_FIRST_REPUBLIC_XPATH)
	public WebElement republic;
	
	@FindBy(xpath = DAY_OF_THE_FIRST_REPUBLIC_IMAGE_XPATH)
	public WebElement republicImg;

	public RepublicDay goToRepublic() {
		moveToElement(republic);
		return new RepublicDay(this.driver);
	}
}
