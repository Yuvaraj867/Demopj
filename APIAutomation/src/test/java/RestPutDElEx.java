import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RestPutDElEx {
	@Test
	public void putt() {
		JSONObject json1 = new JSONObject();
		json1.put("name", "yuv");
		json1.put("job", "test");
		System.out.println(json1.toString());
		baseURI="https://reqres.in/api/";
		
		
		given()
		.when()
		.header("","")
		.body(json1.toJSONString())
		.put("/users/2")
		.then()
		.statusCode(200);
		
	}
	@Test
	public void del1() {
baseURI="https://reqres.in/api/";
		
		
		given()
		.when()
		.header("","")
		
		.delete("/users/2")
		.then()
		.statusCode(204);
		
	}

}
