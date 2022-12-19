package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
            
@CucumberOptions (
		
		          plugin = {"pretty","json:Target/cucumber.json"},
		          features = {"feature"},
		          glue = {"fb.stepdefinitions"},
		          tags = "@Sanity",
		          monochrome = true
		)




public class MyRunner extends AbstractTestNGCucumberTests {

}
