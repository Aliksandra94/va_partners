package web365.holidays.and.traditions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.TraditionsConstants.*;
public class Traditions extends HolidaysAndTraditions {

	public Traditions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = TRADITIONS_XPATH)
	public WebElement traditions;
	
	@FindBy(xpath = TRADITIONS_IMAGE_XPATH)
	public WebElement traditionsImg;

	public Traditions goToTraditions() {
		moveToElement(traditions);
		return new Traditions(this.driver);
		
	}
}
