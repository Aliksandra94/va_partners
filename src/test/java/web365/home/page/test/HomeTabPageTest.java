package web365.home.page.test;

import org.testng.Assert;




import org.testng.annotations.Test;

import web365.about.us.AboutUs;
import web365.base.page.test.BasePageTest;
import web365.contacts.Contacts;
import web365.destination.page.Outgoing;
import web365.gallery.Gallery;
import web365.general.information.GeneralInformation;
import web365.history.and.culture.HistoryAndCulture;
import web365.holidays.and.traditions.HolidaysAndTraditions;
import web365.home.page.ArmeniaMenuPage;
import web365.home.page.HomeTabPage;
import web365.hotels.in.yerevan.HotelsInYerevan;
import web365.incoming.page.IncomingTours;
import web365.museums.Museums;
import web365.tours.and.excursions.ToursAndExcursions;
public class HomeTabPageTest extends BasePageTest {
	
	@Test
	public void destinationTabTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		

		System.out.println("Destination Page - Outgoing Tours page is displayed");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void travelToArmeniaTabTest () throws InterruptedException {

		System.out.println("1. Open Home page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2 Click on Travel To Armenia button");
		IncomingTours inc = home.goToIncomingTours();
		Assert.assertTrue(inc.incomingTours.isDisplayed());
		Thread.sleep(2000);
}
	
	
	
	@Test
	public void armeniaTabGenInfTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		armMenu.goToGenInf();
		
        GeneralInformation genInf = new GeneralInformation(driver);
	    Assert.assertTrue(genInf.aboutArmHead.isDisplayed());
	    Thread.sleep(2000);
	
	}
	
	@Test
	public void armeniaTabHistoryTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HistoryAndCulture menuTab = new HistoryAndCulture(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.armTab.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToHistoryCulture();
		Assert.assertTrue(menuTab.historyCultureHead.isDisplayed());
	}
	
	
	
	@Test
	public void armeniaTabHolidaysTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HolidaysAndTraditions menuTab = new HolidaysAndTraditions(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.armTab.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToHolidaysTraditions();
		Assert.assertTrue(menuTab.holidaysTraditionsHead.isDisplayed());
	}
	
	
	@Test
	public void armeniaTabExcursionsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ToursAndExcursions menuTab = new ToursAndExcursions(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		menuTab.goToToursExcursions();
		Assert.assertTrue(menuTab.toursExcursionsHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void armeniaTabHotelsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HotelsInYerevan menuTab = new HotelsInYerevan(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.armTab.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToHotelInYerevan();
		Assert.assertTrue(menuTab.hotelInYerevanHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test 
	public void armeniaTabMuseumTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Museums menuTab = new Museums(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.armTab.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToMuseum();
		Thread.sleep(3000);
		Assert.assertTrue(menuTab.museumHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void armeniaTabGalleryTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Gallery menuTab = new Gallery(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Gallery button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.gallery.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToGallery();
		Assert.assertTrue(menuTab.Gallery1.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void armeniaTabAboutTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		AboutUs menuTab = new AboutUs(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to About Us button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.aboutUs.isDisplayed());
		Thread.sleep(2000);
		
		menuTab.goToAboutUs();
		Assert.assertTrue(menuTab.aboutStory.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void armeniaTabContactsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Contacts menuTab = new Contacts(driver);
		Assert.assertTrue(menuTab.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		menuTab.goToArmenia();
		Assert.assertTrue(menuTab.cont.isDisplayed());
		Thread.sleep(2000);
		menuTab.goToCont();
		Assert.assertTrue(menuTab.contInf.isDisplayed());
		Thread.sleep(2000);
	
}
}
