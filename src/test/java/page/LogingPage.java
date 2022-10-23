package page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingPage {
	public WebDriver ldriver;
	
	public LogingPage(WebDriver rdriver) {
		
	ldriver=rdriver;
	PageFactory.initElements(ldriver,this );
		
	}
	@FindBy(id="email")
	WebElement username;
	
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement clickbtn;
	
	public void setusername(String uname) {
		
		username.sendKeys(uname);
	}
		public void setpassword(String pwd) {
			
			password.sendKeys(pwd);
		}
			
			public void clicbtn() {
				
				clickbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
