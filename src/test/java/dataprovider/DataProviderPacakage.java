package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPacakage {
      static WebDriver driver;
  
      @Test(dataProvider = "Register")
      public static void getlogin(String username, String Password) {
	  WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/"); 
	       driver.findElement(By.id("email")).sendKeys(username);
	       driver.findElement(By.id("pass")).sendKeys(Password);
	       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	       
	     }
      
      
      @DataProvider (name ="Register")
      public Object[][] getdata()
      {       return new Object[][] {
    	  {"ashishbehl3@outlook.com","Livefast91$"},
    	  {"ashishbehl23@gmail.com","Livefastigo"}
    	  
    	  
      };
    	  
    	                                                    }
      
      
      
      
      
}
