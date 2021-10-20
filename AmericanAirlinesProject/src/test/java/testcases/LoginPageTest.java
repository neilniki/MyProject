package testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmericanAirlinesbase.AmericanAirlinesbase;
import AmericanAirlinespages.Homepage;
import AmericanAirlinespages.Loginpage2;
//import AmericanAirlinespages.Loginpage;


public class LoginPageTest extends AmericanAirlinesbase {
	Loginpage2 loginpage;
	Homepage homepage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new Loginpage2();
		homepage = new Homepage();

	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginpage.validateLoginpageTitle();
		Assert.assertEquals(title, "American Airlines - Airline tickets and cheap flights at aa.com");
	}
	
	@Test(priority=2)
	public void verifyloginButtonTest() throws InterruptedException{
		loginpage = homepage.clickLoginButton();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("lastname"),prop.getProperty("password"));		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	

}
}
