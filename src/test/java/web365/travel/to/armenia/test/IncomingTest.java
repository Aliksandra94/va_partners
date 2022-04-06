package web365.travel.to.armenia.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
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
import web365.incoming.page.PetroglyphTour;
import web365.incoming.page.RecognizeArmenia;
import web365.incoming.page.UniqueArmenia;
import web365.incoming.page.VaccineTour;

public class IncomingTest extends BasePageTest {

	
	@Test
	public void ArmeniaAndGeorgia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ArmeniaAndGeorgia travelToArm = new ArmeniaAndGeorgia(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia and Georgia Tour - More button");
		travelToArm.goToMoreButton1();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void ArmeniaFairyTale() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ArmeniaFairyTale travelToArm = new ArmeniaFairyTale(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Fairy Tale more button");
		travelToArm.goToMoreButton2();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void CulturalTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		CulturalTour8Days travelToArm = new CulturalTour8Days(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cultural Tour 8 Days more button");
		travelToArm.goToMoreButton3();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void ArmeniaShortTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ArmeniaShort travelToArm = new ArmeniaShort(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Short Tour more button");
		travelToArm.goToMoreButton4();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void DiscoverArmeniaTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		DiscoverArmenia travelToArm = new DiscoverArmenia(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Discover Armenia Tour more button");
		travelToArm.goToMoreButton5();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}

	
	@Test
	public void ArmeniaGharanaghTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ArmeniaGharabagh travelToArm = new ArmeniaGharabagh(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Armenia Gharabagh Tour more button");
		travelToArm.goToMoreButton6();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void RecognizeArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		RecognizeArmenia travelToArm = new RecognizeArmenia(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Recognize Armenia Tour more button");
		travelToArm.goToMoreButton7();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}	
	
	@Test
	public void CulturalTour5Days() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		CulturalTours5Days travelToArm = new CulturalTours5Days(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cultural Tour 5 Days more button");
		travelToArm.goToMoreButton8();
		Thread.sleep(2000);
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void UniqueArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		UniqueArmenia travelToArm = new UniqueArmenia(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Unique Armenia with Safari Tour more button");
		travelToArm.goToMoreButton9();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void AntiquarianTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Antiquarian travelToArm = new Antiquarian(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Unique Armenia with Safari Tour more button");
		travelToArm.goToMoreButton10();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}

	
	@Test
	public void FamTrip() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		FamTrip travelToArm = new FamTrip(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Fam Trip  Tour more button");
		travelToArm.goToMoreButton11();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void ColorsOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ColorsOfArmenia travelToArm = new ColorsOfArmenia(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Colors of Armenia Tour more button");
		travelToArm.goToMoreButton12();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void Honeymoon() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Honeymoon travelToArm = new Honeymoon(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Honeymoon more button");
		travelToArm.goToMoreButton13();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void PetroglyphTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		PetroglyphTour travelToArm = new PetroglyphTour(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Petroglyph Tour more button");
		travelToArm.goToMoreButton14();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void VaccineTour() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		VaccineTour travelToArm = new VaccineTour(driver);
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Travel to Armenia button");
		travelToArm.goToIncomingTours();
		Assert.assertTrue(travelToArm.incomingTours.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Vaccine Tour To Armenia more button");
		travelToArm.goToMoreButton15();
		Assert.assertTrue(travelToArm.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		travelToArm.goToName();
		Thread.sleep(5000);
		travelToArm.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		travelToArm.goToPhone();
		Thread.sleep(2000);
		travelToArm.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		travelToArm.goToEmail();
		Thread.sleep(2000);
		travelToArm.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		travelToArm.goToMessage();
		Thread.sleep(2000);
		travelToArm.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		travelToArm.goToToOrder();
		Thread.sleep(2000);
	}



}


