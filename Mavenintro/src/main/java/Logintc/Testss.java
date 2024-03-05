package Logintc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj.murugesan\\Pictures\\Saved Pictures\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
dew.sendKeys("Admin");
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys("admin1235");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
