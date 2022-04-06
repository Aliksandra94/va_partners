package web365.tours.and.excursions;


import org.testng.Assert;
import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.home.page.ArmeniaMenuPage;
import web365.home.page.HomeTabPage;

public class ToursAndExcursionsTest extends BasePageTest {

	@Test 
	public void erevanCity() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		ErevanCityTour erevanPage = new ErevanCityTour(driver);
		Assert.assertTrue(erevanPage.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		
}
	
	@Test 
	public void erebuniMuseum() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity.goToErevanCity();
		Assert.assertTrue(erevanCity.erebuni.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Erebuni Museum button");
		erevanCity.goToErebuni();
		Thread.sleep(2000);
		Assert.assertTrue(erevanCity.erebuniStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Erebuni cross button");
		erevanCity.goToErebuniClose();
		Thread.sleep(2000);
		
		

	}
	
	@Test
	public void tsitsernakaberd() throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity.goToErevanCity();
		Assert.assertTrue(erevanCity.tsitsernakaberd.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Tsitsernakaberd button");
		erevanCity.goToTsitsernakaberd();
		Thread.sleep(2000);
		Assert.assertTrue(erevanCity.tsitsernakStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Tsitsernakaberd cross button");
		erevanCity.goToTsitsernakClose();
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void matenadaran () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity.goToErevanCity();
		Assert.assertTrue(erevanCity.matenadaran.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Matenadaran button");
		erevanCity.goToMatenadaran();
		Thread.sleep(4000);
		Assert.assertTrue(erevanCity.matenadaranStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Matenadaran cross button");
		erevanCity.goToMatenadaranClose();
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void echmiadzin() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);		
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		
	}
	
	
	@Test
	public void stHripsime () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin.goToEchmiadzin();
		Assert.assertTrue(echmiadzin.hripsime.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on St. Hripsime button");
		echmiadzin.goToHripsime();
		Thread.sleep(4000);
		Assert.assertTrue(echmiadzin.hripsimeStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on St.Hripsime cross button");
		echmiadzin.goToHripsimeClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void stGayane () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin.goToEchmiadzin();
		Assert.assertTrue(echmiadzin.gayane.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on St. Gayane button");
		echmiadzin.goToGayane();
		Thread.sleep(4000);
		Assert.assertTrue(echmiadzin.gayaneStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on St. Gayane cross button");
		echmiadzin.goToGayaneClose();
		Thread.sleep(2000);
		
}
	
	
	
	@Test
	public void motherCathedral () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();	
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin.goToEchmiadzin();
		Assert.assertTrue(echmiadzin.mother.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Mother Cathedral button");
		echmiadzin.goToMother();
		Thread.sleep(4000);
		Assert.assertTrue(echmiadzin.motherStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Mother Cathedral cross button");
		echmiadzin.goToMotherClose();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void zvartnots () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin.goToEchmiadzin();
		Assert.assertTrue(echmiadzin.zvartnots.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Mother Cathedral button");
		echmiadzin.goToZvartnots();
		Thread.sleep(4000);
		Assert.assertTrue(echmiadzin.zvartnotsStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Mother Cathedral cross button");
		echmiadzin.goToMotherClose();
		Thread.sleep(2000);
	}
	
	@Test 
	public void ashtarak() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmenia();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Ashtarak ashtarak = new Ashtarak(driver);
		Assert.assertTrue(ashtarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void aragats () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Ashtarak ashatarak = new Ashtarak(driver);
		Assert.assertTrue(ashatarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Ashtarak button");
		ashatarak.goToAshtarak();
		Assert.assertTrue(ashatarak.aragats.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Aragats button");
		ashatarak.goToAragats();
		Thread.sleep(4000);
		Assert.assertTrue(ashatarak.aragatsStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Aragats cross button");
		ashatarak.goToAragatsClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void karmravor () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Ashtarak ashtarak = new Ashtarak(driver);
		Assert.assertTrue(ashtarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Ashtarak button");
		ashtarak.goToAshtarak();
		Assert.assertTrue(ashtarak.karmravor.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Karmravor button");
		ashtarak.goToKarmravor();
		Thread.sleep(4000);
		Assert.assertTrue(ashtarak.karmravorStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Aragats cross button");
		ashtarak.goToKarmravorClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void amberd () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home =  new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmenia();
		home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Ashtarak ashtarak = new Ashtarak(driver);
		Assert.assertTrue(ashtarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Amberd button");
		ashtarak.goToAshtarak();
		Assert.assertTrue(ashtarak.amberd.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Amberd button");
		ashtarak.goToAmberd();
		Thread.sleep(4000);
		Assert.assertTrue(ashtarak.amberdStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Aragats cross button");
		ashtarak.goToAmberdClose();
		Thread.sleep(2000);
		
}
	
	
	
	@Test
	public void oshakan () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan.goToOshakanHovhanavank();
		Assert.assertTrue(oshakan.oshakan.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Oshakan button");
		oshakan.goToOshakan();
		Thread.sleep(4000);
		Assert.assertTrue(oshakan.oshakanStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Oshakan cross button");
		oshakan.goToOshakanClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void karmravor2 () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan.goToOshakanHovhanavank();
		Assert.assertTrue(oshakan.karmravor.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Karmravor button");
		oshakan.goToKarmravor();
		Thread.sleep(4000);
		Assert.assertTrue(oshakan.karmravorStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan.goToKarmravor2Close();
		Thread.sleep(2000);
		
}
	
	

	@Test
	public void saghmosavank () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan.goToOshakanHovhanavank();
		Assert.assertTrue(oshakan.saghmosavank.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Saghmosavank button");
		oshakan.goToSaghmosavank();
		Thread.sleep(4000);
		Assert.assertTrue(oshakan.saghmosavankStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan.goToSaghmosavankClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void hovhanavanq () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goTotoursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan.goToOshakanHovhanavank();
		Assert.assertTrue(oshakan.hovhanavanq.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Hovhanavanq button");
		oshakan.goToHovhanavanq();
		Thread.sleep(4000);
		Assert.assertTrue(oshakan.hovhanavanqStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan.goToHovhanavanqClose();
		Thread.sleep(2000);
		
}
}