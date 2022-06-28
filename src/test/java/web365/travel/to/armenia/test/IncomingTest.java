package web365.travel.to.armenia.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.home.page.HomeTabPage;
import web365.incoming.page.Antiquarian;
import web365.incoming.page.ArmeniaAndGeorgia;
import web365.incoming.page.ArmeniaFairyTale;
import web365.incoming.page.ArmeniaGharabagh;
import web365.incoming.page.ArmeniaShort;
import web365.incoming.page.ColorsOfArmenia;
import web365.incoming.page.CulturalTour8Days;
import web365.incoming.page.CulturalTours5Days;
import web365.incoming.page.DiscoverArmenia;
import web365.incoming.page.FamTrip;
import web365.incoming.page.Honeymoon;
import web365.incoming.page.IncomingTours;
import web365.incoming.page.PetroglyphTour;
import web365.incoming.page.RecognizeArmenia;
import web365.incoming.page.UniqueArmenia;
import web365.incoming.page.VaccineTour;

public class IncomingTest extends BasePageTest {

	
	@Test
	public void armeniaAndGeorgia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia and Georgia Tour - More button");
		ArmeniaAndGeorgia armGeorg = new ArmeniaAndGeorgia(driver);
		armGeorg.goToMoreButton1();
		Assert.assertTrue(armGeorg.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		armGeorg.goToName();
		Thread.sleep(5000);
		armGeorg.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		armGeorg.goToPhone();
		Thread.sleep(2000);
		armGeorg.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		armGeorg.goToEmail();
		Thread.sleep(2000);
		armGeorg.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		armGeorg.goToMessage();
		Thread.sleep(2000);
		armGeorg.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		armGeorg.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void armeniaFairyTale() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Fairy Tale more button");
		ArmeniaFairyTale fairyTale = new ArmeniaFairyTale(driver);
		fairyTale.goToMoreButton2();
		Assert.assertTrue(fairyTale.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		fairyTale.goToName();
		Thread.sleep(5000);
		fairyTale.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		fairyTale.goToPhone();
		Thread.sleep(2000);
		fairyTale.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		fairyTale.goToEmail();
		Thread.sleep(2000);
		fairyTale.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		fairyTale.goToMessage();
		Thread.sleep(2000);
		fairyTale.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		fairyTale.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void culturalTour8Days() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cultural Tour 8 Days more button");
		CulturalTour8Days cultural8 = new CulturalTour8Days(driver);
		cultural8.goToMoreButton3();
		Assert.assertTrue(cultural8.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		cultural8.goToName();
		Thread.sleep(5000);
		cultural8.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		cultural8.goToPhone();
		Thread.sleep(2000);
		cultural8.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		cultural8.goToEmail();
		Thread.sleep(2000);
		cultural8.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		cultural8.goToMessage();
		Thread.sleep(2000);
		cultural8.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		cultural8.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void armeniaShortTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Short Tour more button");
		ArmeniaShort armShort = new ArmeniaShort(driver);
		armShort.goToMoreButton4();
		Assert.assertTrue(armShort.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		armShort.goToName();
		Thread.sleep(5000);
		armShort.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		armShort.goToPhone();
		Thread.sleep(2000);
		armShort.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		armShort.goToEmail();
		Thread.sleep(2000);
		armShort.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		armShort.goToMessage();
		Thread.sleep(2000);
		armShort.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		armShort.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void discoverArmeniaTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Discover Armenia Tour more button");
		DiscoverArmenia discover = new DiscoverArmenia(driver);
		discover.goToMoreButton5();
		Assert.assertTrue(discover.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		discover.goToName();
		Thread.sleep(5000);
		discover.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		discover.goToPhone();
		Thread.sleep(2000);
		discover.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		discover.goToEmail();
		Thread.sleep(2000);
		discover.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		discover.goToMessage();
		Thread.sleep(2000);
		discover.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		discover.goToToOrder();
		Thread.sleep(2000);
	}

	
	@Test
	public void armeniaGharanaghTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Gharabagh Tour more button");
		ArmeniaGharabagh gharabagh = new ArmeniaGharabagh(driver);
		gharabagh.goToMoreButton6();
		Assert.assertTrue(gharabagh.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		gharabagh.goToName();
		Thread.sleep(5000);
		gharabagh.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		gharabagh.goToPhone();
		Thread.sleep(2000);
		gharabagh.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		gharabagh.goToEmail();
		Thread.sleep(2000);
		gharabagh.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		gharabagh.goToMessage();
		Thread.sleep(2000);
		gharabagh.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		gharabagh.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void recognizeArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Recognize Armenia Tour more button");
		RecognizeArmenia recognize = new RecognizeArmenia(driver);
		recognize.goToMoreButton7();
		Assert.assertTrue(recognize.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		recognize.goToName();
		Thread.sleep(5000);
		recognize.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		recognize.goToPhone();
		Thread.sleep(2000);
		recognize.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		recognize.goToEmail();
		Thread.sleep(2000);
		recognize.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		recognize.goToMessage();
		Thread.sleep(2000);
		recognize.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		recognize.goToToOrder();
		Thread.sleep(2000);
	}	
	
	@Test
	public void culturalTour5Days() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cultural Tour 5 Days more button");
		CulturalTours5Days cultural5 = new CulturalTours5Days(driver);
		cultural5.goToMoreButton8();
		Thread.sleep(2000);
		Assert.assertTrue(cultural5.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		cultural5.goToName();
		Thread.sleep(5000);
		cultural5.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		cultural5.goToPhone();
		Thread.sleep(2000);
		cultural5.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		cultural5.goToEmail();
		Thread.sleep(2000);
		cultural5.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		cultural5.goToMessage();
		Thread.sleep(2000);
		cultural5.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		cultural5.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void uniqueArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Unique Armenia with Safari Tour more button");
		UniqueArmenia unique = new UniqueArmenia(driver);
		unique.goToMoreButton9();
		Assert.assertTrue(unique.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		unique.goToName();
		Thread.sleep(5000);
		unique.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		unique.goToPhone();
		Thread.sleep(2000);
		unique.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		unique.goToEmail();
		Thread.sleep(2000);
		unique.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		unique.goToMessage();
		Thread.sleep(2000);
		unique.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		unique.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void antiquarianTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Unique Armenia with Safari Tour more button");
		Antiquarian antiquarian = new Antiquarian(driver);
		antiquarian.goToMoreButton10();
		Assert.assertTrue(antiquarian.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		antiquarian.goToName();
		Thread.sleep(5000);
		antiquarian.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		antiquarian.goToPhone();
		Thread.sleep(2000);
		antiquarian.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		antiquarian.goToEmail();
		Thread.sleep(2000);
		antiquarian.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		antiquarian.goToMessage();
		Thread.sleep(2000);
		antiquarian.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		antiquarian.goToToOrder();
		Thread.sleep(2000);
	}

	
	@Test
	public void famTrip() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Fam Trip  Tour more button");
		FamTrip fam = new FamTrip(driver);
		fam.goToMoreButton11();
		Assert.assertTrue(fam.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		fam.goToName();
		Thread.sleep(5000);
		fam.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		fam.goToPhone();
		Thread.sleep(2000);
		fam.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		fam.goToEmail();
		Thread.sleep(2000);
		fam.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		fam.goToMessage();
		Thread.sleep(2000);
		fam.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		fam.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void colorsOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Colors of Armenia Tour more button");
		ColorsOfArmenia colors = new ColorsOfArmenia(driver);
		colors.goToMoreButton12();
		Assert.assertTrue(colors.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		colors.goToName();
		Thread.sleep(5000);
		colors.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		colors.goToPhone();
		Thread.sleep(2000);
		colors.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		colors.goToEmail();
		Thread.sleep(2000);
		colors.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		colors.goToMessage();
		Thread.sleep(2000);
		colors.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		colors.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void honeymoon() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Honeymoon more button");
		Honeymoon honeymoon = new Honeymoon(driver);
		honeymoon.goToMoreButton13();
		Assert.assertTrue(honeymoon.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		honeymoon.goToName();
		Thread.sleep(5000);
		honeymoon.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		honeymoon.goToPhone();
		Thread.sleep(2000);
		honeymoon.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		honeymoon.goToEmail();
		Thread.sleep(2000);
		honeymoon.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		honeymoon.goToMessage();
		Thread.sleep(2000);
		honeymoon.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		honeymoon.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void petroglyphTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Petroglyph Tour more button");
		PetroglyphTour petroglyph = new PetroglyphTour(driver);
		petroglyph.goToMoreButton14();
		Assert.assertTrue(petroglyph.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		petroglyph.goToName();
		Thread.sleep(5000);
		petroglyph.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		petroglyph.goToPhone();
		Thread.sleep(2000);
		petroglyph.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		petroglyph.goToEmail();
		Thread.sleep(2000);
		petroglyph.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		petroglyph.goToMessage();
		Thread.sleep(2000);
		petroglyph.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		petroglyph.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void vaccineTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
	    HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.travelArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		IncomingTours incoming = home.goToIncomingTours();
		Assert.assertTrue(incoming.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Vaccine Tour To Armenia more button");
		VaccineTour vaccine = new VaccineTour(driver);
		vaccine.goToMoreButton15();
		Assert.assertTrue(vaccine.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		vaccine.goToName();
		Thread.sleep(5000);
		vaccine.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		vaccine.goToPhone();
		Thread.sleep(2000);
		vaccine.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		vaccine.goToEmail();
		Thread.sleep(2000);
		vaccine.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		vaccine.goToMessage();
		Thread.sleep(2000);
		vaccine.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		vaccine.goToToOrder();
		Thread.sleep(2000);
	}



}


