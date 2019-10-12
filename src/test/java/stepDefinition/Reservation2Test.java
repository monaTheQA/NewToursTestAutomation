package stepDefinition;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.Reservation2Page;
import Pages.ReservationPage;

public class Reservation2Test extends BasePage{

	public Reservation2Page reservation2Page;
	
	@Test(priority = 7)
	public void goToRegervation2Page() {
		reservation2Page = new Reservation2Page(getDriver());
	}
	
	@Test(priority = 8)
	public void FlightesDetails() {
		reservation2Page.selectFlight();
		
	}
	@Test(priority = 9)
	public void Continue2() {
		reservation2Page.ClickContinueButton();
	}
}
