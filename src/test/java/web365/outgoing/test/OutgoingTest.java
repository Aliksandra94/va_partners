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
import web365.destination.page.RussiaOrder;
import web365.destination.page.SingaporeOrder;
import web365.destination.page.SpainOrder;
import web365.destination.page.SrilankaOrder;
import web365.destination.page.ThailandOrder;
import web365.destination.page.UaeOrder;
import web365.destination.page.UkrainOrder;

public class OutgoingTest extends BasePageTest {
	
	@Test
	public void outgoingTourUae() throws InterruptedException {

		System.out.println("1. Open Home Page");
		UaeOrder destination = new UaeOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on UAE - More button");
		destination.goToMoreButton1();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
}
	
	
	@Test
	public void outgoingTourJordan () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		JordanOrder destination = new JordanOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Jordan - More button");
		destination.goToMoreButton2();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourThailand () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		ThailandOrder destination = new ThailandOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Thailand - More button");
		destination.goToMoreButton3();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
		
	
	
	
	@Test
	public void outgoingTourSrilanka () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		SrilankaOrder destination = new SrilankaOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Srilanka - More button");
		destination.goToMoreButton4();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void outgoingTourIsrael () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		IsraelOrder destination = new IsraelOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Israel - More button");
		destination.goToMoreButton5();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	
	@Test
	public void outgoingTourGeorgia () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		GeorgiaOrder destination = new GeorgiaOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Georgia - More button");
		destination.goToMoreButton6();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourBulgaria () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		BulgariaOrder destination = new BulgariaOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Bulgaria - More button");
		destination.goToMoreButton7();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourItaly () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		ItalyOrder destination = new ItalyOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Italy - More button");
		destination.goToMoreButton8();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.gillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourGrecce () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		GrecceOrder destination = new GrecceOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Grecce - More button");
		destination.goToMoreButton9();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourCyprus () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		CyprusOrder destination = new CyprusOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Cyprus - More button");
		destination.goToMoreButton10();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourFrance () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		FranceOrder destination = new FranceOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on France - More button");
		destination.goToMoreButton11();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourNorway () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		NorwayOrder destination = new NorwayOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Norway - More button");
		destination.goToMoreButton12();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourCzech () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		CzechOrder destination = new CzechOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Czech Republic - More button");
		destination.goToMoreButton13();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourSpain () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		SpainOrder destination = new SpainOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Spain - More button");
		destination.goToMoreButton14();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void outgoingTourEgypt () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		EgyptOrder destination = new EgyptOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Egypt - More button");
		destination.goToMoreButton15();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourSingapore () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		SingaporeOrder destination = new SingaporeOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Singapore - More button");
		destination.goToMoreButton16();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourMaldives () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		MaldivesOrder destination = new MaldivesOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Maldives - More button");
		destination.goToMoreButton17();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourBali () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		BaliOrder destination = new BaliOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Bali - More button");
		destination.goToMoreButton18();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void outgoingTourRussia () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		RussiaOrder destination = new RussiaOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Russia - More button");
		destination.goToMoreButton19();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	
	@Test
	public void outgoingTourUkrain () throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		UkrainOrder destination = new UkrainOrder(driver);
		Assert.assertTrue(destination.destination.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Destination button");
		destination.goToDestination();
		Assert.assertTrue(destination.outgoing.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Ukrain - More button");
		destination.goToMoreButton20();
		Assert.assertTrue(destination.contForm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Name button and type Aliksandra");
		destination.goToName();
		Thread.sleep(5000);
		destination.fillName("name");
		Thread.sleep(2000);
		
		System.out.println("5. Click on Phone button and type phone number");
		destination.goToPhone();
		Thread.sleep(2000);
		destination.fillPhone("phoneNumber");
		Thread.sleep(2000);
		
		System.out.println("6. Click on email button and type emailAdress");
		destination.goToEmail();
		Thread.sleep(2000);
		destination.fillEmail("emailAdress");
		Thread.sleep(2000);
		
		System.out.println("7. Click on Message button and type Hello");
		destination.goToMessage();
		Thread.sleep(2000);
		destination.fillMessage("hello");
		Thread.sleep(2000);
		
		System.out.println("8. Click on To Order button");
		destination.goToToOrder();
		Thread.sleep(2000);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	