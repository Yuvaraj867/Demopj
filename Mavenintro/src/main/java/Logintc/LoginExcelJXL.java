package Logintc;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginExcelJXL {
	String [][]	data=null;
	WebDriver driver;
	

			
			@DataProvider(name="getdata")
			public String[][] dataaprd() throws BiffException, IOException {
				data = Detdata();
				return data;
				 
				
			}
			public String[][] Detdata() throws BiffException, IOException {
				FileInputStream excel = new FileInputStream("C:\\Users\\yuvaraj.murugesan\\Downloads\\TestData.xls");
				Workbook book = Workbook.getWorkbook(excel);
				Sheet sheet = book.getSheet(0);
				int rowc = sheet.getRows();
				System.out.println("row " +rowc);
				int Columnc = sheet.getColumns();
				System.out.println("column " +Columnc);
				String tesstData[][]= new String[rowc-1][Columnc];
				for(int i=1;i<rowc;i++) {
					for(int j=0;j<Columnc;j++) {
					tesstData[i-1][j]=sheet.getCell(j,i).getContents();	
					}
					
				}
				return tesstData;
			}
			@BeforeTest
			public void beforetest() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

				 driver = new ChromeDriver();
			}
			
			
			@Test(dataProvider="getdata")
			public void BothWRG(String USname,String PWD) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				WebElement swrt = driver.findElement(By.name("username"));
				swrt.sendKeys(USname);
				WebElement deq = driver.findElement(By.name("password"));
				deq.sendKeys(PWD);
				driver.findElement(By.xpath("//button[@type='submit']")).click();}
			
				@AfterTest
				public void aftertest() {
					driver.close();
				}


}
