package testcases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AmericanAirlinesbase.AmericanAirlinesbase;
import AmericanAirlinespages.Homepage;
import AmericanAirlinespages.Loginpage;
//import com.aa.local.AmericanAirlinespages.Loginpage;
import AmericanAirlinespages.Loginpage2;



public class HomePageTest extends AmericanAirlinesbase {
	
	Loginpage2 loginpage;
	 Homepage homepage;
	
	public HomePageTest() {
		super();
	}
		
		@BeforeMethod
		public void setUp() throws InterruptedException {
			initialization();
			loginpage = new Loginpage2();
			homepage = new Homepage();
		//	Homepage homepage = new Homepage();
		//	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("lastname"), prop.getProperty("password"));
		}
		
		@Test
		public void verifyHomePageTitleTest() throws InterruptedException{	
		
			String homePageTitle = homepage.verifyHomepageTitle();
			Assert.assertEquals(homePageTitle, "American Airlines - Airline tickets and cheap flights at aa.com","Home page title not matched");
			System.out.println("Test1");
		}
		
		@Test
			public void verifyLoginButtonClickTest() throws InterruptedException{			
			loginpage = homepage.clickLoginButton();
			System.out.println("Test2");
				
			}
		
			@AfterMethod
			public void tearDown(){
				driver.quit();
			}
		}
	


