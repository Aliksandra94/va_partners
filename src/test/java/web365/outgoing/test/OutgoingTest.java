package web365.outgoing.test;

import org.testng.Assert;




import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.destination.page.BaliOrder;
import web365.destination.page.BulgariaOrder;
import web365.destination.page.CyprusOrder;
import web365.destination.page.CzechOrder;
import web365.destination.page.EgyptOrder;
import web365.destination.page.FranceOrder;
import web365.destination.page.GeorgiaOrder;
import web365.destination.page.GrecceOrder;
import web365.destination.page.IsraelOrder;
import web365.destination.page.ItalyOrder;
import web365.destination.page.JordanOrder;
import web365.destination.page.MaldivesOrder;
import web365.destination.page.NorwayOrder;
import web365.destination.page.Outgoing;
import web365.destination.page.RussiaOrder;
import web365.destination.page.SingaporeOrder;
import web365.destination.page.SpainOrder;
import web365.destination.page.SrilankaOrder;
import web365.destination.page.ThailandOrder;
import web365.destination.page.UaeOrder;
import web365.destination.page.UkrainOrder;
import web365.home.page.HomeTabPage;

public class OutgoingTest extends BasePageTest {
	
	@Test
	public void outgoingTourUae() throws InterruptedException {

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on UAE - More button");
		UaeOrder uae = new UaeOrder(driver);
		uae.goToMoreButton1();
		Assert.assertTrue(uae.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		uae.goToName();
		Thread.sleep(5000);
		uae.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		uae.goToPhone();
		Thread.sleep(2000);
		uae.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		uae.goToEmail();
		Thread.sleep(2000);
		uae.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		uae.goToMessage();
		Thread.sleep(2000);
		uae.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		uae.goToToOrder();
		Thread.sleep(2000);
}
	
	
	@Test
	public void outgoingTourJordan () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Jordan - More button");
		JordanOrder jordan = new JordanOrder(driver);
		jordan.goToMoreButton2();
		Assert.assertTrue(jordan.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		jordan.goToName();
		Thread.sleep(5000);
		jordan.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		jordan.goToPhone();
		Thread.sleep(2000);
		jordan.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		jordan.goToEmail();
		Thread.sleep(2000);
		jordan.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		jordan.goToMessage();
		Thread.sleep(2000);
		jordan.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		jordan.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourThailand () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);			
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Thailand - More button");
		ThailandOrder thailand = new ThailandOrder(driver);
		thailand.goToMoreButton3();
		Assert.assertTrue(thailand.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		thailand.goToName();
		Thread.sleep(5000);
		thailand.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		thailand.goToPhone();
		Thread.sleep(2000);
		thailand.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		thailand.goToEmail();
		Thread.sleep(2000);
		thailand.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		thailand.goToMessage();
		Thread.sleep(2000);
		thailand.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		thailand.goToToOrder();
		Thread.sleep(2000);
	}
		
	
	
	
	@Test
	public void outgoingTourSrilanka () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);			
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Srilanka - More button");
		SrilankaOrder srilanka = new SrilankaOrder(driver);
		srilanka.goToMoreButton4();
		Assert.assertTrue(srilanka.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		srilanka.goToName();
		Thread.sleep(5000);
		srilanka.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		srilanka.goToPhone();
		Thread.sleep(2000);
		srilanka.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		srilanka.goToEmail();
		Thread.sleep(2000);
		srilanka.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		srilanka.goToMessage();
		Thread.sleep(2000);
		srilanka.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		srilanka.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void outgoingTourIsrael () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Israel - More button");
		IsraelOrder israel = new IsraelOrder(driver);
		israel.goToMoreButton5();
		Assert.assertTrue(israel.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		israel.goToName();
		Thread.sleep(5000);
		israel.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		israel.goToPhone();
		Thread.sleep(2000);
		israel.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		israel.goToEmail();
		Thread.sleep(2000);
		israel.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		israel.goToMessage();
		Thread.sleep(2000);
		israel.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		israel.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	
	@Test
	public void outgoingTourGeorgia () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Georgia - More button");
		GeorgiaOrder georgia = new GeorgiaOrder(driver);
		georgia.goToMoreButton6();
		Assert.assertTrue(georgia.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		georgia.goToName();
		Thread.sleep(5000);
		georgia.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		georgia.goToPhone();
		Thread.sleep(2000);
		georgia.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		georgia.goToEmail();
		Thread.sleep(2000);
		georgia.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		georgia.goToMessage();
		Thread.sleep(2000);
		georgia.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		georgia.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourBulgaria () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Bulgaria - More button");
		BulgariaOrder bulgaria = new BulgariaOrder(driver);
		bulgaria.goToMoreButton7();
		Assert.assertTrue(bulgaria.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		bulgaria.goToName();
		Thread.sleep(5000);
		bulgaria.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		bulgaria.goToPhone();
		Thread.sleep(2000);
		bulgaria.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		bulgaria.goToEmail();
		Thread.sleep(2000);
		bulgaria.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		bulgaria.goToMessage();
		Thread.sleep(2000);
		bulgaria.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		bulgaria.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourItaly () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Italy - More button");
		ItalyOrder italy = new ItalyOrder(driver);
		italy.goToMoreButton8();
		Assert.assertTrue(italy.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		italy.goToName();
		Thread.sleep(5000);
		italy.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		italy.goToPhone();
		Thread.sleep(2000);
		italy.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		italy.goToEmail();
		Thread.sleep(2000);
		italy.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		italy.goToMessage();
		Thread.sleep(2000);
		italy.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		italy.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourGrecce () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Grecce - More button");
		GrecceOrder grecce = new GrecceOrder(driver);
		grecce.goToMoreButton9();
		Assert.assertTrue(grecce.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		grecce.goToName();
		Thread.sleep(5000);
		grecce.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		grecce.goToPhone();
		Thread.sleep(2000);
		grecce.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		grecce.goToEmail();
		Thread.sleep(2000);
		grecce.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		grecce.goToMessage();
		Thread.sleep(2000);
		grecce.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		grecce.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourCyprus () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cyprus - More button");
		CyprusOrder cyprus = new CyprusOrder(driver);
		cyprus.goToMoreButton10();
		Assert.assertTrue(cyprus.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		cyprus.goToName();
		Thread.sleep(5000);
		cyprus.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		cyprus.goToPhone();
		Thread.sleep(2000);
		cyprus.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		cyprus.goToEmail();
		Thread.sleep(2000);
		cyprus.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		cyprus.goToMessage();
		Thread.sleep(2000);
		cyprus.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		cyprus.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourFrance () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on France - More button");
		FranceOrder france = new FranceOrder(driver);
		france.goToMoreButton11();
		Assert.assertTrue(france.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		france.goToName();
		Thread.sleep(5000);
		france.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		france.goToPhone();
		Thread.sleep(2000);
		france.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		france.goToEmail();
		Thread.sleep(2000);
		france.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		france.goToMessage();
		Thread.sleep(2000);
		france.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		france.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourNorway () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Norway - More button");
		NorwayOrder norway = new NorwayOrder(driver);
		norway.goToMoreButton12();
		Assert.assertTrue(norway.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		norway.goToName();
		Thread.sleep(5000);
		norway.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		norway.goToPhone();
		Thread.sleep(2000);
		norway.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		norway.goToEmail();
		Thread.sleep(2000);
		norway.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		norway.goToMessage();
		Thread.sleep(2000);
		norway.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		norway.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourCzech () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Czech Republic - More button");
		CzechOrder czech = new CzechOrder(driver);
		czech.goToMoreButton13();
		Assert.assertTrue(czech.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		czech.goToName();
		Thread.sleep(5000);
		czech.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		czech.goToPhone();
		Thread.sleep(2000);
		czech.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		czech.goToEmail();
		Thread.sleep(2000);
		czech.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		czech.goToMessage();
		Thread.sleep(2000);
		czech.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		czech.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourSpain () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Spain - More button");
		SpainOrder spain = new SpainOrder(driver);
		spain.goToMoreButton14();
		Assert.assertTrue(spain.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		spain.goToName();
		Thread.sleep(5000);
		spain.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		spain.goToPhone();
		Thread.sleep(2000);
		spain.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		spain.goToEmail();
		Thread.sleep(2000);
		spain.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		spain.goToMessage();
		Thread.sleep(2000);
		spain.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		spain.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourEgypt () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Egypt - More button");
		EgyptOrder egypt = new EgyptOrder(driver);
		egypt.goToMoreButton15();
		Assert.assertTrue(egypt.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		egypt.goToName();
		Thread.sleep(5000);
		egypt.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		egypt.goToPhone();
		Thread.sleep(2000);
		egypt.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		egypt.goToEmail();
		Thread.sleep(2000);
		egypt.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		egypt.goToMessage();
		Thread.sleep(2000);
		egypt.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		egypt.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourSingapore () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Singapore - More button");
		SingaporeOrder singapore = new SingaporeOrder(driver);
		singapore.goToMoreButton16();
		Assert.assertTrue(singapore.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		singapore.goToName();
		Thread.sleep(5000);
		singapore.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		singapore.goToPhone();
		Thread.sleep(2000);
		singapore.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		singapore.goToEmail();
		Thread.sleep(2000);
		singapore.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		singapore.goToMessage();
		Thread.sleep(2000);
		singapore.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		singapore.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourMaldives () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Maldives - More button");
		MaldivesOrder maldives = new MaldivesOrder(driver);
		maldives.goToMoreButton17();
		Assert.assertTrue(maldives.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		maldives.goToName();
		Thread.sleep(5000);
		maldives.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		maldives.goToPhone();
		Thread.sleep(2000);
		maldives.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		maldives.goToEmail();
		Thread.sleep(2000);
		maldives.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		maldives.goToMessage();
		Thread.sleep(2000);
		maldives.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		maldives.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourBali () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Bali - More button");
		BaliOrder bali = new BaliOrder(driver);
		bali.goToMoreButton18();
		Assert.assertTrue(bali.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		bali.goToName();
		Thread.sleep(5000);
		bali.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		bali.goToPhone();
		Thread.sleep(2000);
		bali.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		bali.goToEmail();
		Thread.sleep(2000);
		bali.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		bali.goToMessage();
		Thread.sleep(2000);
		bali.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		bali.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourRussia () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Russia - More button");
		RussiaOrder russia = new RussiaOrder(driver);
		russia.goToMoreButton19();
		Assert.assertTrue(russia.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		russia.goToName();
		Thread.sleep(5000);
		russia.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		russia.goToPhone();
		Thread.sleep(2000);
		russia.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		russia.goToEmail();
		Thread.sleep(2000);
		russia.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		russia.goToMessage();
		Thread.sleep(2000);
		russia.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		russia.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void outgoingTourUkrain () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		Outgoing outg =  home.goToDestination();
		Assert.assertTrue(outg.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Ukrain - More button");
		UkrainOrder ukrain = new UkrainOrder(driver);
		ukrain.goToMoreButton20();
		Assert.assertTrue(ukrain.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		ukrain.goToName();
		Thread.sleep(5000);
		ukrain.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		ukrain.goToPhone();
		Thread.sleep(2000);
		ukrain.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		ukrain.goToEmail();
		Thread.sleep(2000);
		ukrain.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		ukrain.goToMessage();
		Thread.sleep(2000);
		ukrain.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		ukrain.goToToOrder();
		Thread.sleep(2000);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	