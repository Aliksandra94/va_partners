package web365.history.and.culture;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.history.and.culture.AntiquityConstants.*;
public class Antiquity extends HistoryAndCulture {

	public Antiquity(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ANTIQUITY_IMAGE)
	public WebElement antiqImage;

	
		
		
	}
	

