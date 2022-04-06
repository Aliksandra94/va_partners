package web365.history.and.culture;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.history.and.culture.WorldWar1AndGenocideConstants.*;
public class WorldWar1AndGenocide extends HistoryAndCulture {

	public WorldWar1AndGenocide(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = WORD_WAR_GENOCIDE)
	public WebElement worldWarGenocide;
	
	@FindBy(xpath = WAR_GENOCIDE_IMG)
	public WebElement warGenocideImg;

	public  WorldWar1AndGenocide goToWorldWarGenocide() {
		moveToElement(worldWarGenocide);
		return new WorldWar1AndGenocide(this.driver);
		
	}
}
