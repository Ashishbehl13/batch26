package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
      public static WebDriver Driver;
      public static FileReader fr;
      public static Logger    log;
 
      public static Properties prop = new Properties();
      
	public BaseClass() {
	log =	Logger.getLogger("QA Ashish Behl");
		PropertyConfigurator.configure("log4j.properties");
	
	}
    
	public static void setup() throws IOException {
		        
		
		
	  // user.dir will tell the whole path where config.properties file is located in system.
			 fr= new FileReader(System.getProperty("user.dir") + "/src/test/resources/configfiles/congif.properties"); 
			 prop = new Properties();
			   prop.load(fr);
		
			   String  browsername= prop.getProperty("browsername");
		     if (browsername.equalsIgnoreCase("chrome")) {
		    	WebDriverManager.chromedriver().setup();
		    	    Driver = new ChromeDriver();
		    	    
		    	    
		    }
	
		    else if (browsername.equalsIgnoreCase("edge")) {
		    	WebDriverManager.edgedriver().setup();
		    	    Driver = new EdgeDriver();
		    	   Driver.manage().window().maximize();
		    		Driver.manage().deleteAllCookies();}
		  
	}
    
	     public static void Teardown() {
	    	 
	    	 
	     }
}
