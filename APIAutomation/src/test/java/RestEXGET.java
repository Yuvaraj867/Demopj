import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestEXGET {
	@Test
	public void GetreqEX() {
	Response getresponse=	RestAssured.get("https://reqres.in/api/users/2");
	//response.Body();
ResponseBody response1=	getresponse.getBody();
System.out.println(response1.asString());
System.out.println(response1.asPrettyString());

	
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Response response =RestAssured.get("https://www.google.co.in/");
 int statuscod =response.statusCode();
  String statusline =response.statusLine();
  
  System.out.println("Status code is "+statuscod);
  System.out.println("Status line is "+statusline);
  RestEXGET get3 = new RestEXGET();
  get3.GetreqEX();
  
	}

}
