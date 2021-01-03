package apiTests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import base.APIBase;
import utils.APIUtils;
import utils.TestProperties;

public class TC_01_User_Registration extends APIBase{
	/**
	 * This method to set the values before the test executes
	 * This method will set the base path 
	 */
	@BeforeMethod
	public void setValuesBeforeTest() {
		basePath=TestProperties.getProperties("register_User");
	}
	
	@Test(testName = "TC_01_User Registration")
	public void userRegistrationTest() {
		user=APIUtils.getRandomUser();
		String payload=APIUtils.serializeJavatoJson(user).toString();
		response=given().contentType(contentType).body(payload).post();
		validateResponseCode(200);
	}
	


}
