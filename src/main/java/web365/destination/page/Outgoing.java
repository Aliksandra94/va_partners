package web365.destination.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web365.home.page.HomeTabPage;
import static web365.destination.page.OutgoingConstants.*;

public class Outgoing  extends HomeTabPage {

	public Outgoing(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = OUTGOING_XPATH)
	public WebElement outgoing;
	
	@FindBy(xpath = UAE_MORE_BUTTON)
	public WebElement moreButton1;
	
	@FindBy(xpath = JORDAN_MORE_BUTTON)
	public WebElement moreButton2;
	
	@FindBy(xpath = THAILAND_MORE_BUTTON)
	public WebElement moreButton3;
	
	@FindBy(xpath = SRILANKA_MORE_BUTTON)
	public WebElement moreButton4;
	
	@FindBy(xpath = ISRAEL_MORE_BUTTON)
	public WebElement moreButton5;
	
	@FindBy(xpath = GEORGIA_MORE_BUTTON)
	public WebElement moreButton6;
	
	@FindBy(xpath = BULGARIA_MORE_BUTTON)
	public WebElement moreButton7;
	
	@FindBy(xpath = ITALY_MORE_BUTTON)
	public WebElement moreButton8;
	
	@FindBy(xpath = GRECCE_MORE_BUTTON)
	public WebElement moreButton9;
	
	@FindBy(xpath = CYPRUS_MORE_BUTTON)
	public WebElement moreButton10;
	
	@FindBy(xpath = FRANCE_MORE_BUTTON)
	public WebElement moreButton11;
	
	@FindBy(xpath = NORWAY_MORE_BUTTON)
	public WebElement moreButton12;
	
	@FindBy(xpath = CZECH_REPUBLIC_MORE_BUTTON)
	public WebElement moreButton13;
	
	@FindBy(xpath = SPAIN_MORE_BUTTON)
	public WebElement moreButton14;
	
	@FindBy(xpath = EGYPT_MORE_BUTTON)
	public WebElement moreButton15;
	
	@FindBy(xpath = SINGAPORE_MORE_BUTTON)
	public WebElement moreButton16;
	
	@FindBy(xpath = MALDIVES_MORE_BUTTON)
	public WebElement moreButton17;
	
	@FindBy(xpath = BALI_MORE_BUTTON)
	public WebElement moreButton18;
	
	@FindBy(xpath = RUSSIA_MORE_BUTTON)
	public WebElement moreButton19;
	
	@FindBy(xpath = UKRAINE_MORE_BUTTON)
	public WebElement moreButton20;
	
	
	

	public UaeOrder  goToMoreButton1() {
		moveToElement(moreButton1);
		return new UaeOrder(this.driver);
	}

	
	public JordanOrder goToMoreButton2() {
		moveToElement(moreButton2);
		return new JordanOrder(this.driver);
	}

	public ThailandOrder goToMoreButton3() {
		moveToElement(moreButton3);
		return new ThailandOrder(this.driver);
	}
	
	public SrilankaOrder goToMoreButton4() {
		moveToElement(moreButton4);
		return new SrilankaOrder(this.driver);
	}
	
	public IsraelOrder goToMoreButton5() {
		moveToElement(moreButton5);
		return new IsraelOrder(this.driver);
	}
	
	public GeorgiaOrder goToMoreButton6() {
		moveToElement(moreButton6);
		return new GeorgiaOrder(this.driver);
	}
	
	public BulgariaOrder goToMoreButton7 () {
		moveToElement(moreButton7);
		return new BulgariaOrder(this.driver);
	}
	
	public ItalyOrder goToMoreButton8 () {
		moveToElement(moreButton8);
		return new ItalyOrder(this.driver);
	}
	
	public GrecceOrder goToMoreButton9 () {
		moveToElement(moreButton9);
		return new GrecceOrder(this.driver);
	}
	
	public CyprusOrder goToMoreButton10 () {
		moveToElement(moreButton10);
		return new CyprusOrder(this.driver);
	}
	
	public FranceOrder goToMoreButton11 () {
		moveToElement(moreButton11);
		return new FranceOrder(this.driver);
	}
	
	public NorwayOrder goToMoreButton12 () {
		moveToElement(moreButton12);
		return new NorwayOrder(this.driver);
    }
	
	public CzechOrder goToMoreButton13 () {
		moveToElement(moreButton13);
		return new CzechOrder(this.driver);
	}
	
	public SpainOrder goToMoreButton14 () {
		moveToElement(moreButton14);
		return new SpainOrder(this.driver);
	}
	
	public EgyptOrder goToMoreButton15 () {
		moveToElement(moreButton15);
		return new EgyptOrder(this.driver);
	}
	
	public SingaporeOrder goToMoreButton16 () {
		moveToElement(moreButton16);
		return new SingaporeOrder(this.driver);
	}
	
	public MaldivesOrder goToMoreButton17 () {
		moveToElement(moreButton17);
		return new MaldivesOrder(this.driver);
	}
	
	public BaliOrder goToMoreButton18 () {
		moveToElement(moreButton18);
		return new BaliOrder(this.driver);
	}
	
	public RussiaOrder goToMoreButton19 () {
		moveToElement(moreButton19);
		return new RussiaOrder(this.driver);
	}
	
	public UkrainOrder goToMoreButton20 () {
		moveToElement(moreButton20);
		return new UkrainOrder(this.driver);
}
}