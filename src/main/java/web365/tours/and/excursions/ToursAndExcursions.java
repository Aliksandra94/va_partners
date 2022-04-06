package web365.tours.and.excursions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static  web365.tours.and.excursions.ToursAndExcursionsConstants.*;
public class ToursAndExcursions extends HomeTabPage {

	public ToursAndExcursions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}




	@FindBy(xpath = TOURS_AND_EXCURSIONS_HEADER_XPATH)
	public WebElement toursExcursionsHead;




	public ToursAndExcursions goToToursExcursions() {
		moveToElement(toursExcursionsHead);
		return new ToursAndExcursions(this.driver);
		
	}


}
