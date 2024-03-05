package Logintc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;



public class ApachePOIlogin {
	
	
	public void readExcel() throws IOException  {
		FileInputStream xl = new FileInputStream("C:\\Users\\yuvaraj.murugesan\\Downloads\\TestData.xlsx");
Workbook wrkbook = new HSSFWorkbook(xl);		
HSSFSheet sheet =  (HSSFSheet) wrkbook.getSheetAt(0);
Iterator<Row>rowiterator=sheet.iterator();
while(rowiterator.hasNext()) {
	Row rowvalue=rowiterator.next();

Iterator<Cell>columnIterator=rowvalue.iterator();
while(columnIterator.hasNext()){
	Cell cellvalue = columnIterator.next();
	System.out.println(cellvalue);
	
	
}}


 
	}
		

	public static void main(String[] args) throws IOException {
		ApachePOIlogin usingpoi = new ApachePOIlogin();
		usingpoi.readExcel();
	}

}
