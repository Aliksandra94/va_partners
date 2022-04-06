package web365.history.and.culture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.history.and.culture.SovietArmeniaConstants.*;
public class SovietArmenia  extends HistoryAndCulture {

	public SovietArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SOVIET_ARMENIA)
	public WebElement sovietArm;
	
	@FindBy(xpath = SOVIET_ARMENIA_IMAGE)
	public WebElement sovetArmImg;

	public SovietArmenia goToSovietArm() {
		moveToElement(sovietArm);
		return new SovietArmenia(this.driver);
		
	}
}
