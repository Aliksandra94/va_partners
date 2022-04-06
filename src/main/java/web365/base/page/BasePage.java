package web365.base.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

protected WebDriver driver;
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void moveToElement (WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click();
		action.build().perform();
	}

	public void mouseHoverElement (WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.build().perform();
	}

}
