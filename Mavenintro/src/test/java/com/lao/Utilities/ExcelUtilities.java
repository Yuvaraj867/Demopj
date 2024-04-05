package com.lao.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	public static String LocatorColumnValue;
	public static String LocatorName;
	public static String LocatorValue;
	public static String KeywordColumnValue;
	public static String DataColumnValue;
	
	public void readExcelfile(String location) throws IOException {
		file = new FileInputStream(location);

		workbook = new XSSFWorkbook(file);

		sheet = workbook.getSheet("Sheet1");

	}

	public void getlocatorsKeywordsAndData(int row,int locatorColumn,int KeyWordColumn,int DataColumn) {
		/*
		 * cell = sheet.getRow(row).getCell(column); String Cellvalue =
		 * cell.getStringCellValue(); System.out.println(Cellvalue); return Cellvalue;
		 */
		
		LocatorColumnValue =sheet.getRow(row).getCell(locatorColumn).toString().trim();
		//System.out.println(LocatorColumnValue);
		if (!LocatorColumnValue.contains("NA")) {
			
			LocatorName =LocatorColumnValue.split("=")[0].toString().trim();
			LocatorValue =	LocatorColumnValue.split("=")[1].toString().trim();
		} else {
			LocatorName="NA";
			LocatorValue="NA";
		}
		
		
		System.out.println(LocatorName + " : " +     LocatorValue);
		KeywordColumnValue = sheet.getRow(row).getCell(KeyWordColumn).toString().trim();
		DataColumnValue = sheet.getRow(row).getCell(DataColumn).toString().trim();
		
		System.out.println(LocatorName + " : " + LocatorValue + " Keyword: " +KeywordColumnValue + " Data: " +DataColumnValue );

	}
	
	                            
}
