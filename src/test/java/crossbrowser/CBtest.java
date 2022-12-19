package crossbrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class CBtest {
    WebDriver Driver;
	
  
    @Parameters ({"Browser"})
    @BeforeTest
	public void setup(String Browser) {
		
		if (Browser.equalsIgnoreCase("chrome")) {
			       WebDriverManager.chromedriver().setup();
			         Driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("edge")) {
		       WebDriverManager.edgedriver().setup();
		         Driver = new EdgeDriver();{
			System.out.println("no statement"); }
		}
	}
		@Test
		
		public void test1() {
			Driver.get("https://in.search.yahoo.com/?fr2=inr");
			System.out.println();
			}
			
		
	@Test
	
		public void test2() {
			Driver.get("https://www.google.com/");
			System.out.println();
			}
				
		    
		
	
}
