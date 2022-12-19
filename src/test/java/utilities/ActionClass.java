 package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseClass;

    
public class ActionClass extends BaseClass {
	
	public static void getActionclass(WebElement elm) {
		
		Actions obj = new Actions(Driver);
		obj.click(elm).build().perform();
		    
	}

		
	       public static boolean getverify(String Expected,String Actual) {
	    	Assert.assertEquals(Expected, Actual);  
	    	if(Expected.equalsIgnoreCase(Actual)) {
	    		System.out.println("expected and actual are same");
	    	}else 
	    	{
	    		System.out.println("Result are not verified");
	    	}
	    	   
			return true;
	    	   
	    	   
	       }
		}


