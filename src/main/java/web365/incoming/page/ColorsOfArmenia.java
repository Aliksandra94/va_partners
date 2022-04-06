package web365.incoming.page;

import static web365.incoming.page.ColorsOfArmeniaConstants.INFORMATION_EMAIL_XPATH;
import static web365.incoming.page.ColorsOfArmeniaConstants.INFORMATION_MESSAGE_XPATH;
import static web365.incoming.page.ColorsOfArmeniaConstants.INFORMATION_NAME_XPATH;
import static web365.incoming.page.ColorsOfArmeniaConstants.INFORMATION_PHONE_XPATH;
import static web365.incoming.page.ColorsOfArmeniaConstants.TOUR_CONT_INF_FORM_XPATH;
import static web365.incoming.page.ColorsOfArmeniaConstants.TO_ORDER_BUTTON_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ColorsOfArmenia extends IncomingTours{

	public ColorsOfArmenia(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = TOUR_CONT_INF_FORM_XPATH)
	public WebElement contForm;
	
	@FindBy(xpath = INFORMATION_NAME_XPATH)
	public WebElement name;
	
	@FindBy(xpath = INFORMATION_PHONE_XPATH)
	public WebElement phone;
	
	@FindBy(xpath = INFORMATION_EMAIL_XPATH)
	public WebElement email;
	
	@FindBy(xpath = INFORMATION_MESSAGE_XPATH)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER_BUTTON_XPATH)
	public WebElement toOrder;
	
	
	public ColorsOfArmenia goToName() {
		moveToElement(name);
		return new ColorsOfArmenia(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}
	
	
	
	
	
	public ColorsOfArmenia goToPhone() {
		moveToElement(phone);
		return new ColorsOfArmenia (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}

	
	
	

	public ColorsOfArmenia goToEmail() {
		moveToElement(email);
		return new ColorsOfArmenia(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	
	
	
	
	public ColorsOfArmenia goToMessage() {
		moveToElement(message);
		return new ColorsOfArmenia(this.driver);
	}

	public void fillMessage(String hello) {
		message.sendKeys(hello);
	}

	
	
	
	
	
	public ColorsOfArmenia goToToOrder() {
		moveToElement(toOrder);
		return new ColorsOfArmenia(this.driver);
	}
		

	
	
	

}
