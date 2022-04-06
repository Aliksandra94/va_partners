package web365.destination.page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static web365.destination.page.SrilankaOrderConstants.*;
public class SrilankaOrder extends Outgoing {

	public SrilankaOrder(WebDriver driver) {
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
	
	
	
	public SrilankaOrder goToName() {
		moveToElement(name);
		return new SrilankaOrder(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}
	
	
	
	
	
	public SrilankaOrder goToPhone() {
		moveToElement(phone);
		return new SrilankaOrder (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}

	
	
	

	public SrilankaOrder goToEmail() {
		moveToElement(email);
		return new SrilankaOrder(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	
	
	
	
	public SrilankaOrder goToMessage() {
		moveToElement(message);
		return new SrilankaOrder(this.driver);
	}

	public void gillMessage(String hello) {
		message.sendKeys(hello);
	}

	
	
	
	
	
	public SrilankaOrder goToToOrder() {
		moveToElement(toOrder);
		return new SrilankaOrder(this.driver);
	}
	
}
