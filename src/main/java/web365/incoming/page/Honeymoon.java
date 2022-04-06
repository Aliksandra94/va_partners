package web365.incoming.page;

import static web365.incoming.page.HoneymoonConstants.INFORMATION_EMAIL_XPATH;
import static web365.incoming.page.HoneymoonConstants.INFORMATION_MESSAGE_XPATH;
import static web365.incoming.page.HoneymoonConstants.INFORMATION_NAME_XPATH;
import static web365.incoming.page.HoneymoonConstants.INFORMATION_PHONE_XPATH;
import static web365.incoming.page.HoneymoonConstants.TOUR_CONT_INF_FORM_XPATH;
import static web365.incoming.page.HoneymoonConstants.TO_ORDER_BUTTON_XPATH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Honeymoon extends IncomingTours {

	public Honeymoon(WebDriver driver) {
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
	
	
	public Honeymoon goToName() {
		moveToElement(name);
		return new Honeymoon(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}
	
	
	
	
	
	public Honeymoon goToPhone() {
		moveToElement(phone);
		return new Honeymoon (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}

	
	
	

	public Honeymoon goToEmail() {
		moveToElement(email);
		return new Honeymoon(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	
	
	
	
	public Honeymoon goToMessage() {
		moveToElement(message);
		return new Honeymoon(this.driver);
	}

	public void fillMessage(String hello) {
		message.sendKeys(hello);
	}

	
	
	
	
	
	public Honeymoon goToToOrder() {
		moveToElement(toOrder);
		return new Honeymoon(this.driver);
	}
}
