package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.NationalArmyDayConstants.*;
public class NationalArmyDay extends HolidaysAndTraditions {

	public NationalArmyDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	
	}

	@FindBy(xpath = NATIONAL_ARMY_DAY_XPATH)
	public WebElement nationalArmyDay;
	
	@FindBy(xpath = NATIONAL_ARMY_IMAGE_XPATH)
	public WebElement nationalArmyImg;

	public NationalArmyDay goTonationalArmyDay() {
		moveToElement(nationalArmyDay);
		return new NationalArmyDay(this.driver);
		
	}
}
