package web365.incoming.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.incoming.page.CulturalTours5DaysConstants.*;
public class CulturalTours5Days extends IncomingTours {

	public CulturalTours5Days(WebDriver driver) {
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
	
	
	public CulturalTours5Days goToName() {
		moveToElement(name);
		return new CulturalTours5Days(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}
	
	
	public CulturalTours5Days goToPhone() {
		moveToElement(phone);
		return new CulturalTours5Days (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}

	
	public CulturalTours5Days goToEmail() {
		moveToElement(email);
		return new CulturalTours5Days(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	
	public CulturalTours5Days goToMessage() {
		moveToElement(message);
		return new CulturalTours5Days(this.driver);
	}

	public void fillMessage(String hello) {
		message.sendKeys(hello);
	}

	
	public CulturalTours5Days goToToOrder() {
		moveToElement(toOrder);
		return new CulturalTours5Days(this.driver);
	}
}
