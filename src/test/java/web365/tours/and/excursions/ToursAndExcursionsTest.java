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
		armMenu.goToToursExcursions();
		
		ErevanCityTour erevanPage = new ErevanCityTour(driver);
		Thread.sleep(2000);
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
		armMenu.goToToursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity = erevanCity.goToErevanCity();
		//Thread.sleep(2000);
		//Assert.assertTrue(erevanCity.erebuni.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Erebuni Museum button");
		erevanCity = erevanCity.goToErebuni();
		//Thread.sleep(2000);
		//Assert.assertTrue(erevanCity.erebuniStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Erebuni cross button");
		erevanCity = erevanCity.goToErebuniClose();
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
		armMenu.goToToursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity = erevanCity.goToErevanCity();
		//Thread.sleep(2000);
		//Assert.assertTrue(erevanCity.tsitsernakaberd.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Tsitsernakaberd button");
		erevanCity = erevanCity.goToTsitsernakaberd();
		//Thread.sleep(2000);
		//Assert.assertTrue(erevanCity.tsitsernakStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Tsitsernakaberd cross button");
		erevanCity = erevanCity.goToTsitsernakClose();
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
		armMenu.goToToursExcursions();
		
		ErevanCityTour erevanCity = new ErevanCityTour(driver);
		Assert.assertTrue(erevanCity.erevanCity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Erevan city button");
		erevanCity= erevanCity.goToErevanCity();
		//Thread.sleep(2000);
		//Assert.assertTrue(erevanCity.matenadaran.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("5. Click on Matenadaran button");
		erevanCity = erevanCity.goToMatenadaran();
		//Assert.assertTrue(erevanCity.matenadaranStory.isDisplayed());
		Thread.sleep(4000);
		
		System.out.println("6. Click on Matenadaran cross button");
		erevanCity = erevanCity.goToMatenadaranClose();
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
		armMenu.goToToursExcursions();
		
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
		armMenu.goToToursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin= echmiadzin.goToEchmiadzin();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.hripsime.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on St. Hripsime button");
		echmiadzin = echmiadzin.goToHripsime();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.hripsimeStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on St.Hripsime cross button");
		echmiadzin = echmiadzin.goToHripsimeClose();
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
		armMenu.goToToursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin = echmiadzin.goToEchmiadzin();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.gayane.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on St. Gayane button");
		echmiadzin = echmiadzin.goToGayane();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.gayaneStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on St. Gayane cross button");
		echmiadzin = echmiadzin.goToGayaneClose();
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
		armMenu.goToToursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin = echmiadzin.goToEchmiadzin();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.mother.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Mother Cathedral button");
		echmiadzin = echmiadzin.goToMother();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.motherStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Mother Cathedral cross button");
		echmiadzin = echmiadzin.goToMotherClose();
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
		armMenu.goToToursExcursions();
		
		Echmiadzin echmiadzin = new Echmiadzin(driver);
		Assert.assertTrue(echmiadzin.echmiadzin.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Echmiadzin button");
		echmiadzin = echmiadzin.goToEchmiadzin();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.zvartnots.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Zvartots button");
		echmiadzin = echmiadzin.goToZvartnots();
		//Thread.sleep(2000);
		//Assert.assertTrue(echmiadzin.zvartnotsStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Mother Cathedral cross button");
		echmiadzin = echmiadzin.goToZvartnotsClose();
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
		armMenu.goToToursExcursions();
		
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
		armMenu.goToToursExcursions();
		
		Ashtarak ashtarak = new Ashtarak(driver);
		Assert.assertTrue(ashtarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Ashtarak button");
		ashtarak = ashtarak.goToAshtarak();
		//Thread.sleep(2000);
		//Assert.assertTrue(ashtarak.aragats.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Aragats button");
		ashtarak = ashtarak.goToAragats();
		//Thread.sleep(4000);
		//Assert.assertTrue(ashtarak.aragatsStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Aragats cross button");
		ashtarak = ashtarak.goToAragatsClose();
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
		armMenu.goToToursExcursions();
		
		Ashtarak ashtarak = new Ashtarak(driver);
		Assert.assertTrue(ashtarak.ashtarak.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Ashtarak button");
		ashtarak = ashtarak.goToAshtarak();
		//Thread.sleep(2000);
		//Assert.assertTrue(ashtarak.karmravor.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Karmravor button");
		ashtarak = ashtarak.goToKarmravor();
		//Thread.sleep(2000);
		//Assert.assertTrue(ashtarak.karmravorStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Aragats cross button");
		ashtarak = ashtarak.goToKarmravorClose();
		Thread.sleep(2000);
		
}
	
	
	@Test
	public void amberd () throws InterruptedException {
		

		System.out.println("1. Open Home Page");
		HomeTabPage home =  new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		home = armMenu.goToToursExcursions();
		
		Ashtarak ashtarak1 = new Ashtarak(driver);
		Assert.assertTrue(ashtarak1.ashtarak.isDisplayed());
		Thread.sleep(2000);
			
		System.out.println("4. Click on Amberd button");
		ashtarak1 = ashtarak1.goToAshtarak();
		//Thread.sleep(2000);
		//Assert.assertTrue(ashtarak1.amberd.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Amberd button");
		ashtarak1 = ashtarak1.goToAmberd();
		//Thread.sleep(2000);
		//Assert.assertTrue(ashtarak1.amberdStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Aragats cross button");
		ashtarak1 = ashtarak1.goToAmberdClose();
		Thread.sleep(2000);
		
}
	
	
	@Test 
	public void oshakanHovhanavanq() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmenia();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goToToursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
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
		armMenu.goToToursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan = oshakan.goToOshakanHovhanavank();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.oshakan.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Oshakan button");
		oshakan = oshakan.goToOshakan();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.oshakanStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Oshakan cross button");
		oshakan = oshakan.goToOshakanClose();
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
		armMenu.goToToursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan = oshakan.goToOshakanHovhanavank();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.karmravor2.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Karmravor button");
		oshakan = oshakan.goToKarmravor();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.karmravor2Story.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan = oshakan.goToKarmravor2Close();
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
		armMenu.goToToursExcursions();
		
		Oshakan oshakan = new Oshakan(driver);
		Assert.assertTrue(oshakan.oshakanHovhanavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		oshakan = oshakan.goToOshakanHovhanavank();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.saghmosavank.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Saghmosavank button");
		oshakan = oshakan.goToSaghmosavank();
		//Assert.assertTrue(oshakan.saghmosavankStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan = oshakan.goToSaghmosavankClose();
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
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goToToursExcursions();
		Assert.assertTrue(armMenu.toursExcursions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Oshakan Hovhanavank button");
		Oshakan oshakan = new Oshakan(driver);
		oshakan.goToOshakanHovhanavank();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.hovhanavanq.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("5. Click on Hovhanavanq button");
		oshakan = oshakan.goToHovhanavanq();
		//Thread.sleep(2000);
		//Assert.assertTrue(oshakan.hovhanavanqStory.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("6. Click on Karmravor cross button");
		oshakan = oshakan.goToHovhanavanqClose();
		Thread.sleep(2000);
		
}
	
	@Test
	public void garniGeghard () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmenia();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Tours and Excursions button");
		armMenu.goToToursExcursions();
		
		GarniGeghard garni = new GarniGeghard(driver);
		Assert.assertTrue(garni.garniGeghard.isDisplayed());
		Thread.sleep(2000);
		

		
	}
}