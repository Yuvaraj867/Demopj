package FileReadd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

	public static void main(String[] args) throws IOException {
     String Locate = "UsingFileOutputpathStream.txt";
     FileReader filereader = new FileReader(Locate);
     BufferedReader reader = new BufferedReader(filereader);
     String line;
     while((line=reader.readLine())!=null) {
    	 System.out.println(line);
     }
     
	}

}
