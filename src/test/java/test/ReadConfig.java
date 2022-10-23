package test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	public 	Properties pro ;
	
	public ReadConfig() {
		
		
		
		File src = new File ("./configuration/config.properties");
		try {
			FileInputStream fi = new FileInputStream(src);
			
			 pro = new Properties();
			pro.load(fi);
		}catch(Exception e) {
			System.out.println("exception is "+e.getMessage());
		}
	}
	public String geturl() {
		
		String url=pro.getProperty("baseUrl");
		return url;
	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
