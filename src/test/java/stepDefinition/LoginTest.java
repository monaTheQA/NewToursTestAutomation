package stepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.ReservationPage;
import Pages.LoginPage;
import utils.ExcelUtil;
import utils.ExcelUtility;

public class LoginTest extends BasePage {
	
	public LoginPage loginpage;
	
	public ReservationPage reservation;
	public String username;
	public String password;


	
	@Test(priority=4)
	public void goToLoginPage() {
		loginpage=new LoginPage(getDriver());
	}
	
	
	
	@Test(priority = 5)
	public void verifyLoginPageTitle() {
		String title = loginpage.getLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority=6)
	public void gotTohomepage() {
		
		loginpage.gotoHomePage();
		
	}
	
	/*@Test(priority = 2)
	public void gotoRigisterationPage() {
		loginpage.ClickOnRegisterLink();
	}*/
	
	
	@Test(priority = 7)
	public void loginUser() {
		
		
		//String adminuser = property.getProperty("adminusername");
		//String password = property.getProperty("adminpassword");
		//String username =testdataMap.get("UserName");
		//System.out.println(username);
		//String password=testdataMap.get("Password");
		loginpage.Login("mercury", "mercury");
		/*reservation = new ReservationPage(driver);
		String title = reservation.getReservationPageTitle();
		System.out.println("hello" + title);
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");*/
		
	}
	
	
	
	
	

	
	/*@AfterSuite
	public void CloseWindows() {
		driver.quit();
	}*/

}
