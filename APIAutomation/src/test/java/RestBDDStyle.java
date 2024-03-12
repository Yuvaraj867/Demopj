import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;

public class RestBDDStyle {
	

	public void GetreqEX() {
		Response getresponse=	RestAssured.get("https://reqres.in/api/users/2");
		//response.Body();
	ResponseBody response1=	getresponse.body();
	System.out.println(response1.asString());
	System.out.println(response1.asPrettyString());

}
@Test
public void GetreqEX2() {
	RestAssured.baseURI="https://reqres.in/api/";
RestAssured
.given()
	.param("", "")
	.header("","")
.when()
  .get("/users/3")
 .then()
   .statusCode(200);


}


}
