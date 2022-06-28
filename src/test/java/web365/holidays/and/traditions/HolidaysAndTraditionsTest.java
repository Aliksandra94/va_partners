package web365.holidays.and.traditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;
import web365.home.page.ArmeniaMenuPage;
import web365.home.page.HomeTabPage;

public class HolidaysAndTraditionsTest extends BasePageTest {

	
	@Test
	public void newYear() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void nationalArmyDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		NationalArmyDay army = new NationalArmyDay(driver);
		army = army.goToNationalArmyDay();
		Thread.sleep(2000);
		Assert.assertTrue(army.nationalArmyImg.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void womensDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Women's day button");
		WomensDay womens = new WomensDay(driver);
		womens = womens.goToWomensDay();
		Thread.sleep(2000);
		Assert.assertTrue(womens.womensDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void maternityDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		DayOfMaternity maternity = new DayOfMaternity(driver);
		maternity = maternity.goToDayOfMaternity();
		Thread.sleep(2000);
		Assert.assertTrue(maternity.dayOfMaternityImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void victoryAndPeaceDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		VictoryAndPeaceDay victory = new VictoryAndPeaceDay(driver);
		victory = victory.goToVictoryAndPeaceDay();
		Thread.sleep(2000);
		Assert.assertTrue(victory.victoryAndPeaceDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	

	@Test
	public void republicDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Republic day button");
		RepublicDay republic = new RepublicDay(driver);
		republic = republic.goToRepublic();
		Thread.sleep(2000);
		Assert.assertTrue(republic.republicImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void constitutionDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Constitution Day button");
		ConstitutionDay constitution = new ConstitutionDay(driver);
		constitution = constitution.goToConstitutionDay();
		Thread.sleep(2000);
		Assert.assertTrue(constitution.constitutionDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void indipendenceDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Indipendence Day button");
		IndipendenceDay indipendence = new IndipendenceDay(driver);
		indipendence = indipendence.goToIndependenceDay();
		Thread.sleep(2000);
		Assert.assertTrue(indipendence.independenceDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void traditions () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		HomeTabPage home = new HomeTabPage(driver);	
		Assert.assertTrue(home.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		ArmeniaMenuPage armMenu = home.goToArmeniaBtn();
		Thread.sleep(2000);
		Assert.assertTrue(armMenu.armTab.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		HolidaysAndTraditions holidays = armMenu.goToHolidaysTraditions();
		Assert.assertTrue(holidays.holidaysTraditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Indipendence Day button");
		Traditions trad = new Traditions(driver);
		trad = trad.goToTraditions();
		Thread.sleep(2000);
		Assert.assertTrue(trad.traditionsImg.isDisplayed());
		Thread.sleep(2000);
}
}
