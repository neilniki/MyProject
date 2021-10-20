package AmericanAirlinesbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import AmericanAirlinespages.Homepage;
import AmericanAirlinespages.Loginpage;



public class AmericanAirlinesbase {
	
	public static WebDriver driver;
	public static Properties prop;
	

	
	
	public AmericanAirlinesbase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\config\\config.properties");
		//	C:\Users\post2\eclipse-workspace\Venu2\AmericanAirlinesProject\src\main\java\config\config.properties
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\post2\\Downloads\\chromedriver_93\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}


	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String s = prop.getProperty("url");
	System.out.println(s);
	
    driver.get(prop.getProperty("url"));
    
	}
    
 // public static void main(String[] args) throws InterruptedException {
	  
	
		
   //  AmericanAirlinesbase aa = new AmericanAirlinesbase();
     //initialization();
     //Homepage homepg= new Homepage();
     //homepg.verifyHomepageTitle();
     //homepg.clickLoginButton();
     //Loginpage lp = new Loginpage();
     //lp.validateLoginpageTitle();
     //lp.login(prop.getProperty("username"), prop.getProperty("lastname"), prop.getProperty("password"));
     
     
     
	//}
}
