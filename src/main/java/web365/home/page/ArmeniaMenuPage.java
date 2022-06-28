package web365.home.page;

import org.openqa.selenium.WebDriver;


import web365.history.and.culture.HistoryAndCulture;
import web365.holidays.and.traditions.HolidaysAndTraditions;
import web365.tours.and.excursions.ToursAndExcursions;

public class ArmeniaMenuPage extends HomeTabPage {

	public ArmeniaMenuPage(WebDriver driver) {
		super(driver);
	}

	

	public ArmeniaMenuPage goToGenInf() {
		moveToElement (genInf);
		return new ArmeniaMenuPage (this.driver);
		
	}
	

	public HistoryAndCulture goToHistoryCulture() {
		moveToElement (historyCulture);
		return new HistoryAndCulture (this.driver);
		
		
	}


	public HolidaysAndTraditions goToHolidaysTraditions() {
		moveToElement (holidaysTraditions);
		return new HolidaysAndTraditions (this.driver);
		
	}

	public ToursAndExcursions goToToursExcursions() {
		moveToElement (toursExcursions);
		return new ToursAndExcursions (this.driver);
		
	}




	
}
