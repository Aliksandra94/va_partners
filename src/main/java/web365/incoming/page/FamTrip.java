package web365.incoming.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.incoming.page.FamTrip;
import static web365.incoming.page.FamTripConstants.*;
public class FamTrip extends IncomingTours {

	public FamTrip(WebDriver driver) {
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
	
	
	public FamTrip goToName() {
		moveToElement(name);
		return new FamTrip(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}
	
	public FamTrip goToPhone() {
		moveToElement(phone);
		return new FamTrip (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}

	public FamTrip goToEmail() {
		moveToElement(email);
		return new FamTrip(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	public FamTrip goToMessage() {
		moveToElement(message);
		return new FamTrip(this.driver);
	}

	public void fillMessage(String hello) {
		message.sendKeys(hello);
	}


	public FamTrip goToToOrder() {
		moveToElement(toOrder);
		return new FamTrip(this.driver);
	}
}
