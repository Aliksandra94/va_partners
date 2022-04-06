package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.IndipendenceDayConstants.*;
public class IndipendenceDay extends HolidaysAndTraditions {

	public IndipendenceDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = INDEPENDENCE_DAY_XPATH)
	public WebElement independenceDay;
	
	@FindBy(xpath = INDEPENDENCE_DAY_IMAGE_XPATH)
	public WebElement independenceDayImg;

	public IndipendenceDay goToIndependenceDay() {
	     moveToElement(independenceDay);
	     return new IndipendenceDay(this.driver);
		
	}

}
