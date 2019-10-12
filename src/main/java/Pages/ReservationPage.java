package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class ReservationPage extends BasePage {
		
	@FindBy(xpath="//input[@name='tripType' and @value='roundtrip']")
	private WebElement FlightType;
	
	@FindBy(xpath="//select[@name='passCount']")
	private WebElement PassengersCount;
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement DepartingFrom;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	private WebElement DepartingMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	private WebElement DepartingDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement ArrivingIn;
	
	@FindBy(xpath="//select[@name='toMonth']")
	private WebElement ReturningMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	private WebElement ReturningDay;
	
	@FindBy(xpath="//input[@name='servClass'  and  @value='Business']")
	private WebElement ServiceClass;
	
	@FindBy(xpath="//select[@name='airline']")
	private WebElement Airline;
	
	@FindBy(xpath="//input[@name='findFlights']")
	private WebElement ContinueButton;
	
	public ReservationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getReservationPageTitle() {
		return driver.getTitle();
	}
	
	public void EnterFlightDetails(String count, String deppartingform, String demonth, String deday, String arrive, String remonth, String reday) {
		FlightType.isSelected();
		Select pcount = new Select(PassengersCount);
		pcount.selectByVisibleText(count);
		Select deform = new Select(DepartingFrom);
		deform.selectByVisibleText(deppartingform);
		Select deonmonth = new Select(DepartingMonth);
		deonmonth.selectByVisibleText(demonth);
		Select deonday = new Select(DepartingDay);
		deonday.selectByVisibleText(deday);
		Select arriveon = new Select(ArrivingIn);
		arriveon.selectByVisibleText(arrive);
		Select returnmonth = new Select(ReturningMonth);
		returnmonth.selectByVisibleText(remonth);
		Select returnday = new Select(ReturningDay);
		returnday.selectByVisibleText(reday);
		
	}
	
	public void EnterPreferenceDetails(String airline) {
		ServiceClass.isSelected();
		Select sel1 = new Select(Airline);
		sel1.selectByVisibleText(airline);
	}
	
	public void ClickOnContinueButton() {
		ContinueButton.click();
	}
}
