package web365.tours.and.excursions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.tours.and.excursions.ErevanCityTourConstants.*;
public class ErevanCityTour extends ToursAndExcursions {

	public ErevanCityTour(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = EREVAN_CITY_TOUR_IMAGE_XPATH)
	public WebElement  erevanCity;
	
	@FindBy(xpath = EREBUNI_MUSEUM_XPATH)
	public WebElement erebuni;
	
	@FindBy(xpath = EREBUNI_MUSEUM_STORY_XPATH)
	public WebElement erebuniStory;
	
	@FindBy(xpath = EREBUNI_STORY_CROSS_XPATH)
	public WebElement erebuniClose;
	
	@FindBy(xpath = TSITSERNAKABERD_XPATH)
	public WebElement tsitsernakaberd;
	
	@FindBy(xpath = TSITSERNAKABERD_STORY_XPATH)
	public WebElement tsitsernakStory;
	
	@FindBy(xpath = TSITSERNAKABERD_STORY_CROSS_XPATH)
	public WebElement tsitsernakClose;
	
	@FindBy(xpath = MATENADARAN_XPATH)
	public WebElement matenadaran;
	
	@FindBy(xpath = MATENADARAN_STORY_XPATH)
	public WebElement matenadaranStory;
	
	@FindBy(xpath = MATENADARAN_STORY_CROSS_XPATH)
	public WebElement matenadaranClose;

	

	
	public ErevanCityTour goToErevanCity() {
		moveToElement(erevanCity);
		return new ErevanCityTour(this.driver);
	}
	
	

	public ErevanCityTour goToErebuni() {
		moveToElement(erebuni);
		return new ErevanCityTour(this.driver);
	}

	public void goToErebuniStory() {
		moveToElement(erebuniStory);
	}
	
	public ErevanCityTour goToErebuniClose() {
		moveToElement(erebuniClose);
		return new ErevanCityTour(this.driver);
	}

	
	
	

	public ErevanCityTour goToTsitsernakaberd() {
		moveToElement(tsitsernakaberd);
		return new ErevanCityTour(this.driver);
	}

	public void goToTsitsernakStory () {
		moveToElement(tsitsernakStory);
	}

	public ErevanCityTour goToTsitsernakClose() {
		moveToElement(tsitsernakClose);
		return new ErevanCityTour(this.driver);
	}
	
	
	
	
	public ErevanCityTour goToMatenadaran() {
		moveToElement(matenadaran);
		return new ErevanCityTour(this.driver);
	}
	
	public ErevanCityTour goToMatenadaranStory() {
		moveToElement(matenadaranStory);
		return new ErevanCityTour(this.driver);
	}

	public ErevanCityTour goToMatenadaranClose() {
		moveToElement(matenadaranClose);
		return new ErevanCityTour(this.driver);
	}
	
}
