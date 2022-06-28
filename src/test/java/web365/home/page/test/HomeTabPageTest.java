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
		Thread.sleep(2000);
		
		System.out.println("3. Click on General Information button");
        GeneralInformation genInf = new GeneralInformation(driver);
        armMenu.goToGenInf();
	    Assert.assertTrue(genInf.aboutArmHead.isDisplayed());
	    Thread.sleep(2000);
	
	}
	
	@Test
	public void armeniaTabHistoryTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on History and Culture button");
		HistoryAndCulture history = new HistoryAndCulture(driver);
		history.goToHistoryAndCulture();
		Assert.assertTrue(history.historyCultureHead.isDisplayed());
	}
	
	
	
	@Test
	public void armeniaTabHolidaysTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = new HolidaysAndTraditions(driver);
		holidays.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
	}
	
	
	@Test
	public void armeniaTabExcursionsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		ToursAndExcursions toursExcursions = new ToursAndExcursions(driver);
		toursExcursions.goToToursExcursions();
		Assert.assertTrue(toursExcursions.toursExcursionsHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void armeniaTabHotelsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. click on Hotels in Yerevan button");
		HotelsInYerevan hotels = new HotelsInYerevan(driver);
		hotels.goToHotelInYerevan();
		Assert.assertTrue(hotels.hotelInYerevanHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test 
	public void armeniaTabMuseumTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Museum button");
		Museums museum = new Museums(driver);
		museum.goToMuseum();
		Assert.assertTrue(museum.museumHead.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void armeniaTabGalleryTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Gallery button");
		Gallery gallery = new Gallery(driver);
		gallery.goToGallery();
		Assert.assertTrue(gallery.Gallery1.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void armeniaTabAboutTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on About Us button");
		AboutUs aboutUs = home.goToAboutUs();
		Assert.assertTrue(aboutUs.aboutUs.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void armeniaTabContactsTest () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.menuTabs.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Move to Contacts button");
		Contacts armMenu = home.goToCont();
		Assert.assertTrue(armMenu.cont.isDisplayed());
		Thread.sleep(2000);
		
	
}
}
