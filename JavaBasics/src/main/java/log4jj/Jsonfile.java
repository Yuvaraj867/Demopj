package log4jj;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Jsonfile {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "Yuvi");
		jsonobject.put("Age", "1");
		
		JSONArray array = new JSONArray();
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		
		jsonobject.put("Numbers", array);
		
		FileWriter file = new FileWriter("name.json");
		file.write(jsonobject.toJSONString());
		file.close();
		

	}

}
