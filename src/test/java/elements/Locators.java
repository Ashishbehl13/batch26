package elements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class Locators extends BaseClass   {

	
	
	public Locators() {
		PageFactory.initElements(Driver, this);
	}
	
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement getusername;


	public WebElement getusername() {
		return getusername;
	}
	
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"pass\"]")
	private WebElement getpassword;


	public WebElement getpassword() {
		return getpassword;
	}
	
	@CacheLookup
	@FindBy(xpath= "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	private WebElement clicklogin;


	public WebElement getlogin() {
		return clicklogin;
	}
	
	@CacheLookup
	@FindBy(xpath= "//*[text()='Share everyday moments with friends and family.']")
	private WebElement verifyresult;


	public WebElement getverify() {
		return verifyresult;
	}
	
	
	
	
	public  void getusernameandpassword(String Username, String Password) {
		
		      getusername.sendKeys(Username);
		      getpassword.sendKeys(Password);
	}
	    
	
}
