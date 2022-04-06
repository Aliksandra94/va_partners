package web365.base.page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import web365.home.page.HomeTabPage;

public class BasePageTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openVapartnersTrours() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.vapartners.am");
		HomeTabPage home = new HomeTabPage(driver);
		home.goToLogo();
		Assert.assertTrue(home.menuTabs.isDisplayed());
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
}


	   
	