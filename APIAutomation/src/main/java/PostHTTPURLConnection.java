import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostHTTPURLConnection {

	public static void main(String[] args) throws IOException {
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
	}


