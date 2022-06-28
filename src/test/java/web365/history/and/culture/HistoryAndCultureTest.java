package web365.history.and.culture;

import org.testng.Assert;

import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.home.page.ArmeniaMenuPage;
import web365.home.page.HomeTabPage;

public class HistoryAndCultureTest extends BasePageTest {
	
	@Test
	public void antiquity() throws InterruptedException {

		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		Antiquity antiq = new Antiquity(driver);
		armMenu.goToHistoryCulture();
		Assert.assertTrue(antiq.antiqImage.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void middleAges() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armMenu.goToHistoryCulture();
		
		System.out.println("4. Click on Middle Ages button");
		MiddleAges middle = new MiddleAges(driver);
		middle.goToMiddleAges();
		Assert.assertTrue(middle.middleAgesText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test
	public void earlyModernEra() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armMenu.goToHistoryCulture();
		
		System.out.println("4. Click on Middle Ages button");
		EarlyModernEra earlyModern = new EarlyModernEra(driver);
		earlyModern.goToEarlyModernEra();
		Assert.assertTrue(earlyModern.earlyEraImg.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test
	public void worldWar1AndGenocide() throws InterruptedException {
		
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armMenu.goToHistoryCulture();
	
		System.out.println("4. Click on World War 1 button");
		WorldWar1AndGenocide war1 = new WorldWar1AndGenocide(driver);
		war1.goToWorldWarGenocide();
		Assert.assertTrue(war1.warGenocideImg.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void democraticRepublicOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();	
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armMenu.goToHistoryCulture();
		
		System.out.println("4. Click on Democratic Republic of Armenia button");
		DemocraticRepublicOfArmenia democrat = new DemocraticRepublicOfArmenia(driver);
		democrat.goToDra();
		Assert.assertTrue(democrat.republicImg.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void sovietArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage amMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		amMenu.goToHistoryCulture();
		
		System.out.println("4. Click on Soviet Armenia button");
		SovietArmenia soviet = new SovietArmenia(driver);
		soviet.goToSovietArm();
		Assert.assertTrue(soviet.sovetArmImg.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void cultureOfArmenia() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Histoyr and Culture button");
		armMenu.goToHistoryCulture();
		
		System.out.println("4. Click on Culture of Armenia button");
		CultureOfArmenia cultArm = new CultureOfArmenia(driver);
		cultArm.goTocultureArm();
		Assert.assertTrue(cultArm.cultureArmImg.isDisplayed());
		Thread.sleep(2000);
	}
}




