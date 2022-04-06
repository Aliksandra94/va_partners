package web365.history.and.culture;

import org.testng.Assert;
import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.home.page.ArmeniaMenuPage;
import web365.home.page.HomeTabPage;
import web365.tours.and.excursions.Echmiadzin;

public class HistoryAndCultureTest extends BasePageTest {
	
	@Test
	public void antiquity() throws InterruptedException {

		System.out.println("1. Open Home Page");
		Antiquity armenia = new Antiquity(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.antiqImage.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void middleAges() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		MiddleAges armenia = new MiddleAges(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.middleAges.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Middle Ages button");
		armenia.goToMiddleAges();
		Assert.assertTrue(armenia.middleAgesText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test
	public void earlyModernEra() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		EarlyModernEra armenia = new EarlyModernEra(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.earlyModernEra.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Middle Ages button");
		armenia.goToEarlyModernEra();
		Assert.assertTrue(armenia.earlyEraImg.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test
	public void worldWar1AndGenocide() throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		WorldWar1AndGenocide armenia = new WorldWar1AndGenocide(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.worldWarGenocide.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Early Modern Era button");
		armenia.goToWorldWarGenocide();
		Assert.assertTrue(armenia.warGenocideImg.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void democraticRepublicOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		DemocraticRepublicOfArmenia armenia = new DemocraticRepublicOfArmenia(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.dra.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on World War 1 and The Armenian Genocide button");
		armenia.goToDra();
		Assert.assertTrue(armenia.republicImg.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void sovietArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		SovietArmenia armenia = new SovietArmenia(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage amMenu = armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		amMenu.goToHistoryCulture();
		Assert.assertTrue(armenia.sovietArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on World War 1 and The Armenian Genocide button");
		armenia.goToSovietArm();
		Assert.assertTrue(armenia.sovetArmImg.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void CultureOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		CultureOfArmenia armenia = new CultureOfArmenia(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armenia.goToHistoryCulture();
		Assert.assertTrue(armenia.cultureArm.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on World War 1 and The Armenian Genocide button");
		armenia.goTocultureArm();
		Assert.assertTrue(armenia.cultureArmImg.isDisplayed());
		Thread.sleep(2000);
	}
}




