package base;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.basic;

import beans.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.TestProperties;

public class APIBase {
	
	public static User user;
	public static ContentType contentType=ContentType.JSON;
	public Response response;
	
	/**
	 * Constructor to set the base values like BaseURI
	 */
	public APIBase() {
		baseURI=TestProperties.getProperties("baseURL");
		String userName=TestProperties.getProperties("username");
		String password=TestProperties.getProperties("password");
		authentication=basic(userName, password);
	}
	public void validateResponseCode(int expectedStatusCode) {
		response.then().assertThat().
		statusCode(expectedStatusCode);
	}
}
