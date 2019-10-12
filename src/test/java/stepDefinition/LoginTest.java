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

public class LoginTest extends BasePage {
	
	public LoginPage loginpage;
	private Properties prop;
	public WebDriver driver;
	public ReservationPage reservation;
	public String username;
	public String password;

	
	@BeforeSuite
	public void setUp() throws Exception {
		prop = init_properties();
		driver = init_driver(prop.getProperty("browser"));
		//loginpage  = new LoginPage(driver);
		//excelreader  = new ExcelUtility(scenarioName, sheetName);		
		username = ExcelUtil.getCellData(1, 1); 
		password = ExcelUtil.getCellData(1, 2);
	    System.out.println(username);
	    System.out.println(password);
	    System.out.println(ExcelUtil.getCellData(2, 1));
	    System.out.println(ExcelUtil.getCellData(3, 2));
		
		
	
	}
	
	  /* @BeforeSuite
	   @Parameters({"scenario", "sheet"})
	    public void before_suite(@Optional("login")String scenario, @Optional("Sheet1") String sheet) throws Exception
	    {
	        prop = init_properties();
	        System.out.println("I am in BeforeSuite1"+sheet);
			driver = init_driver(prop.getProperty("browser"));
			System.out.println("I am in BeforeSuite2"+sheet);
			Write(scenario, sheet);
			//excelreader  = new ExcelUtility(scenario, sheet);
			String user=NewExcelUtility.getCellData(2, 2);
			
			System.out.println("I am in BeforeSuite3"+user);
	    }*/
	
	@Test(priority=0)
	public void goToLoginPage() {
		loginpage=new LoginPage(getDriver());
	}
	
	/*public void Write(String nm, String nm1) {
		
		System.out.println("I am in "+nm);
		System.out.println("I am in22222 "+nm1);
		
	}*/
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
		String title = loginpage.getLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority = 2)
	public void loginUser() {
		//String adminuser = property.getProperty("adminusername");
		//String password = property.getProperty("adminpassword");
		//String username =testdataMap.get("UserName");
		//System.out.println(username);
		//String password=testdataMap.get("Password");
		loginpage.Login(username, password);
		reservation = new ReservationPage(driver);
		String title = reservation.getReservationPageTitle();
		System.out.println("hello" + title);
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		
	}
	
	
	
	
	

	
	/*@AfterSuite
	public void CloseWindows() {
		driver.quit();
	}*/

}
