package web365.holidays.and.traditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import web365.base.page.test.BasePageTest;

public class HolidaysAndTraditionsTest extends BasePageTest {

	
	@Test
	public void newYear() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		NewYear armenia = new NewYear(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.newYearImg.isDisplayed());
		Thread.sleep(2000);
	}
	
	
	@Test
	public void nationalArmyDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		NationalArmyDay armenia = new NationalArmyDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.nationalArmyDay.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		armenia.goTonationalArmyDay();
		Assert.assertTrue(armenia.nationalArmyImg.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test
	public void womensDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		WomensDay armenia = new WomensDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.womensDay.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Women's day button");
		armenia.goToWomensDay();
		Assert.assertTrue(armenia.womensDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	@Test
	public void maternityDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		DayOfMaternity armenia = new DayOfMaternity(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.dayOfMaternity.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		armenia.goToDayOfMaternity();
		Assert.assertTrue(armenia.dayOfMaternityImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void victoryAndPeaceDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		VictoryAndPeaceDay armenia = new VictoryAndPeaceDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.victoryAndPeaceDay.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on National Army Day button");
		armenia.goToVictoryAndPeaceDay();
		Assert.assertTrue(armenia.victoryAndPeaceDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	

	@Test
	public void republicDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		RepublicDay armenia = new RepublicDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.republic.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Republic day button");
		armenia.goToRepublic();
		Assert.assertTrue(armenia.republicImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void constitutionDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		ConstitutionDay armenia = new ConstitutionDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.constitutionDay.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Constitution Day button");
		armenia.goToConstitutionDay();
		Assert.assertTrue(armenia.constitutionDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void indipendenceDay() throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		IndipendenceDay armenia = new IndipendenceDay(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.independenceDay.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Indipendence Day button");
		armenia.goToIndependenceDay();
		Assert.assertTrue(armenia.independenceDayImg.isDisplayed());
		Thread.sleep(2000);
}
	
	
	@Test
	public void traditions () throws InterruptedException {
		
		System.out.println("1. Open Home Page");
		Traditions armenia = new Traditions(driver);
		Assert.assertTrue(armenia.armeniaBtn.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("2. Click on Armenia button");
		armenia.goToArmeniaBtn();
		Thread.sleep(2000);
		
		System.out.println("3. Click on Holidays and Traditions button");
		armenia.goToHolidaysTraditions();
		Assert.assertTrue(armenia.traditions.isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("4. Click on Indipendence Day button");
		armenia.goToTraditions();
		Assert.assertTrue(armenia.traditionsImg.isDisplayed());
		Thread.sleep(2000);
}
}
