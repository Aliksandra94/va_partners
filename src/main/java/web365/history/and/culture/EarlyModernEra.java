package web365.history.and.culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.history.and.culture.EarlyModernEraConstants.*;
public class EarlyModernEra extends HistoryAndCulture {

	public EarlyModernEra(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = EARLY_MODERN_ERA)
	public WebElement earlyModernEra;
	
	@FindBy(xpath = EARLY_MODERN_ERA_IMG)
	public WebElement earlyEraImg;

	public EarlyModernEra goToEarlyModernEra() {
		moveToElement(earlyModernEra);
		return new EarlyModernEra(this.driver);
		
	}
}
