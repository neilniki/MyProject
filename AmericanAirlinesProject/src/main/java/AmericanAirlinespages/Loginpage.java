package AmericanAirlinespages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AmericanAirlinesbase.AmericanAirlinesbase;


public class Loginpage extends AmericanAirlinesbase {
	
	@FindBy(name="loginId")
	WebElement username;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="_button_login")
	WebElement loginbutton;
	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public String validateLoginpageTitle(){
		return driver.getTitle();
		//String lg = driver.getTitle();
		//if(lg.contains("AmericanAirlines")) {
			//System.out.println("aaLoginpage");
						
		//}
		
	}
	@Test
	public Homepage login(String un, String ln, String pwd) throws InterruptedException{
		username.sendKeys(un);
		lastname.sendKeys(ln);
		password.sendKeys(pwd);
		Thread.sleep(5000);
	loginbutton.click();
	
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginbutton);
		    	
		return new Homepage();
	}
	

}
