package AmericanAirlinespages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmericanAirlinesbase.AmericanAirlinesbase;


public class Homepage extends AmericanAirlinesbase {
	
	@FindBy(xpath="//a[@id='log-in-button']")
	WebElement loginButton;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle(){
		
		
	return driver.getTitle();
		
		//if(title.contains("American Airlines") ){
			//System.out.println("AAHomepage");
		//}
	}

	public Loginpage2 clickLoginButton() throws InterruptedException {
	
	loginButton.click();
		return new Loginpage2();
	}
	
	// public static void main(String[] args) {
	  // Homepage hp= new Homepage();
	   //hp.verifyHomepageTitle();
	   //hp.clickLoginButton();
		}

	 
