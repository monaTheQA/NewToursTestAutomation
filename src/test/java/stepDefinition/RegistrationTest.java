package stepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BasePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.ReservationPage;
import utils.ExcelUtil;

public class RegistrationTest extends BasePage{
	
	public RegisterPage registerPage;
	public LoginPage loginpage;
	private Properties prop;
	public WebDriver driver;

	//public ReservationPage reservation;
	//public String username;
	//public String password;

	
	@BeforeSuite
	public void setUp() throws Exception {
		prop = init_properties();
		driver = init_driver(prop.getProperty("browser"));
		registerPage = new RegisterPage(driver);
		//loginpage  = new LoginPage(driver);
		//excelreader  = new ExcelUtility(scenarioName, sheetName);		
		/*username = ExcelUtil.getCellData(1, 1); 
		password = ExcelUtil.getCellData(1, 2);
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(ExcelUtil.getCellData(2, 1));
	    System.out.println(ExcelUtil.getCellData(3, 2));*/
		
		
	
	}
	
	
	
	@Test(priority=0)
	public void verifyHomepageTitle() {
		
		String Title= registerPage.getHomePageTitle();
		Assert.assertEquals(Title, "Welcome: Mercury Tours");
	}
	
	@Test(priority=1)
	public void registerUser() {
		
		registerPage.goToRegisterPage();
	}
	
	
	@Test(priority=2)
	public void verifyregiserpageTitle() {
		String title=registerPage.getRegisterPageTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
	}
	
	@Test(priority=3)
	public void EnterUSerDetails() {
		registerPage.EnterContactInformation("test1", "test2", "6787654567", "mercury1@test.com");
		registerPage.EnterMailingInformation("Noida 123", "Noida", "Uttar Pradesh", "67666", "UNITED STATES");
		registerPage.EnterUserInformation("test123", "test123", "test123");
		registerPage.ClickOnSubmitButton();
	}
	
	
	
	

}
