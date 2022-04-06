package web365.holidays.and.traditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.holidays.and.traditions.VictoryAndPeaceDayConstants.*;
public class VictoryAndPeaceDay extends HolidaysAndTraditions {

	public VictoryAndPeaceDay(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = VICTORY_AND_PEACE_DAY_XPATH)
	public WebElement victoryAndPeaceDay;
	
	@FindBy(xpath = VICTORY_AND_PEACE_DAY_IMAGE_XPATH)
	public WebElement victoryAndPeaceDayImg;

	public VictoryAndPeaceDay goToVictoryAndPeaceDay() {
		moveToElement(victoryAndPeaceDay);
		return new VictoryAndPeaceDay(this.driver);
		
	}
}
