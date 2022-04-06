package web365.incoming.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static web365.incoming.page.ArmeniaGharabaghConstants.*;

public class ArmeniaGharabagh extends IncomingTours {

	public ArmeniaGharabagh(WebDriver driver) {
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
	
	
	public ArmeniaGharabagh goToName() {
		moveToElement(name);
		return new ArmeniaGharabagh(this.driver);
	}

	public void fillName(String Aliksandra) {
		name.sendKeys(Aliksandra);
	}

	
	public ArmeniaGharabagh goToPhone() {
		moveToElement(phone);
		return new ArmeniaGharabagh (this.driver);
	}
	
	public void fillPhone(String phoneNamber) {
		phone.sendKeys(phoneNamber);
	}


	public ArmeniaGharabagh goToEmail() {
		moveToElement(email);
		return new ArmeniaGharabagh(this.driver);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);
	}

	
	public ArmeniaGharabagh goToMessage() {
		moveToElement(message);
		return new ArmeniaGharabagh(this.driver);
	}

	public void fillMessage(String hello) {
		message.sendKeys(hello);
	}

	
	public ArmeniaGharabagh goToToOrder() {
		moveToElement(toOrder);
		return new ArmeniaGharabagh(this.driver);
	}
}
