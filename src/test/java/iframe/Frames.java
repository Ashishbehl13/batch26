package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	static WebDriver Driver;

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		Driver = new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
	
		
		
	Driver.switchTo().frame(0);
		    Driver.findElement(By.xpath("/html/body/p[1]/a")).click();
	Driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
	}

	
	
	
	
	
	
	
	
	
	
}
