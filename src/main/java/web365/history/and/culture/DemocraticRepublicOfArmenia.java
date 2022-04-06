package web365.history.and.culture;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.history.and.culture.DemocraticRepublicOfArmeniaConstants.*;
public class DemocraticRepublicOfArmenia extends HistoryAndCulture {

	public DemocraticRepublicOfArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_OF_ARMENIA)
	public WebElement dra;
	
	@FindBy(xpath = DEMOCRATIC_REPUBLIC_IMAGE)
	public WebElement republicImg;

	public DemocraticRepublicOfArmenia goToDra() {
		moveToElement(dra);
		return new DemocraticRepublicOfArmenia(this.driver);
		
	}
}
