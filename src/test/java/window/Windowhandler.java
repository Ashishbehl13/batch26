package window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandler {
           static WebDriver Driver;
	public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
	    Driver = new EdgeDriver();
	   Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.salesforce.com/in/");
		Driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Set<String> wh = Driver.getWindowHandles();
		              Iterator<String> iterator = wh.iterator();
		    String parentwindow =   iterator.next();   
		    String childwindow =   iterator.next(); 
		              Driver.switchTo().window(childwindow);
		              
		              Driver.findElement(By.name("UserFirstName")).sendKeys("Ashish");
		              
		              Driver.switchTo().window(parentwindow);
	}
}




