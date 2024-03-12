import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RESTPOSTEX {
	@Test
	public void restpost() {
		JSONObject json = new JSONObject();
		json.put("name", "yuva");
		json.put("job", "hp");
		System.out.println(json.toString());
		RestAssured.baseURI="https://reqres.in/api/";
		
		RestAssured
		.given()
		.header("","")
		.body(json.toJSONString())
		.post("/users")
		.then()
		.statusCode(201);
		
		
		
		
		
	}

}
