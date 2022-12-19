package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class Waithelper extends BaseClass {

	
	public static void getwait(WebElement elm) {
		
		WebDriverWait wait = new WebDriverWait(Driver,10);
		wait.until(ExpectedConditions.visibilityOf(elm));
	}
}
