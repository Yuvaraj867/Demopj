import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpurlconnectionEX {
	
	public void getex() throws IOException{
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");// to get url
	HttpURLConnection connect = (HttpURLConnection) url.openConnection();// to get connection
	connect.setRequestMethod("GET");// to get method
	connect.connect();// to get connect

	int code = connect.getResponseCode();// to get response code
	System.out.println("Response code is " + code);

	String message = connect.getResponseMessage();// to get response message
	System.out.println("Response message is " + message);

	InputStream inputstream = connect.getInputStream();// to print the result via input stream
	InputStreamReader reader = new InputStreamReader(inputstream);
	BufferedReader buffer = new BufferedReader(reader);
	String line;
	StringBuffer bufered = new StringBuffer();// use to make it perform line by line
	while ((line = buffer.readLine()) != null) {
		bufered.append(line);
	}
	System.out.println("Print the line " + bufered);
}
	
	
	
	public void postex() throws IOException {
		URL url1 = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection) url1.openConnection();
		connection.setRequestMethod("POST");
		
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\"name\":\"yuvi\",\"salary\":\"1234\",\"age\":\"29\"}";
		byte[] inputJson=jsonbody.getBytes();
		
		OutputStream output =connection.getOutputStream();
		output.write(inputJson);
		
		int code = connection.getResponseCode();// to get response code
		System.out.println("Response code is " + code);

		String message = connection.getResponseMessage();// to get response message
		System.out.println("Response message is " + message);

		InputStream inputstream = connection.getInputStream();// to print the result via input stream
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader buffer = new BufferedReader(reader);
		String line;
		StringBuffer bufered = new StringBuffer();// use to make it perform line by line
		while ((line = buffer.readLine()) != null) {
			bufered.append(line);
			
		}
		System.out.println("Print the line " + bufered);
		
	}
	
	public void PUTex() throws IOException {
		URL url1 = new URL("https://reqres.in/api/users/update/64");
		HttpURLConnection connection=(HttpURLConnection) url1.openConnection();
		connection.setRequestMethod("PUT");
		
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\r\n"
				+ "    \"name\": \"morpheus1325\",\r\n"
				+ "    \"job\": \"leader21326\"\r\n"
				+ "}";
		byte[] inputJson=jsonbody.getBytes();
		
		OutputStream output =connection.getOutputStream();
		output.write(inputJson);
		
		int code = connection.getResponseCode();// to get response code
		System.out.println("Response code is " + code);

		String message = connection.getResponseMessage();// to get response message
		System.out.println("Response message is " + message);

		InputStream inputstream = connection.getInputStream();// to print the result via inputstream
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader buffer = new BufferedReader(reader);
		String line;
		StringBuffer bufered = new StringBuffer();// use to make it perform line by line
		while ((line = buffer.readLine()) != null) {
			bufered.append(line);
			
		}
		System.out.println("Print the line " + bufered);
		
	}
	public void DELEX() throws IOException {
	URL url1 = new URL("https://reqres.in/api/users/delete/64");
	HttpURLConnection connection=(HttpURLConnection) url1.openConnection();
	connection.setRequestMethod("DELETE");
	connection.connect();
	
	/*
	 * connection.setRequestProperty("Content-Type", "application/json");
	 * connection.setDoOutput(true);
	 */
	
	
	
	int code = connection.getResponseCode();// to get response code
	System.out.println("Response code is " + code);

	String message = connection.getResponseMessage();// to get response message
	System.out.println("Response message is " + message);

	InputStream inputstream = connection.getInputStream();// to print the result via inputstream
	InputStreamReader reader = new InputStreamReader(inputstream);
	BufferedReader buffer = new BufferedReader(reader);
	String line;
	StringBuffer bufered = new StringBuffer();// use to make it perform line by line
	while ((line = buffer.readLine()) != null) {
		bufered.append(line);
		
	}
	System.out.println("Print the line " + bufered);
	
}
	
	
	
	
	

	public static void main(String[] args) throws IOException    {
		HttpurlconnectionEX get1 = new HttpurlconnectionEX();
		//get1.postex();
		//get1.getex();
		//get1.PUTex();
		get1.DELEX();
}}
