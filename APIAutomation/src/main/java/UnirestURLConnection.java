import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class UnirestURLConnection {
	
	public void GETExample() throws UnirestException {
	HttpResponse<JsonNode> jsonconnect=	Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
	System.out.println("for status code  " +jsonconnect.getStatus());
	System.out.println("for status message "+jsonconnect.getStatusText());
	System.out.println("For body" +jsonconnect.getBody());
	
	}
	
	public void POSTExample() throws UnirestException {
		HttpResponse<JsonNode> jsonconnect=	Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"yuvaraj\",\"salary\":\"1234\",\"age\":\"29\"}").asJson();
		System.out.println("for status code  " +jsonconnect.getStatus());
		System.out.println("for status message "+jsonconnect.getStatusText());
		System.out.println("For body" +jsonconnect.getBody());
	}
	
	public void PUTExample() throws UnirestException {
		HttpResponse<JsonNode> jsonconnect=	Unirest.put("https://reqres.in/api/users/update/215").body("{\r\n"
				+ "    \"name\": \"morpheus13254\",\r\n"
				+ "    \"job\": \"leader213264\"\r\n"
				+ "}").asJson();
		System.out.println("for status code  " +jsonconnect.getStatus());
		System.out.println("for status message "+jsonconnect.getStatusText());
		System.out.println("For body" +jsonconnect.getBody());
	}
	
	public void DELETEExample() throws UnirestException {
		HttpResponse<JsonNode> jsonconnect=	Unirest.delete("https://reqres.in/api/users/delete/215").asJson();
		System.out.println("for status code  " +jsonconnect.getStatus());
		System.out.println("for status message "+jsonconnect.getStatusText());
		System.out.println("For body" +jsonconnect.getBody());
	}
	
	

	public static void main(String[] args) throws UnirestException {
		UnirestURLConnection connect1 = new UnirestURLConnection();
		//connect1.GETExample();
		//connect1.POSTExample();
		//connect1.PUTExample();
		connect1.DELETEExample();

	}

}
