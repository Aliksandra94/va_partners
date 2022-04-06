package web365.gallery;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.gallery.GalleryContants.*;
public class Gallery extends HomeTabPage {

	public Gallery(WebDriver driver) {
		super(driver);
         this.driver = driver;

	}

	@FindBy(xpath = GALLERY_IMAGE_1_XPATH)
	public WebElement Gallery1;
}
