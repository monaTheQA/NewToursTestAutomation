package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class RegisterPage extends BasePage{

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@name='userName']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='address1']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement Postalcode;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	private WebElement Confirmpwd;
	
	@FindBy(xpath="//input[@name='register']")
	private WebElement Submitbutton;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	private WebElement RegisterLink;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void goToRegisterPage() {
		RegisterLink.click();
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	
	public void EnterContactInformation(String fname, String lname, String phone, String email) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		Phone.sendKeys(phone);
		Email.sendKeys(email);
		
	}
	
	public void EnterMailingInformation(String address, String city, String state, String postalcode, String country) {
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Postalcode.sendKeys(postalcode);
		Select selcountry = new Select(Country);
		selcountry.selectByVisibleText(country);
		
	}
	
	public void EnterUserInformation(String usernme, String password, String confirmpwd) {
		Username.sendKeys(usernme);
		Password.sendKeys(password);
		Confirmpwd.sendKeys(confirmpwd);
		
	}
	
	public void ClickOnSubmitButton() {
		Submitbutton.click();
	}
	
	
	
}
