package test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	ReadConfig r = new ReadConfig();

public static Logger logger ;
	public String baseURL=r.geturl();
	public String username =r.getusername();
	public String password =r.getpassword();
public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		 logger = LogManager.getLogger(TC_loging_001.class) ;
		 if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",r.getchromepath());
		driver= new ChromeDriver();
		 }else {
			 System.out.println("no good ");
		 }
		 driver.get(baseURL);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
  
}