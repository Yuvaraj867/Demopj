package FileReadd;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class UsingFilewriter {

	public static void main(String[] args)   {
		String location = "Using.txt";
		String Contents = "get ";
		//Using file writer and buffer writer
		try { FileWriter filess = new FileWriter(location); filess.write(Contents);
			  BufferedWriter buffer = new BufferedWriter(filess); 
		  buffer.write(Contents);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		  
//		 
		//using fileoutputstream
		/*
		 * FileOutputStream files1 = new FileOutputStream(location); byte[]write23 =
		 * Contents.getBytes(); files1.write(write23);
		 */
		
	
		//using path
 //Path path = Paths.get(location);
 //Files.write(path, Contents.getBytes());
 
 
		
		
		

	}

}
