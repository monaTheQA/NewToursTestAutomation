package stepDefinition;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.PurchasePage;
import Pages.Reservation2Page;

public class PurchasesTest extends BasePage{
	
	public PurchasePage purchasePage;
	
	@Test(priority = 10)
	public void goToPurchasesPage() {
		purchasePage = new PurchasePage(getDriver());
	}
	
	@Test(priority = 11)
	public void passengerDetail() {
		purchasePage.enterPassengerDetail("Ganesh", "Kumar", "Hindu");
	}
	
	@Test(priority = 12)
	public void creditCardDetail() {
		purchasePage.enterCreditCardDetail("Visa", "678765654", "05", "2009", "Ganesh", "Kumar", "Sinha");
	}
	
	@Test(priority = 13)
	public void billingAddress() {
		purchasePage.enterBillingAddress("INA", "Solna", "Stockholm", "12244", "UNITED STATES");
	}

	@Test(priority = 14)
	public void deliveryAddress() {
		purchasePage.enterDeliveryAddress("INA", "Solna", "Stockholm", "12244", "UNITED STATES");
	}
	
	@Test(priority = 15)
	public void secureButton() {
		purchasePage.clickSecurePurchasesButton();
	}
	
}
