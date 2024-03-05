package log4jj;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonfileReader {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparcer = new JSONParser();
		FileReader filereader = new FileReader("name.json");
		Object parsedObject = jsonparcer.parse(filereader);
		JSONObject jsonobject = (JSONObject) parsedObject;
		String name = (String) jsonobject.get("Name");
		Object ageObject = jsonobject.get("Age");

		JSONArray array = (JSONArray) jsonobject.get("Numbers");

		Iterator iterator = array.iterator();
		System.out.println("get name: " + name);
		System.out.println("get number: " + ageObject);
		while (iterator.hasNext()) {
			System.out.println("print array " + iterator.next());
		}
		
		
		

	}

}
