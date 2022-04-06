package web365.tours.and.excursions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.tours.and.excursions.AshtarakConstants. *;
public class Ashtarak extends ToursAndExcursions{

	public Ashtarak(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	@FindBy(xpath = ASHTARAK_XPATH)
	public WebElement ashtarak;
	
	
	@FindBy(xpath = ARAGATS_XPATH)
	public WebElement aragats;
	
	@FindBy(xpath = ARAGATS_STORY_XPATH)
	public WebElement aragatsStory;
	
	@FindBy(xpath = ARAGATS_STORY_CLOSE_XPATH)
	public WebElement aragatsClose;
	
	
	@FindBy(xpath = KARMRAVOR_XPATH)
	public WebElement karmravor;
	
	@FindBy(xpath = KARMRAVOR_STORY_XPATH)
	public WebElement karmravorStory;
	
	@FindBy(xpath = KARMRAVOR_STORY_CLOSE_XPATH)
	public WebElement karmravorClose;
	
	
	@FindBy(xpath = AMBERD_XPAHT)
	public WebElement amberd;
	
	@FindBy(xpath = AMBERD_STORY_XPATH)
	public WebElement amberdStory;
	
	@FindBy(xpath = AMBERD_STORY_CLOSE_XPATH)
	public WebElement amberdClose;

	public Ashtarak goToAshtarak() {
		moveToElement (ashtarak);
		return new Ashtarak(this.driver);
		
	}

	public Ashtarak goToAragats() {
		moveToElement (aragats);
		return new Ashtarak(this.driver);
		
	}
	
	public Ashtarak goToAragatsClose() {
		moveToElement (aragatsClose);
		return new Ashtarak(this.driver);
    }
	
	public Ashtarak goToKarmravor() {
		moveToElement (karmravor);
		return new Ashtarak(this.driver);
    }
	
	public Ashtarak goToKarmravorClose() {
		moveToElement (karmravorClose);
		return new Ashtarak(this.driver);
	}
	
	public Ashtarak goToAmberd() {
		moveToElement (amberd);
		return new Ashtarak(this.driver);
	}
	
	public Ashtarak goToAmberdClose() {
		moveToElement (amberdClose);
		return new Ashtarak(this.driver);
	}
}
