package web365.hotels.in.yerevan;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.hotels.in.yerevan.HotelsInYerevanConstants.*;
public class HotelsInYerevan extends HomeTabPage {

	public HotelsInYerevan(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	@FindBy(xpath = HOTEL_IN_YEREVAN_HEADER_XPATH)
	public WebElement hotelInYerevanHead;
}
