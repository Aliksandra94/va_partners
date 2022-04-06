package web365.contacts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web365.home.page.HomeTabPage;
import static web365.contacts.ContactsConstants.*;
public class Contacts extends HomeTabPage {

	public Contacts(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	@FindBy(xpath = CONTACTS_INFORMATION_XPATH)
	public WebElement contInf;
}
