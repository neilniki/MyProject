package AmericanAirlinespages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmericanAirlinesbase.AmericanAirlinesbase;


public class Loginpage2 extends AmericanAirlinesbase {
	
	@FindBy(name="loginId")
	WebElement username;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="_button_login")
	WebElement loginbutton;
	
	public Loginpage2(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginpageTitle(){
		return driver.getTitle();
		//String lg = driver.getTitle();
		//if(lg.contains("AmericanAirlines")) {
			//System.out.println("aaLoginpage");
						
		//}
		
	}
	
	public Homepage login(String un, String ln, String pwd) throws InterruptedException{
		username.sendKeys(un);
		lastname.sendKeys(ln);
		password.sendKeys(pwd);
		Thread.sleep(5000);
	loginbutton.click();
	
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginbutton);
		    	Thread.sleep(3000);
		    	
		    	
		return new Homepage();
		
	}
	

}
