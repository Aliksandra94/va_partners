package web365.history.and.culture;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.history.and.culture.CultureOfArmeniaConstants.*;
public class CultureOfArmenia extends HistoryAndCulture {

	public CultureOfArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CULTURE_OF_ARMENIA)
	public WebElement cultureArm;
	
	@FindBy(xpath = CULTURE_OF_ARMENIA_IMAGE)
	public WebElement cultureArmImg;

	public CultureOfArmenia goTocultureArm() {
		moveToElement(cultureArm);
		return new CultureOfArmenia(this.driver);
		
	}
}
