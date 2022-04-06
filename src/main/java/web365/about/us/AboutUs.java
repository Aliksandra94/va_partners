package web365.about.us;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.about.us.AboutUsConstants.*;
public class AboutUs extends HomeTabPage {

	public AboutUs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUT_US_STORY_XPATH)
	public WebElement aboutStory;
	
	public AboutUs goToAboutStory() {
		moveToElement(aboutStory);
		return new AboutUs(this.driver);
	}
}
