package test;

import org.testng.annotations.Test;

import page.LogingPage;

public class TC_loging_001  extends BaseClass{
	
	 
	
	
@Test
public void loging() {
	
	LogingPage l= new LogingPage(driver); 
	logger.info("url open");
	l.setusername(username);
	logger.info("username provided");
	l.setpassword(password);
	logger.info("password provided");
	 
	l.clicbtn(); 
}
	

}
