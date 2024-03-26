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

	public void readExcelfile(String location) throws IOException {
		file = new FileInputStream(location);

		workbook = new XSSFWorkbook(file);

		sheet = workbook.getSheet("Sheet1");

	}

	public String getValuesFromExcel(int row,int column) {
		cell = sheet.getRow(row).getCell(column);
		String Cellvalue = cell.getStringCellValue();
		System.out.println(Cellvalue);
		return Cellvalue;

	}
}
