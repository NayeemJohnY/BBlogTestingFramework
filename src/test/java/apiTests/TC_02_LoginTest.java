package apiTests;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.APIBase;
import utils.APIUtils;
import utils.TestProperties;

public class TC_02_LoginTest extends APIBase {
	/**
	 * This method to set the values before the test executes
	 * This method will set the base path 
	 */
	@BeforeMethod
	public void setValuesBeforeTest() {
		basePath=TestProperties.getProperties("login");
	}
	
	@Test(testName = "TC_02_User Login")
	public void useLoginTest() {
		String payload=APIUtils.serializeJavatoJson(user).toString();
		response=given().log().all().contentType(contentType).body(payload).post();
		validateResponseCode(200);
	}

}
