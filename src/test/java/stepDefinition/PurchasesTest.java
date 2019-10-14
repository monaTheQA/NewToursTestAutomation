package stepDefinition;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.LoginPage;
import Pages.PurchasePage;
import Pages.Reservation2Page;

public class PurchasesTest extends BasePage{
	
	public PurchasePage purchasePage;
	public LoginPage loginpage;
	
	
	@Test(priority = 15)
	public void goToPurchasesPage() {
		purchasePage = new PurchasePage(getDriver());
	}
	
	@Test(priority = 16)
	public void passengerDetail() {
		purchasePage.enterPassengerDetail("Ganesh", "Kumar", "Hindu");
	}
	
	@Test(priority = 17)
	public void creditCardDetail() {
		purchasePage.enterCreditCardDetail("Visa", "678765654", "05", "2009", "Ganesh", "Kumar", "Sinha");
	}
	
	@Test(priority = 18)
	public void billingAddress() {
		purchasePage.enterBillingAddress("INA", "Solna", "Stockholm", "12244", "UNITED STATES");
	}

	@Test(priority = 19)
	public void deliveryAddress() {
		purchasePage.enterDeliveryAddress("INA", "Solna", "Stockholm", "12244", "UNITED STATES");
	}
	
	@Test(priority = 20)
	public void secureButton() {
		purchasePage.clickSecurePurchasesButton();
	}
	
	@Test(priority=21)
	public void gotTohomepage() {
		loginpage = new LoginPage(driver);
		loginpage.gotoHomePage();
		
	}
	
}
