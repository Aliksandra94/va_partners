package web365.tours.and.excursions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.tours.and.excursions.OshakanConstants. *;
public class Oshakan extends ToursAndExcursions {

	public Oshakan(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	@FindBy(xpath = OSHAKAN_HOVANAVANK_XPATH)
	public WebElement oshakanHovhanavank;
	
	
	@FindBy(xpath = OSHAKAN_XPATH)
	public WebElement oshakan;
	
	@FindBy(xpath = OSHAKAN_STORY_XPATH)
	public WebElement oshakanStory;
	
	@FindBy(xpath = OSHAKAN_STORY_CLOSE_XPATH)
	public WebElement oshakanClose;
	
	
	@FindBy(xpath = KARMRAVOR_XPATH)
	public WebElement karmravor;
	
	@FindBy(xpath = KARMRAVOR_STORY_XPATH)
	public WebElement karmravorStory;
	
	@FindBy(xpath = KARMRAVOR_STORY_CLOSE_XPATH)
	public WebElement karmravor2Close;
	
	
	@FindBy(xpath = SAGHMOSAVANK_XPATHV)
	public WebElement saghmosavank;
	
	@FindBy(xpath = SAGHMOSAVANK_STORY_XPATH)
	public WebElement saghmosavankStory;
	
	@FindBy(xpath = SAGHMOSAVANK_STORY_CLOSE_XPATH)
	public WebElement saghmosavankClose;
	
	
	@FindBy(xpath = HOVHANAVANQ_XPATH)
	public WebElement hovhanavanq;
	
	@FindBy(xpath = HOVHANAVANQ_STORY_XPATH)
	public WebElement hovhanavanqStory;
	
	@FindBy(xpath = HOVHANAVANQ_SOTRY_CLOSE_XPATH)
	public WebElement hovhanavanqClose;

	public Oshakan goToOshakanHovhanavank() {
		moveToElement(oshakanHovhanavank);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToOshakan() {
		moveToElement(oshakan);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToOshakanClose() {
		moveToElement(oshakanClose);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToKarmravor() {
		moveToElement(karmravor);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToKarmravor2Close() {
		moveToElement(karmravor2Close);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToSaghmosavank() {
		moveToElement(saghmosavank);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToSaghmosavankClose() {
		moveToElement(saghmosavankClose);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToHovhanavanq() {
		moveToElement(hovhanavanq);
		return new Oshakan(this.driver);
	}
	
	public Oshakan goToHovhanavanqClose() {
		moveToElement(hovhanavanqClose);
		return new Oshakan(this.driver);
	}

}
