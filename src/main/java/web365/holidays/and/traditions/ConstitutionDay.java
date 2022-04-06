package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.ConstitutionDayConstants.*;
public class ConstitutionDay extends HolidaysAndTraditions {

	public ConstitutionDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = CONSTITUTION_DAY_XPATH)
	public WebElement constitutionDay;
	
	@FindBy(xpath = CONSTITUTION_DAY_IMAGE_XPATH)
	public WebElement constitutionDayImg;

	public ConstitutionDay goToConstitutionDay() {
		moveToElement(constitutionDay);
		return new ConstitutionDay(this.driver);
		
	}

}
