import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class ValidateAPI {
	@Test
	public void validateapi() {
		get("https://reqres.in/api/users/2").then().body("first_name",equalTo("Janet"));
	}
	@Test
	public void validateapi2() {//decimal we should add f
		get("https://reqres.in/api/users/2").then().body("id",equalTo(2));
	}
	@Test
	public void validateapi3() {// to check entries 
		get("https://reqres.in/api/users/2").then().body("data",hasSize(2));
}
	@Test
	public void validateapi4() {// to check time 
		get("https://reqres.in/api/users/2").then().time(lessThan(1L),TimeUnit.SECONDS);

		}
	@Test
	public void validateapi5() {
		Response getresponse =	get("https://reqres.in/api/users/2");
		System.out.println("result " + getresponse.asPrettyString());
	
}}
