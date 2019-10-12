package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class Reservation2Page extends BasePage {
	
	@FindBy(xpath="//input[@name='outFlight' and @value='Blue Skies Airlines$360$270$5:03']")
	private WebElement Depart;
	
	@FindBy(xpath="//input[@name='inFlight' and @value='Blue Skies Airlines$630$270$12:23']")
	private WebElement Return;
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement ContinueButton;
	
	public Reservation2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectFlight() {
		Depart.isSelected();
		Return.isSelected();
	}
	
	public void ClickContinueButton() {
		ContinueButton.click();
	}

}
