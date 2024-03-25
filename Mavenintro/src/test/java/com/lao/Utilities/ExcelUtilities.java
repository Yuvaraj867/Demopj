package com.lao.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	public void readExcel() throws IOException {
		
		FileInputStream file = new FileInputStream("src/test/resources/TestDataCore.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFCell cell = sheet.getRow(2).getCell(1);
		String Cellvalue= cell.getStringCellValue();
		System.out.println(Cellvalue);
		
	}
	
	public static void main (String[] args) throws IOException {
		ExcelUtilities result = new ExcelUtilities();
		result.readExcel();
		
	}
}
