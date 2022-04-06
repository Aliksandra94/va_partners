package web365.general.information;


import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.general.information.GeneralInformationConstants. *;

public class GeneralInformation extends HomeTabPage {

	public GeneralInformation(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUT_ARMENIA_HEADER_XPATH)
	public WebElement aboutArmHead;
}
