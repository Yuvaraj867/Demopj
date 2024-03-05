package SeleniumQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBuild {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dew = driver.findElement(By.xpath("//input[@placeholder='Username']"));
dew.sendKeys("Admin");
		WebElement swe = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		swe.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
		  Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yuvi");
		   driver.findElement(By.xpath("//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']//following::span[1]")).click();		

		   driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		   driver.findElement(By.xpath("//div[text()='American']")).click();
		    driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

	

}}
