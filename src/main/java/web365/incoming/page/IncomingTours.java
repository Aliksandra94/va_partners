package web365.incoming.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web365.home.page.HomeTabPage;
import static web365.incoming.page.IncomingToursConstants.*;

public class IncomingTours extends HomeTabPage {

	public IncomingTours(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	@FindBy(xpath = INCOMING_TOUR_XPATH)
    public WebElement incomingTours;
	
	@FindBy(xpath = ARMENIAN_AND_GEORGIA_COMBINDED_TOUR_MORE_BUTTON_XPATH)
	public WebElement moreButton1;
	
	@FindBy(xpath = ARMENIAN_FAIRY_TALE_MORE_BUTTON_XPATH)
	public WebElement moreButton2;
	
	@FindBy(xpath = CULTURAL_TOUR_MORE_BUTTON_XPATH)
	public WebElement moreButton3;
	
	@FindBy(xpath = ARMENIA_SHORT_TOUR_MORE_XPATH)
	public WebElement moreButton4;
	
	@FindBy(xpath = DISCOVER_ARMENIA_TOUR_MORE_BUTTON_XPATH)
	public WebElement moreButton5;
	
	@FindBy(xpath = ARMENIA_GHARABAGH_TOUR_MORE_XPATH)
	public WebElement moreButton6;
	
	@FindBy(xpath = RECOGNIZE_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement moreButton7;
	
	@FindBy(xpath = CULTURAL_TOUR_5DAYS_MORE_BUTTON_XPATH)
	public WebElement moreButton8;
	
	@FindBy(xpath = UNIQUE_ARMENIA_WITH_SAFARI_TOUR_MORE_BUTTON_XPATH)
	public WebElement moreButton9;
	
	@FindBy(xpath = ANTIQUARIAN_TOUR_MORE_BUTTON_XPATH)
	public WebElement moreButton10;
	
	@FindBy(xpath = FAM_TRIP_TO_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement moreButton11;
	
	@FindBy(xpath = COLORS_OF_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement moreButton12;
	
	@FindBy(xpath = HONEYMOON_IN_ARMENIA_MORE_BUTTON_XPATH )
	public WebElement moreButton13;
	
	@FindBy(xpath = PETROGLYPH_TOUR_IN_ARMENIA_MORE_BUTTON_XPATH)
	public WebElement moreButton14;
	
	@FindBy(xpath =  VACCINE_TOURS_TO_ARMENIA_XPATH)
    public WebElement moreButton15;
	
	

	
	
		public ArmeniaAndGeorgia  goToMoreButton1() {
			moveToElement(moreButton1);
			return new ArmeniaAndGeorgia(this.driver);
		}
		
		public ArmeniaFairyTale  goToMoreButton2() {
			moveToElement(moreButton2);
			return new ArmeniaFairyTale(this.driver);
}
		
		public CulturalTour8Days  goToMoreButton3() {
			moveToElement(moreButton3);
			return new CulturalTour8Days(this.driver);
}
		
		public ArmeniaShort  goToMoreButton4() {
			moveToElement(moreButton4);
			return new ArmeniaShort(this.driver);
}
		
		public DiscoverArmenia  goToMoreButton5() {
			moveToElement(moreButton5);
			return new DiscoverArmenia(this.driver);
}
		
		public ArmeniaGharabagh  goToMoreButton6() {
			moveToElement(moreButton6);
			return new ArmeniaGharabagh (this.driver);
}
		
		public RecognizeArmenia  goToMoreButton7() {
			moveToElement(moreButton7);
			return new RecognizeArmenia(this.driver);
}
		
		public CulturalTours5Days  goToMoreButton8() {
			moveToElement(moreButton8);
			return new CulturalTours5Days(this.driver);
}
		
		public UniqueArmenia  goToMoreButton9() {
			moveToElement(moreButton9);
			return new UniqueArmenia(this.driver);
}
		
		public Antiquarian  goToMoreButton10() {
			moveToElement(moreButton10);
			return new Antiquarian(this.driver);
}
		
		public FamTrip  goToMoreButton11() {
			moveToElement(moreButton11);
			return new FamTrip(this.driver);
}
		
		public ColorsOfArmenia  goToMoreButton12() {
			moveToElement(moreButton12);
			return new ColorsOfArmenia(this.driver);
}
		
		public Honeymoon  goToMoreButton13() {
			moveToElement(moreButton13);
			return new Honeymoon(this.driver);
}
		
		public PetroglyphTour  goToMoreButton14() {
			moveToElement(moreButton14);
			return new PetroglyphTour(this.driver);
}
		
		public VaccineTour  goToMoreButton15() {
			moveToElement(moreButton15);
			return new VaccineTour(this.driver);
}
}
		

