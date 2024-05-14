package Utiliss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lao.pageobjects.DirectoryPage;
import com.lao.pageobjects.Homepage;
import com.lao.pageobjects.Login_page;

import Constants.Constatine;
import WEBDRIVER_Manager.DriverManager;

public class CommonUtilis {
	
	private static CommonUtilis commonutilisinstance=null;
	
	private CommonUtilis() {
		
	}
	
	
	
	public static CommonUtilis getCommonutilisinstance() {
		if(commonutilisinstance==null) {
			commonutilisinstance=new CommonUtilis();
			
		}
		return commonutilisinstance;
	}
	
	
	
		public void loadProperties() throws IOException {
        

        // Load Excel file
        FileInputStream file = new FileInputStream(new File("D:\\\\testing document\\\\TestData12.xls"));
        HSSFWorkbook workbook = new HSSFWorkbook(file);
        HSSFSheet sheet = workbook.getSheetAt(0);

      int rowCount = sheet.getLastRowNum();
     int columnCount = sheet.getRow(0).getLastCellNum();

     // Create a 2D array to store test data
     String[][] testData = new String[rowCount][columnCount];

     // Iterate over rows and columns to populate the test data array
     for (int i = 1; i <= rowCount; i++) {
         for (int j = 0; j < columnCount; j++) {
             testData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
         }
     }

     // Iterate over test data to perform login actions
     for (int i = 0; i < rowCount; i++) {
        {
            // Get URL, username, and password from Excel
        	Constatine.BROWSER  = testData[i][0];
            Constatine.Appurl = testData[i][1];
            Constatine.USERNAME = testData[i][2];
            Constatine.PASSWORD = testData[i][3];
            
        }}}
            
            



	
	/*
	 * public void loadProperties() {
	 * 
	 * Properties properties = new Properties();
	 * 
	 * try {
	 * properties.load(getClass().getResourceAsStream("/configure.properties"));
	 * 
	 * } catch (Exception e) { // TODO: handle exception } Constatine.Appurl=
	 * 
	 * properties.getProperty("APPURL"); Constatine.BROWSER=
	 * properties.getProperty("Browser"); Constatine.USERNAME=
	 * properties.getProperty("Username"); Constatine.PASSWORD=
	 * properties.getProperty("Password");
	 * 
	 * }
	 */
	 
		
	public void intelements() {
		PageFactory.initElements(DriverManager.getDriver(), Login_page.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Homepage.getInst());
		PageFactory.initElements(DriverManager.getDriver(), DirectoryPage.getInstance());
		
	}
		
	public void takescreenshot()  {

		  TakesScreenshot screenimg = (TakesScreenshot)DriverManager.getDriver();
		  File filess =screenimg.getScreenshotAs(OutputType.FILE); 
		  try {
			  FileUtils.copyFile(filess, new File("screenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
	
	}
	  
	public void hihlightelement(WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');",element);
		 
	}
	
	public void selectdropdown (WebElement Dropdown,String howto ,String value) {
		Select select = new Select(Dropdown);
		
		switch (howto) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "text":
			select.selectByIndex(Integer.parseInt(value));
			break;
			
			

		default:
			break;
		}
	}



		
	}
		
		
	
	
	


