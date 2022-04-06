package web365.tours.and.excursions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.tours.and.excursions.EchmiadzinConstants. *;
public class Echmiadzin extends ToursAndExcursions {

	public Echmiadzin(WebDriver driver) {
		super(driver);
        this.driver = driver;
	}

	@FindBy(xpath = ECHMIADZIN_XPATH)
	public WebElement echmiadzin;
	
	
	@FindBy(xpath = ST_HRIPSIME_XPATH)
	public WebElement hripsime;
	
	@FindBy(xpath = ST_HRIPSIME_STORY_XPATH)
	public WebElement hripsimeStory;
	
	@FindBy(xpath = ST_HRIPSIME_STORY_CLOSE_XPATH)
	public WebElement hripsimeClose;
	
	
	@FindBy(xpath = ST_GAYANE_XPATH)
	public WebElement gayane;
	
	@FindBy(xpath = ST_GAYANE_STORY_XPATH)
	public WebElement gayaneStory;
	
	@FindBy(xpath = ST_GAYANE_STORY_CLOSE_XPATH)
	public WebElement gayaneClose;
	
	
	@FindBy(xpath = MOTHER_COTHERDRAL_XPATH)
	public WebElement mother;
	
	@FindBy(xpath = MOTHER_COTHERDRAL_STORY_XPATH)
	public WebElement motherStory;
	
	@FindBy(xpath = MOTHER_COTHERDRAL_STORY_CLOSE_XPATH)
	public WebElement motherClose;
	
	
	@FindBy(xpath = ZVARTNOTS_XPATH)
	public WebElement zvartnots;
	
	@FindBy(xpath = ZVARTNOTS_STORY_XPATH)
	public WebElement zvartnotsStory;
	
	@FindBy(xpath = ZVARTNOTS_STORY_CLOSE_XPATH)
	public WebElement zvartnotsClose;
	
	

	public Echmiadzin goToEchmiadzin() {
		moveToElement (echmiadzin);
		return new Echmiadzin(this.driver);
	}
	
	

	public Echmiadzin goToHripsime() {
		moveToElement (hripsime);
		return new Echmiadzin(this.driver);		
	}
	
	public void goToHripsimeStory() {
		moveToElement(hripsimeStory);
	}

	public Echmiadzin goToHripsimeClose() {
		moveToElement (hripsimeClose);
		return new Echmiadzin(this.driver);			
	}

	
	
	public Echmiadzin goToGayane() {
		moveToElement (gayane);
		return new Echmiadzin(this.driver);			
	}
	
	public void goToGayaneStory() {
		moveToElement(gayaneStory);
	}
	
	public Echmiadzin goToGayaneClose() {
		moveToElement (gayaneClose);
		return new Echmiadzin(this.driver);		
    }

	
	
	public Echmiadzin goToMother() {
		moveToElement (mother);
		return new Echmiadzin(this.driver);	
	}
	
	public void goToMotherStory() {
		moveToElement(motherStory);
	}

	public Echmiadzin goToMotherClose() {
		moveToElement (motherClose);
		return new Echmiadzin(this.driver);	
	}
	
	

	public Echmiadzin goToZvartnots() {
		moveToElement (zvartnots);
		return new Echmiadzin(this.driver);
	}
	
	public void goToZvartnotsStory() {
		moveToElement(zvartnotsStory);
	}

	public Echmiadzin goToZvartnotsClose() {
		moveToElement (zvartnotsClose);
		return new Echmiadzin(this.driver);
		
	}
}
