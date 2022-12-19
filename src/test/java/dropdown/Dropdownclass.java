package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

              
public class Dropdownclass {
	static WebDriver Driver;
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	Driver = new EdgeDriver();
	Driver.get("https://www.wikipedia.org/");
	   Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		
		Select select = new Select(Driver.findElement(By.id("searchLanguage")));
		    select.selectByVisibleText("हिन्दी");
		
//   list<webelement> elm =  Driver.findElement(By.id("searchLanguage")
		    
                //	for(Webelement value:elm)	{    
//		          if(text.getvalue
//		    
//		    }
//		    
//		    
//		    
//		    
//		    
//		    
//		    
//		    
//		    
//		    
}

  
    
}