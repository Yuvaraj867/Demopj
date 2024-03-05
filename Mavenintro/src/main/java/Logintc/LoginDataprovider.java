package Logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataprovider {
String [][]	valueone={
		{"Admin","admin1234"},
		{"admin","admin123"},
		{"asd","wer"},
		{"Admin","admin123"}
	};

		
		@DataProvider(name="getdata")
		public String[][] dataaprd() {
			return valueone;
			 
			
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
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.quit();

	}

}
