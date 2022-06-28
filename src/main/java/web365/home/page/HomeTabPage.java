package web365.home.page;


import org.openqa.selenium.WebDriver;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.about.us.AboutUs;
import web365.base.page.BasePage;
import web365.contacts.Contacts;
import web365.destination.page.Outgoing;
import web365.gallery.Gallery;
import web365.hotels.in.yerevan.HotelsInYerevan;
import web365.incoming.page.IncomingTours;
import web365.museums.Museums;

import static web365.home.page.HomeTabPageConstants. *;

public class HomeTabPage extends BasePage {




	



	public HomeTabPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath= LOGO_XPATH)
	public WebElement logo;
	
	@FindBy(xpath = MENU_TAB_XPATH)
	public WebElement menuTabs;
	
	@FindBy(xpath= TRAVEL_TO_ARMENIA_XPATH)
	public WebElement travelArm; 
	
	@FindBy(xpath = DESTINATIONS_XPATH)
	public WebElement destination;
	
	@FindBy(xpath= ARMENIA_XPATH)	
	public WebElement armeniaBtn;
	
	@FindBy(xpath = ARMENIA_TAB_XPATH)
	public WebElement armTab;
	
	@FindBy(xpath = GENERAL_INFORMATION_XPATH)
	public WebElement genInf;
	
	@FindBy(xpath = HISTORY_AND_CULTURE_XPATH)
	public WebElement historyCulture;
	
	@FindBy(xpath = HOLIDAYS_AND_TRADITIONS_XPATH)
	public WebElement holidaysTraditions;
	
	@FindBy(xpath = TOURS_AND_EXCURSIONS_XPATH)
	public WebElement toursExcursions;
	
	@FindBy(xpath = HOTEL_IN_YEREVAN_XPATH)
	public WebElement  hotelInYerevan;

	@FindBy(xpath = MUSEUM_XPATH)
	public WebElement museum;
	
	@FindBy(xpath = GALLERY_XPATH)
	public WebElement gallery;
	
	@FindBy(xpath = ABOUT_US_XPATH)
	public WebElement aboutUs;
	
	@FindBy(xpath = CONTACTS_XPATH)
	public WebElement cont;

	@FindBy(xpath = LANGUAGES_XPATH)
	public WebElement lang;



	public HomeTabPage goToLogo() {
		moveToElement (logo);
		return new HomeTabPage (this.driver);
	}


	public Outgoing goToDestination() {
		moveToElement (destination);
		return new Outgoing (this.driver);
	}

	public IncomingTours goToIncomingTours() {
		moveToElement(travelArm);
		return new IncomingTours(this.driver);
	}
	


	public ArmeniaMenuPage goToArmenia() {
		moveToElement (armeniaBtn);
		return new ArmeniaMenuPage (this.driver);
		
	}


	public HotelsInYerevan goToHotelInYerevan() {
		moveToElement (hotelInYerevan);
		return new HotelsInYerevan (this.driver);
		
	}


	public Museums goToMuseum() {
        moveToElement (museum);
        return new Museums (this.driver);
	}


	public Gallery goToGallery() {
        moveToElement (gallery);
        return new Gallery (this.driver);
	}


	public AboutUs goToAboutUs() {
        moveToElement (aboutUs);
        return new AboutUs (this.driver);
	}


	public Contacts goToCont() {
		moveToElement (cont);
		return new Contacts (this.driver);
		
	}
	
	public ArmeniaMenuPage goToArmeniaBtn() {
		moveToElement(armeniaBtn);
		return new ArmeniaMenuPage(this.driver);
	}


	public ArmeniaMenuPage goToGenInf() {
		moveToElement(genInf);
		return new ArmeniaMenuPage(this.driver);
	}


	public Outgoing goToOutgoing() {
        moveToElement(destination);
		return new Outgoing(this.driver);
	}





	

	


	
		
	


		



}
	





	



