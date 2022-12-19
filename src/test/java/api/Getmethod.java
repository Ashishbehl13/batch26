package api;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.annotations.Test;


public class Getmethod {
	
	@Test
	public void Test1() {
		 
		          given().
		              get("https://dummy.restapiexample.com/api/v1/employee/1").
		                  then().log().all();
		          int statuscode = get().statusCode();
		          Assert.assertEquals(statuscode, 200);
		
		
	}
}
