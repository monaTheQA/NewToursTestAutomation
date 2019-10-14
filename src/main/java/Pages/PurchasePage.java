package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class PurchasePage extends BasePage{
	
	@FindBy(xpath="//input[@name='passFirst0']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='passLast0']")
	private WebElement LastName;
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	private WebElement Meal;
	
	@FindBy(xpath="//select[@name='creditCard']")
	private WebElement CreditCardType;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement CreditCardNumber;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_mn']")
	private WebElement CardExprationMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_yr']")
	private WebElement CardExprationYear;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	private WebElement CCFirstName;
	
	@FindBy(xpath="//input[@name='cc_mid_name']")
	private WebElement CCMiddleName;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	private WebElement CCLastName;
	
	@FindBy(xpath="//input[@name='billAddress1']")
	private WebElement BillAddress1;
	
	@FindBy(xpath="//input[@name='billCity']")
	private WebElement BillCity;
	
	@FindBy(xpath="//input[@name='billState']")
	private WebElement BillState;
	
	@FindBy(xpath="//input[@name='billZip']")
	private WebElement BillZip;
	
	@FindBy(xpath="//select[@name='billCountry']")
	private WebElement BillCountry;
	
	@FindBy(xpath="//input[@name='delAddress1']")
	private WebElement DelAddress1;
	
	@FindBy(xpath="//input[@name='delCity']")
	private WebElement DelCity;
	
	@FindBy(xpath="//input[@name='delState']")
	private WebElement DelState;
	
	@FindBy(xpath="//input[@name='delZip']")
	private WebElement DelZip;
	
	@FindBy(xpath="//select[@name='delCountry']")
	private WebElement DelCountry;
	
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement SecurePurchases;
	
	public PurchasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassengerDetail(String fname, String lname, String meal) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		Select selmeal = new Select(Meal);
		selmeal.selectByVisibleText(meal);
		
	}
	
	public void enterCreditCardDetail(String cardtype, String cardnumber, String expmonth, String expyear, String cfname, String cmname, String clname) {
		Select selcard = new Select(CreditCardType);
		selcard.selectByVisibleText(cardtype);
		CreditCardNumber.sendKeys(cardnumber);
		Select selcardexmonth = new Select(CardExprationMonth);
		selcardexmonth.selectByVisibleText(expmonth);
		Select selcardexyear = new Select(CardExprationYear);
		selcardexyear.selectByVisibleText(expyear);
		CCFirstName.sendKeys(cfname);
		CCMiddleName.sendKeys(cmname);
		CCLastName.sendKeys(clname);
		
	}
	
	
	public void enterBillingAddress(String baddress, String bcity, String bstate, String bzip, String bcountry) {
		BillAddress1.sendKeys(baddress);
		BillCity.sendKeys(bcity);
		BillState.sendKeys(bstate);
		BillZip.sendKeys(bzip);
		BillCountry.sendKeys(bcountry);
	}
	
	public void enterDeliveryAddress(String daddress, String dcity, String dstate, String dzip, String dcountry) {
		DelAddress1.sendKeys(daddress);
		DelCity.sendKeys(dcity);
		DelState.sendKeys(dstate);
		DelZip.sendKeys(dzip);
		Select selDelcountry = new Select(DelCountry);
		selDelcountry.selectByVisibleText(dcountry);
	}
	
	public void clickSecurePurchasesButton() {
		SecurePurchases.click();
	}
	
	
	
}
