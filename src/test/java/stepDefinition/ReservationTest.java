package stepDefinition;

import org.testng.annotations.Test;

import Base.BasePage;
import Pages.LoginPage;
import Pages.ReservationPage;

public class ReservationTest extends BasePage {

	public ReservationPage reservationPage;
	
	@Test(priority = 8)
	public void goToRegistrationPage() {
		reservationPage=new ReservationPage(getDriver());
	}
	
	@Test(priority = 9)
	public void selectFlightDetails() {
		reservationPage.EnterFlightDetails("1", "London", "January", "10", "Portland", "August", "15");
	}
	
	@Test(priority = 10)
	public void selectPreferenceDetails() {
		reservationPage.EnterPreferenceDetails("Unified Airlines");
	}
	
	@Test(priority = 11)
	public void ClickContinue() {
		reservationPage.ClickOnContinueButton();
	}
}
	

	