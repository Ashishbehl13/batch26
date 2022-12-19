package fb.stepdefinitions;










import base.BaseClass;
import elements.Locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ActionClass;
import utilities.Waithelper;
        
public class Login_Steps extends BaseClass{
                Locators  PF;
	
	
	
	@Given(": user able to open any browser")
	public void user_able_to_open_any_browser() throws Exception {
	        log.info(" user able to open any browser");
		BaseClass.setup();
	          PF = new Locators();
	    
	}
	
	@And(": user able to open {string} url")
	public void user_able_to_open_url(String url) throws Exception {
		 log.info(" user able to open {string} url"); 
		Driver.get(prop.getProperty("url"));
	    
	}

	@And(": user able to enter the valid username and password")
	public void user_able_to_enter_the_valid_username_and_password() {
		log.info(" user able to enter the valid username and password");
	     PF.getusernameandpassword(prop.getProperty("Username"), prop.getProperty("Password"));
	    
	}
	
	@When(": user able to click the log in")
	public void user_able_to_click_the_log_in() {
		log.info(" user able to click the log in");
		   Waithelper.getwait(PF.getlogin());
		ActionClass.getActionclass(PF.getlogin());
	 
	    
	}
	
	@Then(": user able to enter the page and {string} verify the information on the grid")
	public void user_able_to_enter_the_page_and_verify_the_information_on_the_grid(String text) {
		        
		ActionClass.getverify(text, PF.getverify().getText());
	    
	}
}
