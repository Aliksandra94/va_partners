package web365.tours.and.excursions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.tours.and.excursions.GarniGeghardConstants. *;
public class GarniGeghard extends ToursAndExcursions {

	public GarniGeghard(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = GARNI_GEGHARD_XPATH)
	public WebElement garniGeghard;
	
	@FindBy(xpath = GARNI_TEMPLE_XPATH)
	public WebElement  garni;
	
	@FindBy(xpath = GARNI_TEMPLE_STORY_XPATH)
	public WebElement  garniStroy;
	
	@FindBy(xpath = GARNI_TEMPLE_STORY_CLOSE_XPATH)
	public WebElement  garniStoryClose;
	
	@FindBy(xpath = GEGHARD_MONASTERY_XPAHT)
	public WebElement  geghard;
	
	@FindBy(xpath = GEGHARD_MONASTERY_STORY_XPATH)
	public WebElement  geghardMon;
	
	@FindBy(xpath = GEGHARD_MONASTERY_STORY_CLOSE_XPATH)
	public WebElement  geghardMonClose;
	

}
